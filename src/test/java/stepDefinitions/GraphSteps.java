package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;

public class GraphSteps {
	
	WebDriver driver;
	Properties p;
	Logger logger=BaseClass.getLogger();
	
	@Given("clicking the get started of Graph")
	public void clicking_the_get_started_of_graph() {
	
		GraphPage gp=new GraphPage(BaseClass.getDriver());
		gp.click_Getstarted();
		logger.info("Getstarted button clicked............");
		
	}

	@Given("The user is in the Graph after successful login")
	public void the_user_is_in_the_graph_after_successful_login() {
	   
		GraphPage gp=new GraphPage(BaseClass.getDriver());
		boolean graph_HomePage=gp.check_GraphHomePage();
		Assert.assertEquals(graph_HomePage, true);
		logger.info("Graph home page dispalyed.........");
	}

	@When("User click on the graph link")
	public void user_click_on_the_graph_link() {
		GraphPage gp=new GraphPage(BaseClass.getDriver());
		gp.click_GraphLink();
		logger.info("Graph link  clicked............");
		}

	@Then("Graph page will be displayed")
	public void graph_page_will_be_displayed() {
		GraphPage gp=new GraphPage(BaseClass.getDriver());
		boolean graph_Page=gp.check_GraphPage();
		Assert.assertEquals(graph_Page, true);
		logger.info("Graph  page dispalyed.........");
	
		
	    }
	//GraphRepersentations link
	@When("User click on the GraphRepersentations link")
	public void user_click_on_the_graph_repersentations_link() {
		GraphPage gp=new GraphPage(BaseClass.getDriver());
		gp.click_GraphRepersentationsLink();
		logger.info("GraphRepersentations link  clicked............");
	}

	@Then("GraphRepersentations page will be displayed")
	public void graph_repersentations_page_will_be_displayed() {
		GraphPage gp=new GraphPage(BaseClass.getDriver());
		boolean GraphRepersentations_Page_URL=gp.check_GraphRepersentationsLink();
		Assert.assertEquals(GraphRepersentations_Page_URL, true);
		logger.info("GraphRepersentations  page dispalyed.........");
	}




}
