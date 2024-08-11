Feature: Testing the functionalities of tree page
Background: Login to the DS ALGO Application

Given The user is logged in to the application with Valid credentials
When  The User clicks the Tree_Get Started button in the Home page
Then The user should be able to navigate to the Tree Page 

Scenario: Testing the Sign out link in the DS Introduction page
	
	Given The user is in the DS Introduction page
	When The user clicks the sign out button		
	Then The user should be signed out successfully and got error message