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
import pageObjects.DataStructurePage;
import pageObjects.GetStartedPage;
import pageObjects.HomePage;
import pageObjects.QueuePage;
import pageObjects.SignInPage;

public class QueueSteps {	
	
	WebDriver driver;
	Properties p;
	Logger logger = BaseClass.getLogger();
	JavascriptExecutor jse = (JavascriptExecutor)BaseClass.getDriver();	
	
	// Background
	
	@When("The User clicks the Queue Get Started button")
	  public void the_user_clicks_the_queue_get_started_button() {
		
		logger.info("Clicking the Queue Page After Login..........");		  
		  HomePage hp = new	 HomePage(BaseClass.getDriver()); 
		  hp.clickQueueGetStarted();
	}
	@Then("The User should navigate to the Queue Page")
	public void the_user_should_navigate_to_the_queue_page() 
	{		
		String CurntURL= BaseClass.getDriver().getCurrentUrl(); 
		Assert.assertEquals(true,CurntURL.contains("queue")); 
		logger.info("Queue Page URL --->" + CurntURL);
		
	}
	
	// Testing the Implementation of Queue in Python link in Queue Page
	
	
	@Given("The user is in the Queue Page")
	public void the_user_is_in_the_queue_page() {	
		
		          logger.info("The user is in the Queue Page"); 
		          String CurntURL=  BaseClass.getDriver().getCurrentUrl();
				  Assert.assertEquals(true,	CurntURL.contains("queue")); 				  
		
	}
	
	
	
	@When("The User clicks the Implementation of Queue in Python link  in the Queue Page")
	public void the_user_clicks_the_implementation_of_queue_in_python_link_in_the_queue_page() {
		
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		  Qp.Click_ImplementaionOfQueue();
		
	}
	
	@Then("The user should be navigate to the Implementation of Queue in Python Page")
	public void the_user_should_be_navigate_to_the_implementation_of_queue_in_python_page() {
		
		 String CrtURL = BaseClass.getDriver().getCurrentUrl();
		  Assert.assertEquals(true, CrtURL.contains("lists"));
		
	}
	
	
	// Testing the Implementation using collections queue  link in Queue Page
	
	
	@When("The User clicks the  Implementation using collections queue link in Queue Page")
	public void the_user_clicks_the_implementation_using_collections_queue_link_in_queue_page() {
		
		 logger.info("The user clicks the Implementation using collections.queue link ........" );		  
		  QueuePage Qp = new QueuePage (BaseClass.getDriver());
		  Qp.Click_ImplemenUsingCollectionOfQueue();
	}
	
	@Then("The user should be navigate to the Implementation using collections queue Page")
	public void the_user_should_be_navigate_to_the_implementation_using_collections_queue_page() {
		String CurrentURL = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(true, CurrentURL.contains("collections"));	
	   
	}
	
	
	// Testing the Implementation using Array link Queue  Page
	
	
	@When("The User clicks the Implementation using Array link in Queue Page")
	public void the_user_clicks_the_implementation_using_array_link_in_queue_page() {
		 logger.info("The user clicks the Implementation using Array link ........" );		  
		 QueuePage Qp = new QueuePage (BaseClass.getDriver());
		 Qp.Click_ImplemenUsingArry();
	}
	
	@Then("The user should be navigate to the Implementation using Array Page")
	public void the_user_should_be_navigate_to_the_implementation_using_array_page() {
		
		String CurrentURL = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(true, CurrentURL.contains("array"));	
		logger.info("Implementation using Array link Current URL " + CurrentURL);
	}
	
	
	// Testing the Queue Operations link in Queue Page
	
	@When("The User clicks the  Queue Operations link in Queue Page")
	public void the_user_clicks_the_queue_operations_link_in_queue_page() {
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		Qp.Click_QueueOperation();
		
	}
	@Then("The user should be navigate to the Queue Operations Page")
	public void the_user_should_be_navigate_to_the_queue_operations_page() {
		String CurrentURL = BaseClass.getDriver().getCurrentUrl();
		logger.info("After clicking Queue Operations link URL ... " +CurrentURL );
		Assert.assertEquals(true, CurrentURL.contains("QueueOp"));	
		
		
	}
	
	
	// Testing the Implementation of Queue link from the Left panel links
	
	@Given("The user is in the  Implementation of Queue Page")
	public void the_user_is_in_the_implementation_of_queue_page() {
		
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		  Qp.Click_ImplementaionOfQueue();
		  
	}
	@When("The user clicks the Implementation of Queue link in this Page")
	public void the_user_clicks_the_implementation_of_queue_link_in_this_page() {
		
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		  Qp.Click_ImplementaionOfQueue();
		
	}
	@Then("The user should be stayed in the same page")
	public void the_user_should_be_stayed_in_the_same_page() {
		
		String CurrentURL = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(true, CurrentURL.contains("lists"));   
	}
	
	
	// Testing the Implementation using collections.queue link  from the Left panel links
	
