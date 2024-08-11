package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import pageObjects.SignInPage;

public class RegisterSteps {
	WebDriver driver;
	Properties p;
	Logger logger = BaseClass.getLogger();
	String myUsername = BaseClass.randomAlphaNumeric();
	
	@Given("User provides valid username {string} password {string} and password confirmation {string} details at register page")
	public void user_provides_valid_username_password_and_password_confirmation_details_at_register_page(String user, String pwd, String pwdConfirm) {
		   logger.info("User enters all details to register a new user....");
		   RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		   rp.enterUsername(myUsername);
		   pwd = BaseClass.randomAlphaNumeric();
		   rp.enterPassword(pwd);
		   rp.enterPasswordConfirm(pwd);		
	}
	
	@Given("User provides NEW username {string} and an ALREADY existing {string} and {string} details")
	public void user_provides_new_username_and_an_already_existing_and_details(String string, String string2, String string3) throws IOException, InterruptedException {
		logger.info("User Registers a NEW username with already EXISTING password....");
		   p = BaseClass.getProperties();
		   RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		   rp.enterUsername(BaseClass.randomAlphaNumeric());
		   rp.enterPassword(p.getProperty("password"));
		   rp.enterPasswordConfirm(p.getProperty("password"));
	}
	
	
	@When("User clicks the Register button")
	public void user_clicks_the_register_button() {
		  logger.info("User clicks Register button....");
		   RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		   rp.clickRegister();
	}
	
	@Then("New Account Created message is displayed at home page")
	public void new_account_created_message_is_displayed_at_home_page() {
		  logger.info("Check 'New Account Created' message at home page....");
		  HomePage hp = new HomePage(BaseClass.getDriver());
		  boolean status = hp.checkNewAccCreatedMsg();
		  Assert.assertTrue(status);
	}
	
	@Then("User should be signed in with newly registered username link")
	public void user_should_be_signed_in_with_newly_registered_username_link() {
		  logger.info("Check name displayed in Username link at home page....");
		  HomePage hp = new HomePage(BaseClass.getDriver());
		  String NameDisplayed = hp.getUsernameAtLinkHomepage();
		  if(NameDisplayed.equalsIgnoreCase(myUsername))
			  {
				  Assert.assertTrue(true);
			  }
		  else {
			  Assert.assertTrue(false);
		  }		 
	}
	
	
	@Then("Register page should be displayed")
	public void register_page_should_be_displayed() {
	    logger.info("Verify the display of register page....");
	    RegisterPage rp = new RegisterPage(BaseClass.getDriver());
	    boolean display = rp.RegisterBtnDisplay();
	    Assert.assertTrue(display);
	}
		
	@Given("User provides valid username {string} but different password {string} and password confirmation {string} details")
	public void user_provides_valid_username_but_different_password_and_password_confirmation_details(String user, String pwd1, String pwd2)  {
		  logger.info("Provides valid username but different password and password confirmation data ....");
		  RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		  rp.enterUsername(BaseClass.randomAlphaNumeric());
		  rp.enterPassword(BaseClass.randomAlphaNumeric());
		  rp.enterPasswordConfirm(BaseClass.randomAlphaNumeric());		
	}

	@Then("Error message stating password mismatch should be displayed")
	public void error_message_stating_password_mismatch_should_be_displayed() {
		  logger.info("Error message stating password mismatch should be displayed....");
		  RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		  boolean display = rp.pwdMismatchErrMsgDisplay();
		  Assert.assertTrue(display);
	}
	
	@Given("User provides EXISTING username {string} but valid password {string} and password confirmation {string} details")
	public void user_provides_existing_username_but_valid_password_and_password_confirmation_details(String string, String string2, String string3) throws IOException {
		  logger.info("Provides EXISTING username with valid password and password confirmation data ...."); 
		  RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		  p=BaseClass.getProperties();
		  rp.enterUsername(p.getProperty("username"));
		  String pwd = BaseClass.randomAlphaNumeric();
		  rp.enterPassword(pwd);
		  rp.enterPasswordConfirm(pwd);
	}

