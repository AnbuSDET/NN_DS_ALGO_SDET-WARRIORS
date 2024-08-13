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
	//----------------1.Validating LinkedList IntroductionModule---------------

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
		logger.info("Introduction page is displayed.........");
	}
	
	//--------------------Validating try here button in introduction module------------
	
	@Given("The user is in the Linked List Introduction Page")
	public void the_user_is_in_tthe_Linked_list_introduction_page()
	{
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Clicking the introduction page link.....");
		lp.click_Introduction();
		
	}
	@When("The user clicks the Try here button in the LLIntroPage")
	public void the_user_clicks_the_try_here_button_in_the_ll_intro_page() {
	 
	LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
	  lp.click_TryHereBtn();
	}

	@Then("The user should be redirected to the Try editor console page")
	public void the_user_should_be_redirected_to_the_try_editor_console_page() {
	
	LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
	logger.info("Redirecting to try editor page........");
	boolean check_URL=lp.check_TryEditorPage();
	Assert.assertEquals(check_URL, true);
	logger.info("editor page displayed......");
	}

	//---------------------tryeditor with valid python code-----------
	
	@Given("The user is in the try editor page of the Linked List")
	public void the_user_is_in_the_try_editor_page_of_the_Linked_List() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Navigating to the tryeditor page link.....");
		lp.click_Introduction();
		lp.click_TryHereBtn();
		
		
	}
	//------------invalid and no code validation done using steps from ds page-------
	
	//---------------2.Validating creatingLinkedList-------------------
	
	@When("The user clicks Creating a linked list tab")
	public void the_user_clicks_creating_a_linked_list_tab() {
	   
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Clicking the Creating Linked List page link.....");
		lp.click_creatingLinkedList();

		
	}

	@Then("The user should be redirected to the creating linked list page")
	public void the_user_should_be_redirected_to_the_creating_linked_list_page() {
	    
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Redirecting to CreatingLinkedListPage..............");
		boolean check_URL=lp.check_CreatingLinkedListPage();
		Assert.assertEquals(check_URL, true);
		logger.info("Creating linked list page displayed......");
		
	
	}

	@Given("The user is in the CreatingALinkedList page after successful login")
	public void the_user_is_in_the_creating_a_linked_list_page_after_successful_login() {
	   
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user is in  creating linkedlist link");
		lp.click_creatingLinkedList();
	}

	@When("The user clicks the TryHere button in the CreatingALinkedList Page")
	public void the_user_clicks_the_try_here_button_in_the_creating_a_linked_list_page() {
	    
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		lp.click_TryHereBtn();
		logger.info("Try here button is clicked");
	}

	//---------------------3.Types Of Linked List-----------------
	
	@When("The user clicks Types of linked list tab")
	public void the_user_clicks_types_of_linked_list_tab() {
	   
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user clicked types of linkd list link.........");
		lp.click_TypesOfLinkedList();
	
	
	}

	@Then("The user should be redirected to the types of linked list page")
	public void the_user_should_be_redirected_to_the_types_of_linked_list_page() {
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Redirecting to typesoflinkedlist page..............");
		boolean check_URL=lp.check_TypesOfLinkedListPage();
		Assert.assertEquals(check_URL, true);
		logger.info("Typesoflinkedlist page displayed......");
	}

	@Given("The user is in the TypesOfLinkedList page after successful login")
	public void the_user_is_in_the_types_of_linked_list_page_after_successful_login() {
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user is in  types of linkedlist page.......");
		lp.click_TypesOfLinkedList();
}

	@When("The user clicks the TryHere button in the TypesofLinkedList Page")
	public void the_user_clicks_the_try_here_button_in_the_typesof_linked_list_page() {
	   
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		lp.click_TryHereBtn();
		logger.info("Try here button is clicked");
	}

	//---------------4.Implementing linked list--------------
	
	@When("The user clicks implementinglinkedlist tab")
	public void the_user_clicks_implementinglinkedlist_tab() {
	    
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user clicked implementing linked list link.........");
		lp.click_ImplementingLinkedList();
	
	}

	@Then("The user should be redirected to the implementinglinkedlist page")
	public void the_user_should_be_redirected_to_the_implementinglinkedlist_page() {
	   
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Redirecting to implementinglinkedlist page..............");
		boolean check_URL=lp.check_ImplementingLinkedListPage();
		Assert.assertEquals(check_URL, true);
		logger.info("implementinglinkedlist page displayed......");
	
	
	}

	@Given("The user is in the implementinglinkedlist page after successful login")
	public void the_user_is_in_the_implementinglinkedlist_page_after_successful_login() {
	    
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user is in  implementinglinkedlist page.......");
		lp.click_ImplementingLinkedList();

	
	}

	@When("The user clicks the TryHere button in the implementinglinkedlist Page")
	public void the_user_clicks_the_try_here_button_in_the_implementinglinkedlist_page() {
	    
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		lp.click_TryHereBtn();
		logger.info("Try here button is clicked.............");
	
	
	}
	
	//--------------5.Traversal--------------------------------

	@When("The user clicks traversal tab")
	public void the_user_clicks_traversal_tab() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user clicked traversal link.........");
		lp.click_Traversal();
	}

	@Then("The user should be redirected to the traversal page")
	public void the_user_should_be_redirected_to_the_traversal_page() {
	    
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Redirecting to traversal page..............");
		boolean check_URL=lp.check_Traversal();
		Assert.assertEquals(check_URL, true);
		logger.info("traversal page displayed......");
	
	
	}

	@Given("The user is in the traversal page after successful login")
	public void the_user_is_in_the_traversal_page_after_successful_login() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user is in  traversal page.......");
		lp.click_Traversal();
}

	@When("The user clicks the TryHere button in the traversal Page")
	public void the_user_clicks_the_try_here_button_in_the_traversal_page() {
	
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		lp.click_TryHereBtn();
		logger.info("Try here button is clicked.............");
	}

	//---------------Insertion-------------
	
	@When("The user clicks insertion tab")
	public void the_user_clicks_insertion_tab() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user clicked insertion link.........");
		lp.click_Insertion();
	}

	@Then("The user should be redirected to the insertion page")
	public void the_user_should_be_redirected_to_the_insertion_page() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Redirecting to insertion page..............");
		boolean check_URL=lp.check_Insertion();
		Assert.assertEquals(check_URL, true);
		logger.info("insertion page displayed......");
	}

	@Given("The user is in the insertion page after successful login")
	public void the_user_is_in_the_insertion_page_after_successful_login() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user is in insertion page.........");
		lp.click_Insertion();
	}

	@When("The user clicks the TryHere button in the insertion Page")
	public void the_user_clicks_the_try_here_button_in_the_insertion_page() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		lp.click_TryHereBtn();
		logger.info("Try here button is clicked.............");
	}

//-----------------------Deletion--------------------
	
	@When("The user clicks deletion tab")
	public void the_user_clicks_deletion_tab() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user clicked deletion link.........");
		lp.click_Deletion();
	}

	@Then("The user should be redirected to the deletion page")
	public void the_user_should_be_redirected_to_the_deletion_page() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("Redirecting to deletion page..............");
		boolean check_URL=lp.check_Deletion();
		Assert.assertEquals(check_URL, true);
		logger.info("deletion page displayed......");
	}

	@Given("The user is in the deletion page after successful login")
	public void the_user_is_in_the_deletion_page_after_successful_login() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		logger.info("user is in deletion page.........");
		lp.click_Deletion();
	}

	@When("The user clicks the TryHere button in the deletion Page")
	public void the_user_clicks_the_try_here_button_in_the_deletion_page() {
		
		LinkedListPage lp=new LinkedListPage(BaseClass.getDriver());
		lp.click_TryHereBtn();
		logger.info("Try here button is clicked.............");
	}





		
}