package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeSteps {

@Given("The user is logged in to the application with Valid credentials")
public void the_user_is_logged_in_to_the_application_with_valid_credentials() {
   
	GetStartedPage gsp = new GetStartedPage(BaseClass.getDriver());
	gsp.clickGetStartedSP();
	HomePage hp =new HomePage(BaseClass.getDriver());
	hp.clickSigIn();	
	logger.info("User login with valid username and password..........");
	SignInPage sp = new SignInPage(BaseClass.getDriver());
	 sp.enterUsername("Testing");
	 sp.enterpassword("Password@143");
	 sp.clickLogin();
    throw new io.cucumber.java.PendingException();
}

@When("The User clicks the Tree_Get Started button in the Home page")
public void the_user_clicks_the_tree_get_started_button_in_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user should be able to navigate to the Tree Page")
public void the_user_should_be_able_to_navigate_to_the_tree_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("The user is in the DS Introduction page")
public void the_user_is_in_the_ds_introduction_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user clicks the sign out button")
public void the_user_clicks_the_sign_out_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("The user should be signed out successfully and got error message")
public void the_user_should_be_signed_out_successfully_and_got_error_message() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
