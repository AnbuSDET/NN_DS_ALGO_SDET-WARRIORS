Feature: Testing the Tree page and its functionalities in DS-ALGO app

  Background: 
    Given User move to home page after login to application
    And the user click the tree Getstarted button
  
	  Scenario: Testing the Tree Get Started button in the home page
	  Then User will navigate to tree page
	  
	  Scenario: Testing the Overviewoftrees link in the treepage
	  When user clicks the overviewoftrees link
	  Then user will navigate to overviewoftree page
	  
	  Scenario: Testing the TryHere button in the Overviewoftrees Page
	  When User moves to the overviewoftrees page and clicks the Try here button in this Page
	  		 Then The User should be redirected to Python Editor page
  
  	Scenario: Testing the online editor in the Overviewoftrees page with valid python code
  	    Given User moves to the overviewoftrees page and clicks the Try here button in this Page
  			When The user write the Valid python code in Editor and Clicks Run button
  			Then The User should be able to see the output in the console
  
  	Scenario: Testing the online editor in the Overviewoftrees page with invalid python code
  	 		Given User moves to the overviewoftrees page and clicks the Try here button in this Page
  			When  The user write the InValid python code in Editor and Clicks Run button
  			Then  The User should be able to see error message in the pop message
  
  	Scenario: Testing the online editor in the Overviewoftrees page with no code at all
  			Given User moves to the overviewoftrees page and clicks the Try here button in this Page
  		  When The user clicks the Run without any Codes
  	    Then The User should should be in the same page with No error message
  
	  Scenario: Testing the terminologies link in the treepage
				  When user clicks the terminologies link
				  Then user will navigate to terminologies page
	  
	  Scenario: Testing the TryHere button in the Terminologies Page
	  	    When User moves to the Terminologies page and clicks the Try here button in this Page
	  	 	  Then The User should be redirected to Python Editor page
  
  	Scenario: Testing the online editor in the Terminologies page with valid python code
  	 		Given User moves to the Terminologies page and clicks the Try here button in this Page
  		  When The user write the Valid python code in Editor and Clicks Run button
  		  Then The User should be able to see the output in the console
  
  	Scenario: Testing the online editor in the Terminologies page with invalid python code
  	 		Given User moves to the Terminologies page and clicks the Try here button in this Page
  			When  The user write the InValid python code in Editor and Clicks Run button
  			Then  The User should be able to see error message in the pop message
  
  	Scenario: Testing the online editor in the Terminologies page with no code at all
  			Given User moves to the Terminologies page and clicks the Try here button in this Page
  		  When The user clicks the Run without any Codes
  	    Then The User should should be in the same page with No error message
  
  
	  Scenario Outline: Testing the Menu links under the Tree menu from OverviewOfTrees page
	    Given user clicks the overviewoftrees link
	    When user clicks the "<link>" link
	    Then user will navigate to "<link>" page
	
	    Examples: 
	      | link                           |
	      | overviewoftrees                |
	      | terminologies                  |
	      | typesoftrees                   |
	      | tree-traversals                |
	      | traversals-illustration        |
	      | binary-trees                   |
	      | types-of-binary-trees          |
	      | implementation-in-python       |
	      | Binary Tree Traversals         |
	      | Implementation of Binary Trees |
	      | Applications of Binary trees   |
	      | Binary Search Trees            |
	      | Implementation Of BST          |

  #Mathu
  #Mathu

	Scenario: Testing the types-of-trees link in the treepage
    When user clicks the typesoftrees link
    Then user will navigate to typesoftrees page
    
    Scenario: Testing the TryHere button in the types-of-trees Page
  	  When User moves to the types-of-trees page and clicks the Try here button in this Page
		  Then The User should be redirected to Python Editor page

	Scenario: Testing the online editor in the types-of-trees page with valid python code
	 		Given User moves to the types-of-trees page and clicks the Try here button in this Page
		  When The user write the Valid python code in Editor and Clicks Run button
  		Then The User should be able to see the output in the console

	Scenario: Testing the online editor in the types-of-trees page with invalid python code
	 		Given User moves to the types-of-trees page and clicks the Try here button in this Page
			When  The user write the InValid python code in Editor and Clicks Run button
			Then  The User should be able to see error message in the pop message

	Scenario: Testing the online editor in the types-of-trees page with no code at all
			Given User moves to the types-of-trees page and clicks the Try here button in this Page
		  When The user clicks the Run without any Codes
	    Then The User should should be in the same page with No error message
	    
  

  Scenario: Testing the tree-traversals link in the treepage
    When user clicks the tree-traversals link
    Then user will navigate to tree-traversals page
    
    Scenario: Testing the TryHere button in the tree-traversals Page
  	  When User moves to the tree-traversals page and clicks the Try here button in this Page
		  Then The User should be redirected to Python Editor page

	Scenario: Testing the online editor in the tree-traversals page with valid python code
	 		Given User moves to the tree-traversals page and clicks the Try here button in this Page
		  When The user write the Valid python code in Editor and Clicks Run button
  		Then The User should be able to see the output in the console

	Scenario: Testing the online editor in the tree-traversals page with invalid python code
	 		Given User moves to the tree-traversals page and clicks the Try here button in this Page
			When  The user write the InValid python code in Editor and Clicks Run button
			Then  The User should be able to see error message in the pop message

	Scenario: Testing the online editor in the tree-traversals page with no code at all
			Given User moves to the tree-traversals page and clicks the Try here button in this Page
		  When The user clicks the Run without any Codes
	    Then The User should should be in the same page with No error message
	    
    
    
    

  Scenario: Testing the traversals-illustration link in the treepage
    When user clicks the traversals-illustration link
    Then user will navigate to traversals-illustration page

 Scenario: Testing the TryHere button in the traversals-illustration Page
  	  When User moves to the traversals-illustration page and clicks the Try here button in this Page
		  Then The User should be redirected to Python Editor page

	Scenario: Testing the online editor in the traversals-illustration page with valid python code
	 		Given User moves to the traversals-illustration page and clicks the Try here button in this Page
		  When The user write the Valid python code in Editor and Clicks Run button
  		Then The User should be able to see the output in the console

	Scenario: Testing the online editor in the traversals-illustration page with invalid python code
	 		Given User moves to the traversals-illustration page and clicks the Try here button in this Page
			When  The user write the InValid python code in Editor and Clicks Run button
			Then  The User should be able to see error message in the pop message

	Scenario: Testing the online editor in the traversals-illustration page with no code at all
			Given User moves to the traversals-illustration page and clicks the Try here button in this Page
		  When The user clicks the Run without any Codes
	    Then The User should should be in the same page with No error message
	    



  Scenario: Testing the binary-trees link in the treepage
    When user clicks the binary-trees link
    Then user will navigate to binary-trees page

