package stepDefinitions;

import java.util.Properties;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
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
	
	@When("Click Get Started button of {string} topic login")
	public void click_get_started_button_of_topic_login(String topic) {
		logger.info("Clicking the GetStarted Button at home page.............");
		HomePage hp = new HomePage(BaseClass.getDriver());
		switch (topic)
		{
		case "DataStructure": hp.clickDataStrucGetStarted();break;
		case "Array":hp.clickArrayGetStarted();break;
		case"Linked List": hp.clickLinkedListGetStarted();break;
		case "Stack":hp.clickStackGetStarted();break;
		case "Queue":hp.clickQueueGetStarted();break;
		case "Tree":hp.clickTreeGetStarted();break;
		case "Graph":hp.clickQueueGetStarted();break;
		default: System.out.println("Unable to find this topic....");break;		
		}
	}
	
		
	@Then("The {string} page should be displayed")
	public void the_page_should_be_displayed(String topic) {
		logger.info("Verify that the "+topic+" page is displayed............");
		HomePage hp = new HomePage(BaseClass.getDriver());
		boolean status = false;
		switch (topic)
		{
		case "DataStructure":status = hp.checkDS_Intro_PageDisplay();Assert.assertTrue(status);break;
		case "Array":status = hp.checkArrayPageDisplay();Assert.assertTrue(status);break; 
		case"Linked List": status = hp.checkLinkedListPageDisplay();Assert.assertTrue(status);break;
		case "Stack":status = hp.checkStackPageDisplay();Assert.assertTrue(status);break;
		case "Queue":status = hp.checkQueuePageDisplay();Assert.assertTrue(status);break;
		case "Tree":status = hp.checkTreePageDisplay();Assert.assertTrue(status);break;
		case "Graph":hp.checkGraphPageDisplay();Assert.assertTrue(status);break;
		default: System.out.println("Unable to find the page....");Assert.assertTrue(status);break;
		}
		
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
