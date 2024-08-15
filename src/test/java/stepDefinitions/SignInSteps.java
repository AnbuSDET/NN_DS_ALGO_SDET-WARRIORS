package stepDefinitions;

import java.io.IOException;
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
import pageObjects.SignInPage;

public class SignInSteps {
	
	WebDriver driver;
	Properties p;
	Logger logger = BaseClass.getLogger();
	
	@Given("User enters a valid username {string} and {string} at Login page")
	public void user_enters_a_valid_username_and_at_login_page(String username, String password) throws IOException {
		logger.info("Enter valid username and password at login page.............");
		p = BaseClass.getProperties();
		SignInPage sp = new SignInPage(BaseClass.getDriver());		
		 sp.enterUsername(p.getProperty("username"));
		 sp.enterpassword(p.getProperty("password"));
	}
	
	@Given("User enters a username {string} at Login page")
	public void user_enters_a_username_at_login_page(String user){
		logger.info("Enter the username at login page.............");
		SignInPage sp = new SignInPage(BaseClass.getDriver());		
		 sp.enterUsername(user);		
	}

	@Given("User enters a password {string} at Login page")
	public void user_enters_a_password_at_login_page(String pwd) {
		logger.info("Enter the password at login page.............");
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		 sp.enterpassword(pwd);
	}

	@When("User clicks on Login Button")
	public void user_clicks_on_login_button() {
		logger.info("click the Login Button.............");
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		sp.clickLogin();
	}
	
	@Then("Username should be displayed as a link at the home page")
	public void username_should_be_displayed_as_a_link_at_the_home_page() {
		logger.info("Check name displayed in Username link at home page....");
		  HomePage hp = new HomePage(BaseClass.getDriver());
		  String NameDisplayed = hp.getUsernameAtLinkHomepage();
		  System.out.println("Username given at Homepage: "+p.getProperty("username"));
		  System.out.println("Username displayed at Homepage: "+NameDisplayed);
		  if(NameDisplayed.equalsIgnoreCase(p.getProperty("username")))
			  {
				  Assert.assertTrue(true);
			  }
		  else {
			  Assert.assertTrue(false);
		  }		 
	}
	
	@Then("Invalid Username and Password error message should be displayed")
	public void invalid_username_and_password_error_message_should_be_displayed() {
		logger.info("Verify the display of Invalid Username and password error message....");
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		boolean display = sp.InvalidUsrNamePwdErrorMsg();
		Assert.assertTrue(display);
	}
	
	@Then("Please fill out this field warning message should be displayed at {string} username or {string} password field")
	public void please_fill_out_this_field_warning_message_should_be_displayed_at_username_or_password_field(String user, String pwd) {
	   logger.info("Verify whether Validation message Please Fill Out This Field is displayed at missed field ...."); 
		  SignInPage rp = new SignInPage(BaseClass.getDriver());
		  String ExpValidationMsg = "Please fill out this field.";
		  System.out.println("The expected message is "+ExpValidationMsg);
		  String ActValidationMsg = rp.checkValidationMsgRegisterPg(user, pwd);
		  System.out.println("The actual message is: "+ActValidationMsg);
		  if (ActValidationMsg.equalsIgnoreCase(ExpValidationMsg))
			  {
				  Assert.assertTrue(true);
			  }
		  else
		     {
			  Assert.assertTrue(false);
			  System.out.println("The Validation message is not displayed..");
		     }
	}
	
		
	@Given("User moves to home page after login to application")
	public void user_moves_to_home_page_after_login_to_application() throws IOException {
	    logger.info("User clicks the GetStarted Button at start page and clicks the Sign In.. ");
	    GetStartedPage gsp = new GetStartedPage(BaseClass.getDriver());
		gsp.clickGetStartedSP();
		HomePage hp =new HomePage(BaseClass.getDriver());
		hp.clickSigIn();	
		logger.info("User login with valid username and password..........");
		p = BaseClass.getProperties();
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		 sp.enterUsername(p.getProperty("username"));
		 sp.enterpassword(p.getProperty("password"));
		 sp.clickLogin();
	}
	
	@When("User clicks Register link at the Sign In page")
	public void user_clicks_register_link_at_the_sign_in_page() {
		logger.info("Clicking the Register Link at Sign In page....");
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		sp.clickRegister();		
	}
	
	@Given("User sign in to the app with valid username {string} and {string}")
	public void user_sign_in_to_the_app_with_valid_username_and(String user, String pwd) throws IOException {
		logger.info("User sign in to the app with valid username and password.. ");
	    HomePage hp =new HomePage(BaseClass.getDriver());
		 hp.clickSigIn();	
		 p = BaseClass.getProperties();
	   	SignInPage sp = new SignInPage(BaseClass.getDriver());
		 sp.enterUsername(p.getProperty("username"));
		 sp.enterpassword(p.getProperty("password"));
		 sp.clickLogin();
	}

	

}
