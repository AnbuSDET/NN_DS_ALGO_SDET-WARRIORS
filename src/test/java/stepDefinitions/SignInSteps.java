package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.GetStartedPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

public class SignInSteps {
	
	WebDriver driver;
	Properties p;
	Logger logger = BaseClass.getLogger();
	
	@Given("User enters valid <username> at Login page")
	public void user_enters_valid_username_at_login_page() {
		logger.info("Enter the username at login page.............");
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		 sp.enterUsername("Testing");		
	}

	@Given("User enters valid <password> at Login page")
	public void user_enters_valid_password_at_login_page() {
		logger.info("Enter the password at login page.............");
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		 sp.enterpassword("Password@143");
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
		logger.info("click the Login Button.............");
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		sp.clickLogin();
	}
	
	@Given("User moves to home page after login to application")
	public void user_moves_to_home_page_after_login_to_application() {
	    logger.info("User clicks the GetStarted Button at start page and clicks the Sign In.. ");
	    GetStartedPage gsp = new GetStartedPage(BaseClass.getDriver());
		gsp.clickGetStartedSP();
		HomePage hp =new HomePage(BaseClass.getDriver());
		hp.clickSigIn();	
		logger.info("User login with valid username and password..........");
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		 sp.enterUsername("Testing");
		 sp.enterpassword("Password@143");
		 sp.clickLogin();
	}

	

}
