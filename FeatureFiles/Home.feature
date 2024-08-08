Feature: To test the features of Home Page

  Background: 
    Given User click the GetStarted Button at start page 
    
    Scenario: Testing click of any Get Started Button at Home page should not enter into corresponding page without signing in.
         When Get Started button is clicked without login the corresponding page should not be displayed
      
      
    
