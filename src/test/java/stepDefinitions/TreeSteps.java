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
		

		@Given("the user click the tree Getstarted button")
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

			boolean types_of_trees_Page=tp.check_types_of_treesPage();

			Assert.assertEquals(types_of_trees_Page, true);
			logger.info("types_of_trees page dispalyed.........");
		 }
		

		@When("User moves to the types-of-trees page and clicks the Try here button in this Page")
		public void user_moves_to_the_types_of_trees_page_and_clicks_the_try_here_button_in_this_page() {
		
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_types_of_treesLink();
			tp.clickTryHerebutton();
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
		

		@When("User moves to the tree-traversals page and clicks the Try here button in this Page")
		public void user_moves_to_the_tree_traversals_page_and_clicks_the_try_here_button_in_this_page() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_tree_traversalsLink();
			tp.clickTryHerebutton();
			
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
		

		@When("User moves to the traversals-illustration page and clicks the Try here button in this Page")
		public void user_moves_to_the_traversals_illustration_page_and_clicks_the_try_here_button_in_this_page() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_traversals_illustrationLink();
			tp.clickTryHerebutton();
			
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
		

		@When("User moves to the binary-trees page and clicks the Try here button in this Page")
		public void user_moves_to_the_binary_trees_page_and_clicks_the_try_here_button_in_this_page() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_binary_treesLink();
			tp.clickTryHerebutton();
			
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

		@When("User moves to the types-of-binary-trees page and clicks the Try here button in this Page")
		public void user_moves_to_the_types_of_binary_trees_page_and_clicks_the_try_here_button_in_this_page() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_types_of_binary_treesLink();
			tp.clickTryHerebutton();
			
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
		

		@When("User moves to the implementation-in-python page and clicks the Try here button in this Page")
		public void user_moves_to_the_implementation_in_python_page_and_clicks_the_try_here_button_in_this_page() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_implementation_in_pythonLink();
			tp.clickTryHerebutton();
			
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
		

		@When("User moves to the Binary Tree Traversals page and clicks the Try here button in this Page")
		public void user_moves_to_the_Binary_Tree_Traversals_page_and_clicks_the_try_here_button_in_this_page() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_BinaryTreeTraversalsLink();
			tp.clickTryHerebutton();
			
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
		

		@When("User moves to the Implementation of Binary Trees page and clicks the Try here button in this Page")
		public void user_moves_to_the_Implementation_of_Binary_Trees_page_and_clicks_the_try_here_button_in_this_page() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_ImplementationofBinaryTreesLink();
			tp.clickTryHerebutton();
			
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


		
		@When("User moves to the Applications of Binary Trees page and clicks the Try here button in this Page")
	public void user_moves_to_the_Applications_of_Binary_Tree_Trees_page_and_clicks_the_try_here_button_in_this_page() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_ApplicationsofBinarytreesLink();
			tp.clickTryHerebutton();
			
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
		

		@When("User moves to the Binary Search Trees page and clicks the Try here button in this Page")
		public void user_moves_to_the_Binary_Search__Trees_page_and_clicks_the_try_here_button_in_this_page() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_BinarySearchTreesLink();
			tp.clickTryHerebutton();
			
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

		
		@When("User moves to the Implementation Of BST page and clicks the Try here button in this Page")
		public void user_moves_to_the_Implementation_of_BST_page_and_clicks_the_try_here_button_in_this_page() {
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_ImplementationOfBSTLink();
			tp.clickTryHerebutton();
			
		}
		
		@When("The user clicks practice questions link in the Overviewoftrees page")
		public void the_user_clicks_practice_questions_link_in_the_overviewoftrees_page() {
		   
			TreePage tp=new TreePage(BaseClass.getDriver());
			tp.click_PracticeQnsLink();
		}

		@Then("The user should be redirected to the Practice question Page of tree")
		public void the_user_should_be_redirected_to_the_practice_question_page_of_tree() {
		   
			TreePage tp=new TreePage(BaseClass.getDriver());
			boolean PracticeQns_Page=tp.check_PracticeQnsPage();
			Assert.assertEquals(PracticeQns_Page, true);
			logger.info("PracticeQns_Page  dispalyed.........");
		 
		}



		
		//----------Click the page links under Menu--------
		@When("user clicks the {string} link")
		public void user_clicks_the_link(String menuItem) {
			logger.info("User clicks the "+menuItem+" link under Tree Menu........");
			TreePage tp=new TreePage(BaseClass.getDriver());
			switch(menuItem)
		      {
		      	case  "overviewoftrees": tp.click_OverviewofTreeLink();break;
		      	case  "terminologies": tp.click_terminologiesLink();break;
		      	case  "typesoftrees":tp.click_types_of_treesLink();break;
		      	case  "tree-traversals":tp.click_tree_traversalsLink();break;
		      	case  "traversals-illustration":tp.click_traversals_illustrationLink();break;
		      	case  "binary-trees":tp.click_binary_treesLink();break;
		      	case  "types-of-binary-trees":tp.click_types_of_binary_treesLink();break;
		      	case  "implementation-in-python":tp.click_implementation_in_pythonLink();break;
		      	case  "Binary Tree Traversals":tp.click_BinaryTreeTraversalsLink();break;
		      	case  "Implementation of Binary Trees":tp.click_ImplementationofBinaryTreesLink();break;
		      	case  "Applications of Binary trees":tp.click_ApplicationsofBinarytreesLink();break;
		      	case  "Binary Search Trees":tp.click_BinarySearchTreesLink();break;
		      	case  "Implementation Of BST":tp.click_ImplementationOfBSTLink();break;
		      	default:System.out.println("There is no such page..........");
		    }
		}

		@Then("user will navigate to {string} page")
		public void user_will_navigate_to_page(String menuItem) {
			logger.info("Verify whether the "+menuItem+" page is opened........");
			TreePage tp=new TreePage(BaseClass.getDriver());
			switch(menuItem)
		      {
		      	case  "overviewoftrees": Assert.assertTrue(tp.check_Overview_of_TreePage());break;
		      	case  "terminologies":Assert.assertTrue(tp.check_terminologiesPage());break;
		      	case  "typesoftrees":Assert.assertTrue(tp.check_types_of_treesPage());break;
		      	case  "tree-traversals":Assert.assertTrue(tp.check_tree_traversalsPage());break;
		      	case  "traversals-illustration":Assert.assertTrue(tp.check_traversals_illustrationPage());break;
		      	case  "binary-trees":Assert.assertTrue(tp.check_binary_treesPage());break;
		      	case  "types-of-binary-trees":Assert.assertTrue(tp.check_types_of_binary_treesPage());break;
		      	case  "implementation-in-python":Assert.assertTrue(tp.check_implementation_in_pythonPage());break;
		      	case  "Binary Tree Traversals":Assert.assertTrue(tp.check_BinaryTreeTraversalsPage());break;
		      	case  "Implementation of Binary Trees":Assert.assertTrue(tp.check_ImplementationofBinaryTreesPage());break;
		      	case  "Applications of Binary trees":Assert.assertTrue(tp.check_ApplicationsofBinarytreesPage());break;
		      	case  "Binary Search Trees":Assert.assertTrue(tp.check_BinarySearchTreesPage());break;
		      	case  "Implementation Of BST":Assert.assertTrue(tp.check_ImplementationOfBSTPage());break;
		      	default: System.out.println("There is no such page to display.....");
		    } 
		}
}



