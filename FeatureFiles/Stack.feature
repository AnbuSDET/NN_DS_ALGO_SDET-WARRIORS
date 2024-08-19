
Feature: Testing the Stack page and its functionalities in NumpyNinja app
 
Background: 
	Given User move to home page after login to application
  And clicking the get started of Stack
  And The user is in the Stack page after successful login
 
	#Operations in stack
	
	Scenario: Testing the Operations tab in Stackpage
  
  When The user clicks Operations tab in the Stackpage
  Then The user should be redirected to the Operations Page
  
Scenario: Testing the TryHere button in the StackOperationspage 
 
  Given The user is in the StackOperationspage
 When The user clicks the Try here button in the StackOperationspage
  Then The user should be redirected to the Try editor console page

 
 Scenario: Testing the online editor in the StackOperationspage with valid python code
 		Given The user is in the try editor page of the StackOperationspage  
 		When The user write the Valid python code in Editor and Clicks Run button
		Then The User should be able to see the output in the console

 Scenario: Testing the online editor in the StackOperationspage invalid python code
 		Given The user is in the try editor page of the StackOperationspage
    When  The user write the InValid python code in Editor and Clicks Run button
		Then  The User should be able to see error message in the pop message

 Scenario: Testing the online editor in the StackOperationspage no code at all
	 Given The user is in the try editor page of the StackOperationspage 		
	 When The user clicks the Run without any Codes
Then The User should should be in the same page with No error message
	 	 
	

 	#Implementations
 	
 		Scenario: Testing the Implementations tab in Stackpage
  
  When The user clicks Implementations tab in the Stackpage
  Then The user should be redirected to the Implementations Page
  
Scenario: Testing the TryHere button in the StackImplementationspage 
 
  Given The user is in the StackImplementationspage
 When The user clicks the Try here button in the StackImplementationspage
  Then The user should be redirected to the Try editor console page

 
 Scenario: Testing the online editor in the StackImplementationspage with valid python code
 		Given The user is in the try editor page of the StackImplementationspage  
 		When The user write the Valid python code in Editor and Clicks Run button
		Then The User should be able to see the output in the console

 Scenario: Testing the online editor in the StackImplementationspage invalid python code
 		Given The user is in the try editor page of the StackImplementationspage
    When  The user write the InValid python code in Editor and Clicks Run button
		Then  The User should be able to see error message in the pop message

 Scenario: Testing the online editor in the StackImplementationspage no code at all
	 Given The user is in the try editor page of the StackImplementationspage 		
	 When The user clicks the Run without any Codes
Then The User should should be in the same page with No error message
	 	 
	
 	
 	#Applications
 	
 		Scenario: Testing the Applications tab in Stackpage
  
  When The user clicks Applications tab in the Stackpage
  Then The user should be redirected to the Applications Page
  
Scenario: Testing the TryHere button in the StackApplicationspage 
 
  Given The user is in the StackApplicationspage
 When The user clicks the Try here button in the StackApplicationspage
  Then The user should be redirected to the Try editor console page

 
 Scenario: Testing the online editor in the StackApplicationspage with valid python code
 		Given The user is in the try editor page of the StackApplicationspage  
 		When The user write the Valid python code in Editor and Clicks Run button
		Then The User should be able to see the output in the console

 Scenario: Testing the online editor in the StackApplicationspage invalid python code
 		Given The user is in the try editor page of the StackApplicationspage
    When  The user write the InValid python code in Editor and Clicks Run button
		Then  The User should be able to see error message in the pop message

 Scenario: Testing the online editor in the StackApplicationspage no code at all
	 Given The user is in the try editor page of the StackApplicationspage 		
	 When The user clicks the Run without any Codes
Then The User should should be in the same page with No error message
	 	 
	
 	
 	#Practice Questions
 	
 	Scenario: Testing the Practice Questions link in the LinkedList Page

Given The user is in the StackOperationspage
When The user clicks practice questions link 
Then The user should be redirected to the Practice question Page 
 