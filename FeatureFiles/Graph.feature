
Feature: Testing the Graph page and its functionalities in D-ALGO app

  Background: 
    Given User move to home page after login to application
    And clicking the get started button of Graph
   
  #Graph page
  Scenario: Testing the Graph link in the Graph page
    When User click on the graph link
    Then Graph page will be displayed
    
  Scenario: Testing the TryHere button in the Graph Page
     Given User moves to the graph page and clicks the Try here button in this Page
		 Then The User should be redirected to Python Editor page

	Scenario: Testing the online editor in the Graph page with valid python code
	 	 Given User moves to the graph page and clicks the Try here button in this Page
			When The user write the Valid python code in Editor and Clicks Run button
			Then The User should be able to see the output in the console

	Scenario: Testing the online editor in the Graph page with invalid python code
	 		Given User moves to the graph page and clicks the Try here button in this Page
		  When  The user write the InValid python code in Editor and Clicks Run button
			Then  The User should be able to see error message in the pop message

	Scenario: Testing the online editor in the Graph page with no code at all
			Given User moves to the graph page and clicks the Try here button in this Page
		  When The user clicks the Run without any Codes
	    Then The User should should be in the same page with No error message
	    
	#Graph Representations page
  Scenario: Testing the GraphRepresentations link in the Graph page
    When User click on the GraphRepresentations link
    Then GraphRepresentations page will be displayed
    
  Scenario: Testing the TryHere button in the Graph Representations Page
     Given User moves to the graph representations page and clicks the Try here button in this Page
		 Then The User should be redirected to Python Editor page

	Scenario: Testing the online editor in the Graph Representations page with valid python code
	 	  Given User moves to the graph representations page and clicks the Try here button in this Page
			When The user write the Valid python code in Editor and Clicks Run button
			Then The User should be able to see the output in the console

	Scenario: Testing the online editor in the Graph Representations page with invalid python code
	 	  Given User moves to the graph representations page and clicks the Try here button in this Page
		  When  The user write the InValid python code in Editor and Clicks Run button
			Then  The User should be able to see error message in the pop message

	Scenario: Testing the online editor in the Graph Representations page with no code at all
		  Given User moves to the graph representations page and clicks the Try here button in this Page
		  When The user clicks the Run without any Codes
	    Then The User should should be in the same page with No error message

