package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GetStartedPage;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class HomePageSteps {
	WebDriver driver;
	Properties p;
	Logger logger = BaseClass.getLogger();
	
	
	@Given("User clicks the Sign In link")
	public void user_clicks_the_sign_in_link() {
		logger.info("Clicking the Sign In Link at home page.............");
		HomePage hp =new HomePage(BaseClass.getDriver());
		hp.clickSigIn();
	}
	
	@Then("You are logged in message should be displayed")
	public void you_are_logged_in_message_should_be_displayed() {
		logger.info("Verify the display of 'You are logged in' message at home page.............");
		HomePage hp =new HomePage(BaseClass.getDriver());
		boolean display = hp.YouAreLoggedInMsg();	 
		Assert.assertTrue(display);
	}
	
	@When("User clicks Get Started Button of Data Structures at Home page")
	public void user_clicks_get_started_button_of_data_structures_at_home_page() {
		logger.info("Clicking the GetStarted Button at home page.............");
		HomePage hp = new HomePage(BaseClass.getDriver());
		hp.clickDataStrucGetStarted();
	}
	
	
	@Then("You are not logged in error message is displayed")
	public void you_are_not_logged_in_error_message_is_displayed() {
		logger.info("Check the display of 'You are notlogged in' error message.............");
		HomePage hp = new HomePage(BaseClass.getDriver());
		boolean status = hp.NotLoggedInErrorMsg();
		Assert.assertTrue(status);
	}
	
	@Given("User clicks the Register link at home page")
	public void user_clicks_the_register_link_at_home_page() {
		logger.info("User clicks Register link at home page.............");
		HomePage hp = new HomePage(BaseClass.getDriver());
		hp.clickRegisterLink();
	}
	
	
}
