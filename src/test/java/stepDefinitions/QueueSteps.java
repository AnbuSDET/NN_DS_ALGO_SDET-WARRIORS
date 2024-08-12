package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GetStartedPage;
import pageObjects.HomePage;
import pageObjects.QueuePage;
import pageObjects.SignInPage;

public class QueueSteps {	
	
	WebDriver driver;
	Properties p;
	Logger logger = BaseClass.getLogger();
	JavascriptExecutor jse = (JavascriptExecutor)BaseClass.getDriver();
	
	
	@Given("The user is logged in to the application with Valid credentials")
	public void the_user_is_logged_in_to_the_application_with_valid_credentials() {
		
		logger.info("Login to test the Queue Page Functionalities.........");		
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

	@When("The User clicks the Queue_Get Started button in the Home page")
	public void the_user_clicks_the_queue_get_started_button_in_the_home_page() {
		logger.info("Clicking the Queue Page After Login..........");			
		jse.executeScript("window.scrollBy(0,500)"); 
		HomePage hp = new HomePage(BaseClass.getDriver());	
		hp.clickQueueGetStarted();
		
	}

	@Then("The user should be able to navigate to the Queue Page")
	public void the_user_should_be_able_to_navigate_to_the_queue_page() {
	    String CurntURL= BaseClass.getDriver().getCurrentUrl();
	    Assert.assertEquals(CurntURL, CurntURL.contains("queue"));
		logger.info("Queue Page URL --->" + CurntURL);
	}
	
	   // Implementation of Queue Page
	
	@Given("The user is in the Queue Page")
	public void the_user_is_in_the_queue_page() {
	   
     logger.info("The user is in the Queue Page");
     String CurntURL= BaseClass.getDriver().getCurrentUrl();
     Assert.assertEquals(CurntURL, CurntURL.contains("queue"));
	}

	@When("The User clicks the Implementation of Queue in Python link  in the Queue Page")
	public void the_user_clicks_the_implementation_of_queue_in_python_link_in_the_queue_page() {
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		Qp.Click_ImplementaionOfQueue();
		
	}

	@Then("The user should be navigate to the Implementation of Queue in Python Page")
	public void the_user_should_be_navigate_to_the_implementation_of_queue_in_python_page() {
	   
		String CrtURL = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(CrtURL, CrtURL.contains(""));
	}
	
	//Implementation using collections
	
	
	@Given("The user is in the Queue Page after logged in")
	public void the_user_is_in_the_queue_page_after_logged_in() {
	   
	}

	@When("The User clicks the  Implementation using collections queue link in Queue Page")
	public void the_user_clicks_the_implementation_using_collections_queue_link_in_queue_page() {
	    
	}

	@Then("The user should be navigate to the Implementation using collections queue Page")
	public void the_user_should_be_navigate_to_the_implementation_using_collections_queue_page() {
	    
	}
	
	
	// Implementation using Array link in Queue Page
	
	@Given("The user opened the Queue Page after logged in to the application")
	public void the_user_opened_the_queue_page_after_logged_in_to_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The User clicks the Implementation using Array link in Queue Page")
	public void the_user_clicks_the_implementation_using_array_link_in_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigate to the Implementation using Array Page")
	public void the_user_should_be_navigate_to_the_implementation_using_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	// Queue Operations link in Queue Page
	
	
	@Given("The user is in the Queue Page now after logged in to the application")
	public void the_user_is_in_the_queue_page_now_after_logged_in_to_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The User clicks the  Queue Operations link in Queue Page")
	public void the_user_clicks_the_queue_operations_link_in_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigate to the Queue Operations Page")
	public void the_user_should_be_navigate_to_the_queue_operations_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	// Implementation of Queue link in the same page
	
	@Given("The user is in the  Implementation of Queue Page")
	public void the_user_is_in_the_implementation_of_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Implementation of Queue link in this Page")
	public void the_user_clicks_the_implementation_of_queue_link_in_this_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be stayed in the same page")
	public void the_user_should_be_stayed_in_the_same_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	//Implementation using collections.queue link from the left panel
	
	
	@Given("The user  in the  Implementation of Queue Page")
	public void the_user_in_the_implementation_of_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Implementation using collections.queue link from the left panel")
	public void the_user_clicks_the_implementation_using_collections_queue_link_from_the_left_panel() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigate to the  Implementation using collections.queue page from Implementation of Queue Page")
	public void the_user_should_be_navigate_to_the_implementation_using_collections_queue_page_from_implementation_of_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	// Implementation using Array link from the left panel
	
	@Given("The user is in the  Implementation of Queue Page after logged In")
	public void the_user_is_in_the_implementation_of_queue_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Implementation using Array link in this Page")
	public void the_user_clicks_the_implementation_using_array_link_in_this_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigate to the Implementation using Array Page from Implementation of Queue Page")
	public void the_user_should_be_navigate_to_the_implementation_using_array_page_from_implementation_of_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	// Queue Operations link from the left panel
	
	@Given("The user opened the Implementation of Queue Page")
	public void the_user_opened_the_implementation_of_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Queue Operations link in this Page")
	public void the_user_clicks_the_queue_operations_link_in_this_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigate to the  Queue Operations Page from Implementation of Queue Page")
	public void the_user_should_be_navigate_to_the_queue_operations_page_from_implementation_of_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	// Practice Questions link from left panel
	
	@Given("The user logged in to the  Implementation of Queue Page")
	public void the_user_logged_in_to_the_implementation_of_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Practice Questions link in this Page")
	public void the_user_clicks_the_practice_questions_link_in_this_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigate to the  Practice Questions Page")
	public void the_user_should_be_navigate_to_the_practice_questions_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	// Try here button in Implementation of Queue Page
	
	@Given("The User navigated to the  Implementation of Queue Page")
	public void the_user_navigated_to_the_implementation_of_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Try here button")
	public void the_user_clicks_the_try_here_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigate to the Pyhton editor page for the Implementation of Queue Page")
	public void the_user_should_be_navigate_to_the_pyhton_editor_page_for_the_implementation_of_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	// Python Editor-> Valid codes in Implementation of Queue Page
	
	@Given("The User is in the Implementation of Queue  Editor Page")
	public void the_user_is_in_the_implementation_of_queue_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user writes the valid python codes and click the run button")
	public void the_user_writes_the_valid_python_codes_and_click_the_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to see the output in the console")
	public void the_user_should_be_able_to_see_the_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	//Python Editor-> In-Valid codes in Implementation of Queue Page
	
	
	
	@Given("The User is in the Implementation of Queue PY_Editor Page")
	public void the_user_is_in_the_implementation_of_queue_py_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user writes the Invalid python codes and click the run button")
	public void the_user_writes_the_invalid_python_codes_and_click_the_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should get the error message in the pop up")
	public void the_user_should_get_the_error_message_in_the_pop_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
// Try Here button in Implementation using collections.queue Page
	
	@Given("The User is in the Implementation using collections.queue Page")
	public void the_user_is_in_the_implementation_using_collections_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Try here button in the Implementation using collections.queue Page")
	public void the_user_clicks_the_try_here_button_in_the_implementation_using_collections_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigate to the Python editor page for the Implementation using collections.queue Page")
	public void the_user_should_be_navigate_to_the_python_editor_page_for_the_implementation_using_collections_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
	//Python Editor -Implementation using collections.queue -Valid Codes
	
	@Given("The User is in the Implementation using collections.queue Python Editor Page")
	public void the_user_is_in_the_implementation_using_collections_queue_python_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user writes the valid python codes and click the run button for the Implementation using collections.queue Page")
	public void the_user_writes_the_valid_python_codes_and_click_the_run_button_for_the_implementation_using_collections_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to see the output in the console for the Implementation using collections.queue Page")
	public void the_user_should_be_able_to_see_the_output_in_the_console_for_the_implementation_using_collections_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	//Python Editor -Implementation using collections.queue -In_Valid Codes
	
	
	
	@When("The user writes the Invalid python codes and click the run button for the Implementation using collections.queue page")
	public void the_user_writes_the_invalid_python_codes_and_click_the_run_button_for_the_implementation_using_collections_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should get the error message in the pop up for the Implementation using collections.queue Page")
	public void the_user_should_get_the_error_message_in_the_pop_up_for_the_implementation_using_collections_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	//Try here- Implementation using array Page
	
	@Given("The User is in the Implementation using array Page")
	public void the_user_is_in_the_implementation_using_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Try here button in the Implementation using array Page")
	public void the_user_clicks_the_try_here_button_in_the_implementation_using_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigate to the Python editor page for the Implementation using array Page")
	public void the_user_should_be_navigate_to_the_python_editor_page_for_the_implementation_using_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	//  Python Editor-Valid Codes-Implementation using array Page
	
	
	@Given("The User is in the Implementation using array Page Python Editor Page")
	public void the_user_is_in_the_implementation_using_array_page_python_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user writes the valid python codes and click the run button for the Implementation using array Page")
	public void the_user_writes_the_valid_python_codes_and_click_the_run_button_for_the_implementation_using_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to see the output in the console for the Implementation using array Page")
	public void the_user_should_be_able_to_see_the_output_in_the_console_for_the_implementation_using_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
   //  Python Editor- In-Valid Codes-Implementation using array Page
	
	
	@Given("The User is in the Implementation using array Page PY_Editor Page")
	public void the_user_is_in_the_implementation_using_array_page_py_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user writes the Invalid python codes and click the run button for the Implementation using array page")
	public void the_user_writes_the_invalid_python_codes_and_click_the_run_button_for_the_implementation_using_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should get the error message in the pop up for the Implementation using array Page")
	public void the_user_should_get_the_error_message_in_the_pop_up_for_the_implementation_using_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	// Try Here - Queue Operations Page
	
	@Given("The User is in the Queue Operations Page")
	public void the_user_is_in_the_queue_operations_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Try here button in the Queue Operations Page")
	public void the_user_clicks_the_try_here_button_in_the_queue_operations_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigate to the Python editor page for the Queue Operations page")
	public void the_user_should_be_navigate_to_the_python_editor_page_for_the_queue_operations_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	// Python Editor_Valid Codes-Queue Operations Page
	
	@Given("The User is in the Queue Operations Page Python Editor Page")
	public void the_user_is_in_the_queue_operations_page_python_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user writes the valid python codes and click the run button for the Queue Operations Page")
	public void the_user_writes_the_valid_python_codes_and_click_the_run_button_for_the_queue_operations_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to see the output in the console for the Queue Operations Page")
	public void the_user_should_be_able_to_see_the_output_in_the_console_for_the_queue_operations_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	// Python Editor_In-Valid Codes-Queue Operations Page
	
	
	@Given("The User is in the Queue Operations Page PY_Editor Page")
	public void the_user_is_in_the_queue_operations_page_py_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user writes the Invalid python codes and click the run button for the Queue Operations page")
	public void the_user_writes_the_invalid_python_codes_and_click_the_run_button_for_the_queue_operations_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should get the error message in the pop up for the Queue Operations Page")
	public void the_user_should_get_the_error_message_in_the_pop_up_for_the_queue_operations_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	
	
	
	
}
