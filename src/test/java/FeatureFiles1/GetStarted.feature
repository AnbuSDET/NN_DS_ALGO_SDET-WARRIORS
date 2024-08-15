Feature: Testing the Start Page feature

  Scenario: Testing the GetStarted button
    When User clicks the GetStarted button at start page 
    Then Home page should be displayed
    
  Scenario: Verify the display of Copyright@NumpyNinja2021 at Start Page
     Then Copyright@NumpyNinja2021 is displayed at Start page

  