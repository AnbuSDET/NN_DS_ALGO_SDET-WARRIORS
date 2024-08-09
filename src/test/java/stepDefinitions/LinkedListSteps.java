 package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;

public class LinkedListSteps {
	
	WebDriver driver;
	Properties p;
	Logger logger=BaseClass.getLogger();
	
	@Given("Getstarted clicked")
	public void getstarted_clicked() {
		System.out.println("");
	    }

	@Given("Sign in to the application with valid username and password")
	public void sign_in_to_the_application_with_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("clicking the get started of linked list")
	public void clicking_the_get_started_of_linked_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the LinkedList page after successful login")
	public void the_user_is_in_the_linked_list_page_after_successful_login() {
		System.out.println("The user is in the LinkedList page after successful login");
			}

	@When("The user clicks Introduction tab in the page")
	public void the_user_clicks_introduction_tab_in_the_page() {
		LinkedListPage lp=new LinkedListPage(BaseClass.driver);
		logger.info("The user clicks Introduction tab in the LinkedList page ");
		lp.clickIntroduction();
		}

	@Then("The user should be redirected to the Introduction Page")
	public void the_user_should_be_redirected_to_the_introduction_page() {
		System.out.println("The user should be redirected to the Introduction Page");
	   }
	
	@When("The user clicks the TryHere button int the LinkedList Page")
	public void the_user_clicks_the_try_here_button_int_the_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a page having the online editor console with {string} button")
	public void the_user_should_be_redirected_to_a_page_having_the_online_editor_console_with_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user enters valid python code and press Run button")
	public void the_user_enters_valid_python_code_and_press_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should see the code getting executed and output is displayed")
	public void the_user_should_see_the_code_getting_executed_and_output_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
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