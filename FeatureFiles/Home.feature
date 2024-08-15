Feature: To test the features of Home Page

  Background: 
    Given User clicks the GetStarted button at start page

  Scenario: Testing click of "<topic>" Get Started button at Home page should NOT ENTER into "<topic>" page WITHOUT sign in .
    When Click Get Started button of "<topic>" topic login
    Then You are not logged in error message is displayed

    Examples: 
      | topic         |
      | DataStructure |
      | Array         |
      | Linked List   |
      | Stack         |
      | Queue         |
      | Tree          |
      | Graph         |
      
   Scenario: Testing click of "<topic>" Get Started button at Home page SHOULD ENTER into "<topic>" page AFTER sign in.
      Given User sign in to the app with valid username "username" and "password"
      When Click Get Started button of "<topic>" topic login
      Then The "<topic>" page should be displayed

    Examples: 
      | topic         |
      | DataStructure |
      | Array         |
      | Linked List   |
      | Stack         |
      | Queue         |
      | Tree          |
      | Graph         |
