package stepDefinitions;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Factory.BaseClass;
import Factory.BaseClass;
import Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class HooksCrossBrowser {
	ThreadLocal<WebDriver> driver;
	Properties p;
	
	//------------------FOR CROSS BROWSER TESTING-----------------

	//@Before
	public void setup() throws Throwable
	{
		BaseClass.getLogger().info("Launch the app URL.........");
		String browser = ConfigReader.getBrowserType();
		//driver= BaseClass.initializeBrowser(browser);
	    Thread.sleep(3000);
		p= BaseClass.getProperties();
	    BaseClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		BaseClass.getDriver().get(p.getProperty("appURL"));
		//BaseClass.getDriver().manage().window().maximize();
		
		BaseClass.getLogger().info("Application launched.......");
   	}
	
	
  // @After
	public void tearDown()
	{
    	 BaseClass.getDriver().quit();
    	driver.remove();
	}
	
	
    //@AfterStep
	public void addScreenshot(Scenario scenario)
	{      
    	// this is for cucumber report
        if(scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        	            
        }
	}
	

}
