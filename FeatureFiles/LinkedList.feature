@LinkedList
Feature: Testing the LinkedList page and its functionalities in NumpyNinja app
  I want to use this template for my feature file

Background: 
Given Getstarted clicked
And Sign in to the application with valid username and password
And clicking the get started of linked list

 @Introduction
  Scenario: Testing the Introduction tab in LinkedList page
    When The user clicks Introduction tab in the page
    Then The user should be redirected to the Introduction Page
    
 
 Scenario: Testing the TryHere button in the LinkedList Page
	 	When The user clicks the TryHere button int the LinkedList Page
 		Then The user should be redirected to a page having the online editor console with "run" button
 
 Scenario: Testing the online editor in the LL page with valid python code
 		When The user enters valid python code and press Run button
 		Then The user should see the code getting executed and output is displayed 
 		
 Scenario: Testing the online editor in the LL pagewith invalid python code
 		When The user enters invalid python code and press Run button
 		Then The user should see the code is not executed and error message pops up
 		
 Scenario: Testing the online editor in the LL pagewith no code at all
 		When The user enters no python code and press Run button
 		Then The user should see no error message and stay in the same online editor page