	@When("The user clicks the Implementation using collections.queue link from the left panel links")
	public void the_user_clicks_the_implementation_using_collections_queue_link_from_the_left_panel_links() {
		logger.info("Clicking the Implementation using collections.queue  from the left panel links........ ");
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		Qp.Click_ImplemenUsingCollectionOfQueue();
		
	}
	
	
	// Testing the Implementation using Array link from the Left panel links
	
	
	@When("The user clicks the Implementation using Array link in this Page from the left panel links")
	public void the_user_clicks_the_implementation_using_array_link_in_this_page_from_the_left_panel_links() {
		logger.info("Clicking the Implementation using Array link  from the left panel links........ ");
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		Qp.Click_ImplemenUsingArry();
	}
	
	
	
	//  Testing the Queue Operations link from the Left panel links
	
	
	@When("The user clicks the Queue Operations link in this Page from the Left panel links")
	public void the_user_clicks_the_queue_operations_link_in_this_page_from_the_left_panel_links() {
		logger.info("Clicking the Queue Operations link from the left panel links........ ");
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		Qp.Click_QueueOperation();
	}
	
	// Testing the Practice Questions link from the Left panel links
	
	@When("The user clicks the Practice Questions link in this Page")
	public void the_user_clicks_the_practice_questions_link_in_this_page() {
		logger.info("Clicking the Practice Questions  from the left panel links........ ");
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		Qp.click_PracticeQuestions();
	}
	@Then("The user should be navigate to the  Practice Questions Page")
	public void the_user_should_be_navigate_to_the_practice_questions_page() {
		
		String CurrentURL = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(true, CurrentURL.contains("practice"));
		
	}
	
	
	// Testing the Try here in Implementation of Queue in Python Page  ---> Already Exits in DS Feature file
	
	
	
	// Testing the Implementation of Queue Python Editor with Valid codes
	
	@Given("The User is in the Implementation of Queue  Editor Page")
	public void the_user_is_in_the_implementation_of_queue_editor_page() {
		 QueuePage Qp = new QueuePage (BaseClass.getDriver());
		  Qp.Click_ImplementaionOfQueue();
		  DataStructurePage dp = new DataStructurePage(BaseClass.getDriver());
		  dp.click_DS_TimeComplexity_TryhereBtn();
	}
	
	
	// Testing the Implementation of Queue Python Editor with InValid codes --> Codes were implemented in DS feature 
	
	
	
	// Testing the Try here in Implementation using collections.queue in Python Page
	
	@Given("The User is in the Implementation using collections.queue Page")
	public void the_user_is_in_the_implementation_using_collections_queue_page() {
	   logger.info("Clicking the Try here in Implementation using collections.queue Page......");
	   QueuePage Qp = new QueuePage (BaseClass.getDriver());	   
	   Qp.Click_ImplemenUsingCollectionOfQueue();	   
	   
	}
	
	// Testing the Implementation using collections.queue page Python Editor with Valid codes
	
	@Given("The User is in the Implementation using collections.queue Python Editor Page")
	public void the_user_is_in_the_implementation_using_collections_queue_python_editor_page() {
		   QueuePage Qp = new QueuePage (BaseClass.getDriver());	   
		   Qp.Click_ImplemenUsingCollectionOfQueue();
		   Qp.Click_Tryhere();
	}
	
	
	// Testing the Implementation using collections.queue Python Try Editor page without  codes ->  Already implemented in DS & Queue page
	// Testing the Implementation using collections.queue PY_Editor with InValid codes  --> Already implemented in DS & Queue page
	
	
	// Testing the Try here in Implementation using array in Python Page
	
	
	@Given("The User is in the Implementation using array Page")
	public void the_user_is_in_the_implementation_using_array_page() {
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		Qp.Click_ImplemenUsingArry();
		
	}
	
	// Testing the Implementation using array page Python Editor with Valid codes
	
	@Given("The User is in the Implementation using array Page Python Editor")
	public void the_user_is_in_the_implementation_using_array_page_python_editor() {
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		Qp.Click_ImplemenUsingArry();
		Qp.Click_Tryhere();
	}
	
	//  Testing the Implementation using array Python Try Editor page without any Python codes ->  Implemented in DS & Queue Page
	// Testing the Implementation using array Python Editor with InValid codes  ->  Implemented in DS & Queue Page
	
	
	//  Testing the Try here in Queue Operations in Python Page
	
	@Given("The User is in the Queue Operations Page")
	public void the_user_is_in_the_queue_operations_page() {
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		Qp.Click_QueueOperation();
	}
	
	
	// Testing the Queue Operations Python Editor with Valid codes
	
	@Given("The User is in the Queue Operations Page Python Editor Page")
	public void the_user_is_in_the_queue_operations_page_python_editor_page() {
		QueuePage Qp = new QueuePage (BaseClass.getDriver());
		Qp.Click_QueueOperation();
		Qp.Click_Tryhere();
	}
	
	//Testing the Queue Operations  Python Try Editor page without any Python codes -> Implemented in DS & Queue Page
	//Testing the Queue Operations Python Editor with InValid codes -> Implemented in DS & Queue Page
	
	
	
}
