package stepDefinitions;

import java.util.Properties;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GetStartedPage;
import pageObjects.HomePage;

public class GetStartedSteps {
	WebDriver driver;
	Properties p;
	Logger logger = BaseClass.getLogger();
	
	@When("User clicks the GetStarted Button")
	public void user_clicks_the_get_started_button() {
		GetStartedPage sp = new GetStartedPage(BaseClass.getDriver());
		logger.info("Clicking the GetStarted Button.............");
		sp.clickGetStarted();
	}
	
	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		HomePage hp = new HomePage(BaseClass.getDriver());
		logger.info("Check display of Home Page............");
		boolean status = hp.NumpyNinjaLinkDisplay();
		Assert.assertEquals(status, true);	
		logger.info("Home page is displayed");
	  }
	
	@Then("Copyright@NumpyNinja2021 is displayed at Start page")
	public void copyright_numpy_ninja2021_is_displayed_at_start_page() {
		GetStartedPage sp = new GetStartedPage(BaseClass.getDriver());
		boolean status = sp.copyrightDisplay();
		Assert.assertTrue(status);  
	}


}
