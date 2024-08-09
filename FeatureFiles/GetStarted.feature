Feature: Testing the Start Page feature

  Scenario: Testing the GetStarted Button
    When User clicks the GetStarted Button at start page 
    Then Home page should be displayed
    
  Scenario: Verify the display of Copyright@NumpyNinja2021 at Start Page
     Then Copyright@NumpyNinja2021 is displayed at Start page

  