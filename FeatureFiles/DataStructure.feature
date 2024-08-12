Feature: Testing the Data Structures Intoduction Page

Background: Login to the Ds-Algo Page

Given The User is in the Home page after clicking the Get started button 
Then The user clicks SignIn button in Home Page
Then The User Enters the user name in the Username field
And The User enters the password in the Password field
Then The user clicks the Login button
Then the User should be able to login to the application


Scenario: Testing the DS Introduction get started button in Home Page

Given The user is in the home Page after logged In
When The user clicks the Get started button for DS Introduction tab 
Then The user should be Redirected to the DS Introduction Page 


Scenario: Testing the Time Complexity Link in DS-Introduction Page

Given The User is in the DS Introduction Page after Logged In
When The User clicks the Time Complexity link in the bottom of the Page
Then The User should be Redirected to the Time Complexity Page

Scenario: Testing the Practice Questions link in the Time Complexity Page

Given The User in the Time Complexity Page 
When The user clicks practice questions link 
Then The user should be redirected to the Practice question Page 


 Scenario: Testing the Time Complexity link in the left panel of the Time Complexity Page
 
 Given The User is in the Time Complexity Page 
 When The user clicks Time Complexity link in the left panel
 Then The user should be stayed in the same Time Complexity Page
 
 
 Scenario: Testing the Try here button in the Time complexity Page
 
 Given The User is in the  DS_Time Complexity Page after login
 When The user clicks the Try here button in the time complexity page
 Then The User should be redirected to DS_Try Editor page
 
 
Scenario: Testing the DS-Python Try Editor page without any Python codes

Given The User is in the DS-Python Try Editor page  
When The user clicks the Run without any Codes
Then The User should should be in the same page with No error message


Scenario: Testing the DS-Python Try Editor page with Valid any Python codes

Given The User in the DS-Python Try Editor page 
When The user write the Valid python code in Editor and Clicks Run button
Then The User should be able to see the output in the console


Scenario: Testing the DS-Python Try Editor page with InValid any Python codes

Given The User in the DS-Python Try Editor page after clicking Try Here button
When  The user write the InValid python code in Editor and Clicks Run button
Then  The User should be able to see error message in the pop message

	
	Scenario: Testing the Sign out link in the DS Introduction page
	
	Given The user is in the DS Introduction page
	When The user clicks the sign out button		
	Then The user should be signed out successfully and got error message
