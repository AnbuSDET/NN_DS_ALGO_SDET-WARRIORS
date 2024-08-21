package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.GetStartedPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

public class DataStructureSteps {
	
	WebDriver driver;
	Properties p;
	Logger logger = BaseClass.getLogger();
	
	
	//   Background Steps for Login //

	@Given("The User is in the Home page after clicking the Get started button")
	public void the_user_is_in_the_home_page_after_clicking_the_get_started_button() {

		GetStartedPage sp = new GetStartedPage(BaseClass.getDriver());
    	logger.info("Clicking the GetStarted Button at start page.............");
	    sp.clickGetStartedSP();
	}
	
	@Then("The user clicks SignIn button in Home Page")
	public void the_user_clicks_sign_in_button_in_home_page() {
		 logger.info("Clicking the Sign In Link at home page.............");
		 HomePage hp =new HomePage(BaseClass.getDriver());
		 hp.clickSigIn();
	}
	
	@Then("The User Enters the user name in the Username field")
	public void the_user_enters_the_user_name_in_the_username_field() {
		 logger.info("Enter the username at login page.............");
		 SignInPage sp = new SignInPage(BaseClass.getDriver());
		 sp.enterUsername("Testing");
	}
	@Then("The User enters the password in the Password field")
	public void the_user_enters_the_password_in_the_password_field() {
		 logger.info("Enter the password at login page.............");
		 SignInPage sp = new SignInPage(BaseClass.getDriver());
		 sp.enterpassword("Password@143");	    

	}
	@Then("The user clicks the Login button")
	public void the_user_clicks_the_login_button() {
		logger.info("click the Login Button.............");
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		sp.clickLogin();

	}
	@Then("the User should be able to login to the application")
	public void the_user_should_be_able_to_login_to_the_application() {
		
		logger.info("After clicking the Login Button .............");
		String CrntURL = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(true, CrntURL.contains("home"));
		logger.info("Logged In to DS_Introduction page........... " );
	
	}
	
	
	// DS_Introduction button 
	
	
	@Given("The user is in the home Page after logged In")
	public void the_user_is_in_the_home_page_after_logged_in() {		
		String currentURL = BaseClass.getDriver().getCurrentUrl();
		 Assert.assertEquals(true, currentURL.contains("home"));	   
	}
	@When("The user clicks the Get started button for DS Introduction tab")
	public void the_user_clicks_the_get_started_button_for_ds_introduction_tab() {
		logger.info("Clicking the Data Structures Introduction Get started button.....");		
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());		
	    ds.click_GetStartedBtn_DSIroduction();
	}
	
	@Then("The user should be Redirected to the DS Introduction Page")
	public void the_user_should_be_redirected_to_the_ds_introduction_page() {
		
	 logger.info("After clicking DS_Get started button ...........");
	 String currentURL = BaseClass.getDriver().getCurrentUrl();
	 Assert.assertEquals(true, currentURL.contains("introduction"));
		
	}
	
	
	// Time Complexity link from left panel
	
	@Given("The User is in the Time Complexity Page")
	public void the_user_is_in_the_time_complexity_page() {
		logger.info("Clicking the Time Complexity button from the left panel ........ ");
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		ds.click_GetStartedBtn_DSIroduction();		 
		ds.click_TimeComplexityBtn();		
	 
	}
	@When("The user clicks Time Complexity link in the left panel")
	public void the_user_clicks_time_complexity_link_in_the_left_panel() {
		
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		ds.click_DS_TimeComplexity_LeftPanel();
		
	}
	@Then("The user should be stayed in the same Time Complexity Page")
	public void the_user_should_be_stayed_in_the_same_time_complexity_page() {	
		
		String CurrentURL =BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(true, CurrentURL.contains("time"));
		
	}
	
	       // Python Try Editor -> Valid Codes
	
	@Given("The User in the DS-Python Try Editor page")
	public void the_user_in_the_ds_python_try_editor_page() {
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		logger.info("Clicking the Try Editor Page   ");
		ds.DS_Pyhton_Editor_Page();
	  
	}
	
	@When("The user write the Valid python code in Editor and Clicks Run button")
	public void the_user_write_the_valid_python_code_in_editor_and_clicks_run_button() throws InterruptedException {		
		
		  logger.info("Entering valid python code..........");
		  DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());	  		  
		  ds.Click_DS_PythonEditor_Runbtn_ValidCodes();
		  ds.click_DS_PythonEditor_RunBtn();  
			
		
	}
	
	@Then("The User should be able to see the output in the console")
	public void the_user_should_be_able_to_see_the_output_in_the_console() {
		
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());	
		
		ds.validate_Console_Output();        
       
        logger.info("Console output.......     " +ds.ConsoleOutput + ds.PYEditor_Code);
        
        Assert.assertEquals(true,ds.PYEditor_Code.contains(ds.ConsoleOutput) );
		 
	}

       	// Testing Try Here Page 
	
	
	@Given("The User is in the  DS_Time Complexity Page after login")
	public void the_user_is_in_the_ds_time_complexity_page_after_login() {
		
		logger.info("Clicking the Time Complexity button ..... ");
		
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		
		ds.click_GetStartedBtn_DSIroduction();		
		
		ds.click_TimeComplexityBtn();	
	
	}
	
	
	
	@When("The user clicks the Try here button in this Page")
	public void the_user_clicks_the_try_here_button_in_this_page() {
          logger.info("Clicking the TryHere Button......");
		
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		
		ds.click_DS_TimeComplexity_TryhereBtn();
	}

	@Then("The User should be redirected to Python Editor page")
	public void the_user_should_be_redirected_to_python_editor_page() {
	  
       String CurURL= BaseClass.getDriver().getCurrentUrl();
	    
	    Assert.assertEquals(true, CurURL.contains("tryEditor"));
		
	}	
	
	
	//Practice questions link 
	
	
	@Given("The User in the Time Complexity Page")
	public void the_user_in_the_time_complexity_page() {
		
		logger.info("Clicking the Time Complexity button to check the Practice queestion link .... ");
		
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		
		ds.click_GetStartedBtn_DSIroduction();	
		
		ds.click_TimeComplexityBtn();	
		
	}
	@When("The user clicks practice questions link")
	public void the_user_clicks_practice_questions_link() {
		
		logger.info("Clicking the Practice question link ..... ");
		
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		
	    ds.click_DS_PracticeQuestionsBtn();
	    
	}
	@Then("The user should be redirected to the Practice question Page")
	
	public void the_user_should_be_redirected_to_the_practice_question_page() {		
		
		String CurURL= BaseClass.getDriver().getCurrentUrl();
		
		Assert.assertEquals(true, CurURL.contains("practice"));
	}
	
	
	
	   // Python Editor -> Without Codes
	
	@Given("The User is in the DS-Python Try Editor page")
	public void the_user_is_in_the_ds_python_try_editor_page() {
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		
		ds.DS_Pyhton_Editor_Page();
	
	}
	@When("The user clicks the Run without any Codes")
	public void the_user_clicks_the_run_without_any_codes() {
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		ds.Click_DS_PythonEditor_Runbtn_WithoutCodes();
	   
	}
	@Then("The User should should be in the same page with No error message")
	public void the_user_should_should_be_in_the_same_page_with_no_error_message() {
		
		String crntURL = BaseClass.getDriver().getCurrentUrl();
		  Assert.assertEquals(true, crntURL.contains("tryEditor"));
	}
	
	// Python Editor  -> Invalid Codes
	
	@Given("The User in the DS-Python Try Editor page after clicking Try Here button")
	public void the_user_in_the_ds_python_try_editor_page_after_clicking_try_here_button() {
      DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		ds.DS_Pyhton_Editor_Page();
	}
	
	@When("The user write the InValid python code in Editor and Clicks Run button")
	
	public void the_user_write_the_in_valid_python_code_in_editor_and_clicks_run_button() {
		logger.info("User Entering invalid pythod code on the editor ..... ");
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		ds.Click_DS_PythonEditor_Runbtn_InValidCodes();
		
	}
	
	@Then("The User should be able to see error message in the pop message")
	public void the_user_should_be_able_to_see_error_message_in_the_pop_message() {
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		ds.Validate_OutputConsole_InvalidCodes();
		logger.info("Alert Message in Python Editor " + ds.Alertmesg);		
        Assert.assertEquals(true, ds.Alertmesg.contains("bad input on line 1"));
        
	}
	
	
	// Time complexity  link in the bottom of the page
	
	@Given("The User is in the DS Introduction Page after Logged In")
	public void the_user_is_in_the_ds_introduction_page_after_logged_in() {
		
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		ds.click_GetStartedBtn_DSIroduction();				
		
	}
	@When("The User clicks the Time Complexity link in the bottom of the Page")
	public void the_user_clicks_the_time_complexity_link_in_the_bottom_of_the_page() {
		
		logger.info("Clicking the Time Complexity button in the DS Introduction Page ...........");
		
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());						
		ds.click_TimeComplexityBtn();
		
	}
	@Then("The User should be Redirected to the Time Complexity Page")
	public void the_user_should_be_redirected_to_the_time_complexity_page() {		
	  
	  
	  String crntURL = BaseClass.getDriver().getCurrentUrl();
	  Assert.assertEquals(true, crntURL.contains("time"));
	  
	}
	
	
	// Testing the Sign Out button
	
	
	@Given("The user is in the DS Introduction page")
	public void the_user_is_in_the_ds_introduction_page() {
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());	
		ds.click_GetStartedBtn_DSIroduction();
	}
	@When("The user clicks the sign out button")
	public void the_user_clicks_the_sign_out_button() {
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());	
		ds.click_Signout_Btn();
	}
	@Then("The user should be signed out successfully and got error message")
	public void the_user_should_be_signed_out_successfully_and_got_error_message() {		
	
		DataStructurePage ds = new DataStructurePage(BaseClass.getDriver());
		boolean status = ds.SignOutErrorMessgae();
		Assert.assertTrue(status);
	   
	}
	
	
}