Scenario: Testing the TryHere button in the binary-trees Page
  	  When User moves to the binary-trees page and clicks the Try here button in this Page
		  Then The User should be redirected to Python Editor page

	Scenario: Testing the online editor in the binary-trees page with valid python code
	 		Given User moves to the binary-trees page and clicks the Try here button in this Page
		  When The user write the Valid python code in Editor and Clicks Run button
  		Then The User should be able to see the output in the console

	Scenario: Testing the online editor in the binary-trees page with invalid python code
	 		Given User moves to the binary-trees page and clicks the Try here button in this Page
			When  The user write the InValid python code in Editor and Clicks Run button
			Then  The User should be able to see error message in the pop message

	Scenario: Testing the online editor in the binary-trees page with no code at all
			Given User moves to the binary-trees page and clicks the Try here button in this Page
		  When The user clicks the Run without any Codes
	    Then The User should should be in the same page with No error message
	    


  Scenario: Testing the types-of-binary-trees link in the treepage
    When user clicks the types-of-binary-trees link
    Then user will navigate to types-of-binary-trees page

Scenario: Testing the TryHere button in the types-of-binary-trees Page
  	  When User moves to the types-of-binary-trees page and clicks the Try here button in this Page
		  Then The User should be redirected to Python Editor page

	Scenario: Testing the online editor in the types-of-binary-trees page with valid python code
	 		Given User moves to the types-of-binary-trees page and clicks the Try here button in this Page
		  When The user write the Valid python code in Editor and Clicks Run button
  		Then The User should be able to see the output in the console

	Scenario: Testing the online editor in the types-of-binary-trees page with invalid python code
	 		Given User moves to the types-of-binary-trees page and clicks the Try here button in this Page
			When  The user write the InValid python code in Editor and Clicks Run button
			Then  The User should be able to see error message in the pop message

	Scenario: Testing the online editor in the types-of-binary-trees page with no code at all
			Given User moves to the types-of-binary-trees page and clicks the Try here button in this Page
		  When The user clicks the Run without any Codes
	    Then The User should should be in the same page with No error message
	    


  Scenario: Testing the implementation-in-python link in the treepage
    When user clicks the implementation-in-python link
    Then user will navigate to implementation-in-python page


