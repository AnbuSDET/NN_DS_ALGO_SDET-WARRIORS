package stepDefinitions;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TreePage;

public class TreeSteps {

	WebDriver driver;
		Properties p;
		Logger logger=BaseClass.getLogger();
		
		
		@Given("User move to Tree page after login to application")
		public void user_move_to_tree_page_after_login_to_application() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		
		@Given("the user click the Tree Getstarted button")
		public void the_user_click_the_tree_getstarted_button() {
		
			TreePage tp = new TreePage(BaseClass.getDriver());
			tp.click_Getstarted();
			logger.info("Getstarted button clicked............");
		}
		
		@Given("User will navigate to tree page")
		public void user_will_navigate_to_tree_page() {		   
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean Tree_HomePage=tp.check_TreeHomePagelink();
			Assert.assertEquals(Tree_HomePage, true);
			logger.info("Tree home page dispalyed.........");
		}
		
		//overviewoftrees
		@When("user clicks the overviewoftrees link")
		public void user_clicks_the_overviewoftrees_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_OverviewofTreeLink();
			logger.info("overviewoftrees link  clicked............");
			}

		@Then("user will navigate to overviewoftree page")
		public void overviewoftreesTree_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean     overviewoftreesTree_Page=tp.check_Overview_of_TreePage();
			Assert.assertEquals(overviewoftreesTree_Page, true);
			logger.info("overviewofTrees page dispalyed.........");
		   }
		
		@Given("User moves to the overviewoftrees page and clicks the Try here button in this Page")
		public void user_moves_to_the_overviewoftrees_page_and_clicks_the_try_here_button_in_this_page() {
			logger.info("Click Try Here button in overviewoftrees page............");
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_OverviewofTreeLink();
			tp.clickTryHerebutton();
			}
		
		//terminologies
		@When("user clicks the terminologies link")
		public void user_clicks_the_terminologies_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_terminologiesLink();
			logger.info("terminologies link  clicked............");
			}

		@Then("user will navigate to terminologies page")
		public void terminologies_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean     terminologies_Page=tp.check_terminologiesPage();
			Assert.assertEquals(terminologies_Page, true);
			logger.info("terminologies page dispalyed.........");
		 }
		
		@Given("User moves to the Terminologies page and clicks the Try here button in this Page")
		public void user_moves_to_the_terminologies_page_and_clicks_the_try_here_button_in_this_page() {
			logger.info("Click Try Here button in Terminologies page............");
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_terminologiesLink();
			tp.clickTryHerebutton();
		}
		
		
		//types-of-trees
		@When("user clicks the typesoftrees link")
		public void user_clicks_the_types_of_trees_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_types_of_treesLink();
			logger.info("types_of_trees link  clicked............");
		}

		@Then("user will navigate to typesoftrees page")
		public void types_of_trees_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean     types_of_trees_Page=tp.check_types_of_treesPage();
			Assert.assertEquals(types_of_trees_Page, true);
			logger.info("types_of_trees page dispalyed.........");
		 }
		
		//tree-traversals
		@When("user clicks the tree-traversals link")
		public void user_clicks_the_tree_traversals_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_tree_traversalsLink();
			logger.info("tree-traversals link  clicked............");
			}

		@Then("user will navigate to tree-traversals page")
		public void tree_traversals_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean tree_traversals_Page=tp.check_tree_traversalsPage();
			Assert.assertEquals(tree_traversals_Page, true);
			logger.info("tree-traversals page dispalyed.........");
		 }
		
		//traversals-illustration
		@When("user clicks the traversals-illustration link")
		public void user_clicks_the_traversals_illustration_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_traversals_illustrationLink();
			logger.info("traversals-illustration link  clicked............");
			}

		@Then("user will navigate to traversals-illustration page")
		public void traversals_illustration_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean traversals_illustration_Page=tp.check_traversals_illustrationPage();
			Assert.assertEquals(traversals_illustration_Page, true);
			logger.info("traversals-illustration page dispalyed.........");
		 }
		
		//binary-trees
		@When("user clicks the binary-trees link")
		public void user_clicks_the_binary_trees_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_binary_treesLink();
			logger.info("binary-trees link  clicked............");
			}

		@Then("user will navigate to binary-trees page")
		public void binary_trees_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean binary_trees_Page=tp.check_binary_treesPage();
			Assert.assertEquals(binary_trees_Page, true);
			logger.info("binary-trees page dispalyed.........");
		 }
		
		//types-of-binary-trees
		@When("user clicks the types-of-binary-trees link")
		public void user_clicks_types_of_binary_trees_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_types_of_binary_treesLink();
			logger.info("types-of-binary-trees link  clicked............");
			}

		@Then("user will navigate to types-of-binary-trees page")
		public void types_of_binary_trees_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean types_of_binary_trees_Page=tp.check_types_of_binary_treesPage();
			Assert.assertEquals(types_of_binary_trees_Page, true);
			logger.info("types-of-binary-trees page dispalyed.........");
		 }
		
		//implementation-in-python
		@When("user clicks the implementation-in-python link")
		public void user_clicks_implementation_in_python_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_implementation_in_pythonLink();
			logger.info("implementation-in-python link  clicked............");
			}

		@Then("user will navigate to implementation-in-python page")
		public void implementation_in_python_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean implementation_in_python_Page=tp.check_implementation_in_pythonPage();
			Assert.assertEquals(implementation_in_python_Page, true);
			logger.info("implementation-in-python page dispalyed.........");
		 }
		
		//Binary Tree Traversals
		@When("user clicks the Binary Tree Traversals link")
		public void user_clicks_BinaryTreeTraversals_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_BinaryTreeTraversalsLink();
			logger.info("Binary Tree Traversals link  clicked............");
			}

		@Then("user will navigate to Binary Tree Traversals page")
		public void BinaryTreeTraversals_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean BinaryTreeTraversals_Page=tp.check_BinaryTreeTraversalsPage();
			Assert.assertEquals(BinaryTreeTraversals_Page, true);
			logger.info("Binary Tree Traversals page dispalyed.........");
		 }
		
		//Implementation of Binary Trees
		@When("user clicks the Implementation of Binary Trees link")
		public void user_clicks_ImplementationofBinaryTrees_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_ImplementationofBinaryTreesLink();
			logger.info("Implementation of Binary Trees link  clicked............");
			}		

		@Then("user will navigate to Implementation of Binary Trees page")
		public void ImplementationofBinaryTrees_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean ImplementationofBinaryTrees_Page=tp.check_ImplementationofBinaryTreesPage();
			Assert.assertEquals(ImplementationofBinaryTrees_Page, true);
			logger.info("Implementation of Binary Trees page dispalyed.........");
		 }
		
		//Applications of Binary trees
		@When("user clicks the Applications of Binary trees link")
		public void user_clicks_ApplicationsofBinarytrees_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_ApplicationsofBinarytreesLink();
			logger.info("Applications of Binary trees link  clicked............");
			}

		@Then("user will navigate to Applications of Binary trees page")
		public void ApplicationsofBinarytrees_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean ApplicationsofBinarytrees_Page=tp.check_ApplicationsofBinarytreesPage();
			Assert.assertEquals(ApplicationsofBinarytrees_Page, true);
			logger.info("Applications of Binary trees page dispalyed.........");
		 }

		//Binary Search Trees
		@When("user clicks the Binary Search Trees link")
		public void user_clicks_BinarySearchTrees_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_BinarySearchTreesLink();
			logger.info("Binary Search Trees link  clicked............");
			}

		@Then("user will navigate to Binary Search Trees page")
		public void BinarySearchTrees_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean BinarySearchTrees_Page=tp.check_BinarySearchTreesPage();
			Assert.assertEquals(BinarySearchTrees_Page, true);
			logger.info("Binary Search Trees dispalyed.........");
		 }
		
		//Implementation Of BST
		@When("user clicks the Implementation Of BST link")
		public void user_clicks_ImplementationOfBST_link() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_ImplementationOfBSTLink();
			logger.info("Implementation Of BST link  clicked............");
			}

		@Then("user will navigate to Implementation Of BST page")
		public void ImplementationOfBST_page_will_be_displayed() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean ImplementationOfBST_Page=tp.check_ImplementationOfBSTPage();
			Assert.assertEquals(ImplementationOfBST_Page, true);
			logger.info("Implementation Of BST dispalyed.........");
		 }
}
