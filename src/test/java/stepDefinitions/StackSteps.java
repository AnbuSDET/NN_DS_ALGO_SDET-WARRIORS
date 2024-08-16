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
		public void the_user_should_be_redirected_to_the_Operations_page() 
		{
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Redirecting to the OPerations Page.....");
			boolean OP_URL=stp.check_StOperationsPage();
			Assert.assertEquals(OP_URL, true);
			logger.info("Operations page is displayed.........");
		}
		
		//--------------------Validating try here button in Operations module------------
		
		@Given("The user is in the StackOperationspage")
		public void the_user_is_in_the_stackoperationspage()
		{
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Clicking the Operations page link.....");
			stp.click_Operations();
			
		}
		@When("The user clicks the Try here button in the StackOperationspage")
		public void the_user_clicks_the_try_here_button_in_the_stackoperationspage() {
		 
			StackPage stp=new StackPage(BaseClass.getDriver());
		  stp.click_TryHereBtn();
		  logger.info("Clicking the try here of operations page........");
		}

		@Given("The user is in the try editor page of the StackOperationspage")
		public void the_user_is_in_the_try_editor_page_of_the_stackoperationspage() {
			
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("the Try editor of Operations page link.....");
			stp.click_Operations();
			stp.click_TryHereBtn();
			
		}
		
		//-------------Validating Stacks Implementation Page----------------
		
		@When("The user clicks Implementations tab in the Stackpage")
		public void the_user_clicks_Implementations_tab_in_the_Stackpage() 
		{
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Clicking the Implementations page link.....");
			stp.click_Implementations();
			}

		@Then("The user should be redirected to the Implementations Page")
		public void the_user_should_be_redirected_to_the_Implementations_page() 
		{
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Redirecting to the Implementations Page.....");
			boolean OP_URL=stp.check_StImplementationsPage();
			Assert.assertEquals(OP_URL, true);
			logger.info("Implementations page is displayed.........");
		}
		
		//--------------------Validating try here button in implementations module------------
		
		@Given("The user is in the StackImplementationspage")
		public void the_user_is_in_the_StackImplementationspage()
		{
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Clicking the Implementations page link.....");
			stp.click_Implementations();
			
		}
		@When("The user clicks the Try here button in the StackImplementationspage")
		public void the_user_clicks_the_try_here_button_in_the_stackimplementationspage() {
		 
			StackPage stp=new StackPage(BaseClass.getDriver());
		  stp.click_TryHereBtn();
		  logger.info("clicking the try here of implementations page............");
		}

		@Given("The user is in the try editor page of the StackImplementationspage")
		public void the_user_is_in_the_try_editor_page_of_the_stackimplementationspage() {
			
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("the try editor of  the Implementations page link.....");
			stp.click_Implementations();
			stp.click_TryHereBtn();
			
		}
		
//---------------------Validating applications page-----------------------
		
		@When("The user clicks Applications tab in the Stackpage")
		public void the_user_clicks_applications_tab_in_the_stackpage() {
		    
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Clicking the APplications page link.....");
			stp.click_Applications();
			
		}

		@Then("The user should be redirected to the Applications Page")
		public void the_user_should_be_redirected_to_the_applications_page() {
			
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("Redirecting to the Applications Page.....");
			boolean OP_URL=stp.check_StApplicationsPage();
			Assert.assertEquals(OP_URL, true);
			logger.info("Applications page is displayed.........");
		
		   }
//-----------------------Validating try here button------------------------
		
		@Given("The user is in the StackApplicationspage")
		public void the_user_is_in_the_stack_applicationspage() {
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("User is in the APplications page link.....");
			stp.click_Applications();
			
		   }

		@When("The user clicks the Try here button in the StackApplicationspage")
		public void the_user_clicks_the_try_here_button_in_the_stack_applicationspage() {
		   
			StackPage stp=new StackPage(BaseClass.getDriver());
			  stp.click_TryHereBtn();
			  logger.info("clicking the try here of applications page............");
			
		}

		@Given("The user is in the try editor page of the StackApplicationspage")
		public void the_user_is_in_the_try_editor_page_of_the_stack_applicationspage() {
		   
			StackPage stp=new StackPage(BaseClass.getDriver());
			logger.info("the try editor of  the Applications page link.....");
			stp.click_Applications();
			stp.click_TryHereBtn();
			
		
		}

	//	@Given ("The user is in the Stack Operations page after successful login") 
		

	
}