Scenario: Testing the TryHere button in the implementation-in-python Page
  	  When User moves to the implementation-in-python page and clicks the Try here button in this Page
		  Then The User should be redirected to Python Editor page

	Scenario: Testing the online editor in the implementation-in-python page with valid python code
	 		Given User moves to the implementation-in-python page and clicks the Try here button in this Page
		  When The user write the Valid python code in Editor and Clicks Run button
  		Then The User should be able to see the output in the console

	Scenario: Testing the online editor in the implementation-in-python page with invalid python code
	 		Given User moves to the implementation-in-python page and clicks the Try here button in this Page
			When  The user write the InValid python code in Editor and Clicks Run button
			Then  The User should be able to see error message in the pop message

	Scenario: Testing the online editor in the implementation-in-python page with no code at all
			Given User moves to the implementation-in-python page and clicks the Try here button in this Page
		  When The user clicks the Run without any Codes
	    Then The User should should be in the same page with No error message
#	    
#

  Scenario: Testing the Binary Tree Traversals link in the treepage
    When user clicks the Binary Tree Traversals link
    Then user will navigate to Binary Tree Traversals page

Scenario: Testing the TryHere button in the Binary Tree Traversals Page
  	  When User moves to the Binary Tree Traversals page and clicks the Try here button in this Page
		  Then The User should be redirected to Python Editor page

	Scenario: Testing the online editor in the Binary Tree Traversals page with valid python code
	 		Given User moves to the Binary Tree Traversals page and clicks the Try here button in this Page
		  When The user write the Valid python code in Editor and Clicks Run button
  		Then The User should be able to see the output in the console

	Scenario: Testing the online editor in the Binary Tree Traversals page with invalid python code
	 		Given User moves to the Binary Tree Traversals page and clicks the Try here button in this Page
			When  The user write the InValid python code in Editor and Clicks Run button
			Then  The User should be able to see error message in the pop message

	Scenario: Testing the online editor in the Binary Tree Traversals page with no code at all
			Given User moves to the Binary Tree Traversals page and clicks the Try here button in this Page
		  When The user clicks the Run without any Codes
	    Then The User should should be in the same page with No error message


  Scenario: Testing the Implementation of Binary Trees link in the treepage
    When user clicks the Implementation of Binary Trees link
    Then user will navigate to Implementation of Binary Trees page

Scenario: Testing the online editor in the Implementation of Binary Trees page with valid python code
	 		Given User moves to the Binary Tree Traversals page and clicks the Try here button in this Page
		  When The user write the Valid python code in Editor and Clicks Run button
  		Then The User should be able to see the output in the console

	Scenario: Testing the online editor in the Binary Tree Traversals page with invalid python code
	 		Given User moves to the Binary Tree Traversals page and clicks the Try here button in this Page
			When  The user write the InValid python code in Editor and Clicks Run button
			Then  The User should be able to see error message in the pop message

	Scenario: Testing the online editor in the Binary Tree Traversals page with no code at all
			Given User moves to the Binary Tree Traversals page and clicks the Try here button in this Page
		  When The user clicks the Run without any Codes
	    Then The User should should be in the same page with No error message


  #Scenario: Testing the tree-traversals link in the treepage
    #When user clicks the tree-traversals link
    #Then user will navigate to tree-traversals page
    #
    #
    #
    #
#
  #Scenario: Testing the traversals-illustration link in the treepage
    #When user clicks the traversals-illustration link
    #Then user will navigate to traversals-illustration page
#
#
#
#
  #Scenario: Testing the binary-trees link in the treepage
    #When user clicks the binary-trees link
    #Then user will navigate to binary-trees page
#
#
#
#
  #Scenario: Testing the types-of-binary-trees link in the treepage
    #When user clicks the types-of-binary-trees link
    #Then user will navigate to types-of-binary-trees page
#
#
#
#
  #Scenario: Testing the implementation-in-python link in the treepage
    #When user clicks the implementation-in-python link
    #Then user will navigate to implementation-in-python page
#
#
#
#
#
  #Scenario: Testing the Binary Tree Traversals link in the treepage
    #When user clicks the Binary Tree Traversals link
    #Then user will navigate to Binary Tree Traversals page
#
#
#
  #Scenario: Testing the Implementation of Binary Trees link in the treepage
    #When user clicks the Implementation of Binary Trees link
    #Then user will navigate to Implementation of Binary Trees page
#
#
#
  #Scenario: Testing the Applications of Binary trees link in the treepage
    #When user clicks the Applications of Binary trees link
    #Then user will navigate to Applications of Binary trees page
#
  #Scenario: Testing the Binary Search Trees link in the treepage
    #When user clicks the Binary Search Trees link
    #Then user will navigate to Binary Search Trees page
#
  #Scenario: Testing the Implementation Of BST link in the treepage
    #When user clicks the Implementation Of BST link
    #Then user will navigate to Implementation Of BST page