	@Then("Error message stating username already exists should be displayed")
	public void error_message_stating_username_already_exists_should_be_displayed() {
		  logger.info("Verify the display of Error message stating username already exists...."); 
		  RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		  String WrongMsg = "password_mismatch:The two password fields didn’t match.";
		  String ActualErrMsg = rp.getTextPwdMismatchErrMsg();
		  System.out.println("The actual error message received is:"+ActualErrMsg);
		  
		  if (ActualErrMsg.equalsIgnoreCase(WrongMsg))
			  {
				  Assert.assertTrue(false);
			  }
		  else
			  {
				  Assert.assertTrue(true);
			  }
	    
	}
	
	@Given("User provides valid username {string} but unaccepted password {string} data")
	public void user_provides_valid_username_but_unaccepted_password_data(String user, String pswd) throws IOException {
		  logger.info("Provides valid username but an INVALID password to register ...."); 
		  RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		  rp.enterUsername(user);
		  String pwd = RandomStringUtils.randomAlphabetic(5);
		  rp.enterPassword(pwd);
		  rp.enterPasswordConfirm(pwd);
	}

	@Then("Error message stating password setting rules should be displayed")
	public void error_message_stating_password_setting_rules_should_be_displayed() {
		 logger.info("Verify the error message pointing improper password given ...."); 
		  RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		  String WrongMsg = "password_mismatch:The two password fields didn’t match.";
		  String ActualErrMsg = rp.getTextPwdMismatchErrMsg();
		  System.out.println("The actual error message received is:"+ActualErrMsg);
		  
		  if (ActualErrMsg.equalsIgnoreCase(WrongMsg))
			  {
				  Assert.assertTrue(false);
			  }
		  else
			  {
				  Assert.assertTrue(true);
			  }
	}
	
	@When("User clicks the Login link at the bottom of Register page")
	public void user_clicks_the_login_link_at_the_bottom_of_register_page() {
		logger.info("User clicks the Login link at the bottom of Register page...."); 
		 RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		 rp.clickLoginLinkRP();		 
	}

	@Then("Sign In page must be displayed")
	public void sign_in_page_must_be_displayed() {
		logger.info("Verify whether Sign In page gets displayed...");
		SignInPage sp = new SignInPage(BaseClass.getDriver());
		boolean display = sp.loginBtnDisplay();
		System.out.println("The login button is found:"+display);
		Assert.assertTrue(display);
	}
	
	@Given("User enters a valid username {string} and password  {string} and password confirmation {string} details")
	public void user_enters_a_valid_username_and_password_and_password_confirmation_details(String user, String pwd1, String pwd2) throws InterruptedException {
		  logger.info("Provides valid username but an INVALID password to register ...."); 
		  RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		  rp.enterUsername(user);
		  rp.enterPassword(pwd1);
		  rp.enterPasswordConfirm(pwd2);		
	}
	
	
	@Then("Validation message Please Fill Out This Field should be displayed at {string} {string} {string} missed field")
	public void validation_message_please_fill_out_this_field_should_be_displayed_at_missed_field(String user, String pwd, String pwd1) {
	 	  logger.info("Verify whether Validation message Please Fill Out This Field is displayed at missed field ...."); 
		  RegisterPage rp = new RegisterPage(BaseClass.getDriver());
		  String ExpValidationMsg = "Please fill out this field.";
		  System.out.println("The expected message is "+ExpValidationMsg);
		  String ActValidationMsg = rp.checkValidationMsgRegisterPg(user, pwd, pwd1);
		  System.out.println("The actual message is: "+ActValidationMsg);
		  if (ActValidationMsg.equalsIgnoreCase(ExpValidationMsg))
			  {
				  Assert.assertTrue(true);
			  }
		  else {
			  Assert.assertTrue(false);
			  System.out.println("The Validation message is not displayed..");
		  }
		 
	}


}
