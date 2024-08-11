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
import pageObjects.GetStartedPage;
import pageObjects.HomePage;
import pageObjects.LinkedListPage;
import pageObjects.SignInPage;

public class LinkedListSteps {
	
	WebDriver driver;
	Properties p;
	Logger logger=BaseClass.getLogger();
	
	@Given("User move to home page after login to application")
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

	
	@Given("clicking the get started of linked list")
	public void clicking_the_get_started_of_linked_list() {
	    LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
	    lp.click_LLGetStarted();
	}

	@Given("The user is in the LinkedList page after successful login")
	public void the_user_is_in_the_linked_list_page_after_successful_login() 
	{
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Redirecting to the LL Home Page.....");
		boolean LLHome_URL=lp.check_LLHomePage();
		Assert.assertEquals(LLHome_URL, true);
		logger.info("LinkedList Home page is displayed");
	
	}

	@When("The user clicks Introduction tab in the page")
	public void the_user_clicks_introduction_tab_in_the_page() 
	{
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Clicking the introduction page link.....");
		lp.click_Introduction();
		}

	@Then("The user should be redirected to the Introduction Page")
	public void the_user_should_be_redirected_to_the_introduction_page() 
	{
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Redirecting to the Introduction Page.....");
		boolean Intro_URL=lp.check_IntroductionPage();
		Assert.assertEquals(Intro_URL, true);
		logger.info("Introduction page is displayed");
	}
	
	@Given("The user is in the Linked List Introduction Page")
	public void the_user_is_int_the_Linked_List_Introduction_Page()
	{
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Clicking the introduction page link.....");
		lp.click_Introduction();
		
	}
	
	@When("The user clicks the TryHere button int the LinkedList Page")
	public void the_user_clicks_the_try_here_button_int_the_linked_list_page() {
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Clicking the TryHere button in the Introduction Page.....");
		lp.click_TryHereBtn();
		logger.info("TryHere button is clicked......");
	  	}

	@Then("The user should be redirected to a page having the online editor console with run button")
	public void the_user_should_be_redirected_to_a_page_having_the_online_editor_console_with_button() {
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Redirecting to the Online editor console Page.....");
		boolean try_editor_URL=lp.check_TryEditorPage();
		Assert.assertEquals(try_editor_URL, true);
		logger.info("Try editor page is displayed..............");
		
	}
	
	@Given("The user is in the try editor page of the LinkedList Introduction module")
	public void user_in_tryEditorpage_of_the_introductionModule_ofLinkedList()
	{
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Clicking the introduction page link.....");
		lp.click_Introduction();
		logger.info("Clicking the TryHere button in the Introduction Page.....");
		lp.click_TryHereBtn();
		logger.info("TryHere button is clicked......");
	  	
	}

	@When("The user enters valid python code and press Run button")
	public void the_user_enters_valid_python_code_and_press_run_button() {
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user is in tryeditor page");
		lp.enter_Valid_PythonCode();
		logger.info("user entered valid python code");
	}

	@Then("The user should see the code getting executed and output is displayed")
	public void the_user_should_see_the_code_getting_executed_and_output_is_displayed() {
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("code gets executed");
		lp.check_valid_pythoncode();
		
	}

	@Given("The user is in the try editor page of the Linked List Introduction module")
	public void user_in_tryEditorpage_ofthe_introductionModule_ofLinkedList()
	{
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Clicking the introduction page link.....");
		lp.click_Introduction();
		logger.info("Clicking the TryHere button in the Introduction Page.....");
		lp.click_TryHereBtn();
		logger.info("TryHere button is clicked......");
	  	
	}
	@When("The user enters invalid python code and press Run button")
	public void the_user_enters_invalid_python_code_and_press_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should see the code is not executed and error message pops up")
	public void the_user_should_see_the_code_is_not_executed_and_error_message_pops_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user enters no python code and press Run button")
	public void the_user_enters_no_python_code_and_press_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should see no error message and stay in the same online editor page")
	public void the_user_should_see_no_error_message_and_stay_in_the_same_online_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}