Feature: Testing the functionalities of tree page
Background: 
Given User moves to home page after login to application

Scenario: Go to the homepage to treepage
Given the user should be on the Homepage
When  The User clicks the Tree_Get Started button in the Home page
Then The user should be able to navigate to the Tree Page 
Scenario:
 Testing the "Try Here" button in the Overview of Trees page
Given User is in the Overview of Trees page and clicks Try Here button
When User type print("Hello World") in the Editor box and clicks Run button
Then User should see "Hello World"  in the console output