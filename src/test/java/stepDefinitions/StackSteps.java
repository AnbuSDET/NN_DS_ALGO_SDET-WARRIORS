package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.GetStartedPage;
import pageObjects.HomePage;
import pageObjects.LinkedListPage;
import pageObjects.SignInPage;
import pageObjects.StackPage;


public class StackSteps {
	
	WebDriver driver;
	Properties p;
	Logger logger=BaseClass.getLogger();
	
	@Given("clicking the get started of Stack")
	public void clicking_the_get_started_of_Stack() {
	    StackPage stp=new StackPage(BaseClass.getDriver());
	    stp.click_StGetStarted();
	}
 	
	@Given("The user is in the Stack page after successful login")
	public void the_user_is_in_the_stack_page_after_successful_login() 
	{
		 StackPage stp=new StackPage(BaseClass.getDriver());
		logger.info("Redirecting to the Stack Home Page.....");
		boolean stHome_URL=stp.check_StHomePage();
		Assert.assertEquals(stHome_URL, true);
		logger.info("Stack Home page is displayed");
	
	}
	
	//----------------1.Validating Stack OperationsModule---------------

		@When("The user clicks Operations tab in the Stackpage")
		public void the_user_clicks_Operations_tab_in_the_Stackpage() 
		{
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Clicking the Operations page link.....");
			stp.click_Operations();
			}

		@Then("The user should be redirected to the Operations Page")
		public void the_user_should_be_redirected_to_the_introduction_page() 
		{
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Redirecting to the OPerations Page.....");
			boolean OP_URL=stp.check_StOperationsPage();
			Assert.assertEquals(OP_URL, true);
			logger.info("Operations page is displayed.........");
		}
		
		//--------------------Validating try here button in Operations module------------
		
		@Given("The user is in the StackOperationspage")
		public void the_user_is_in_the_StackOperationspage()
		{
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Clicking the Operations page link.....");
			stp.click_Operations();
			
		}
		@When("The user clicks the Try here button in the StackOperationspage")
		public void the_user_clicks_the_try_here_button_in_the_StackOperationspage() {
		 
			StackPage stp=new StackPage(BaseClass.getDriver());
		  stp.click_TryHereBtn();;
		}

		@Given("The user is in the try editor page of the StackOperationspage")
		public void the_user_is_in_the_try_editor_page_of_the_StackOperationspage() {
			
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Clicking the Operations page link.....");
			stp.click_Operations();
			stp.click_TryHereBtn();
			
		}
		
	
}
