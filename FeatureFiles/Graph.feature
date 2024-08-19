Feature: Testing the Graph page and its functionalities in DA-ALGO app

  Background: 
    Given User move to home page after login to application
    And clicking the get started of Graph
    And The user is in the Graph after successful login

  #Graph
  Scenario: Testing the Graph link in the Graph page
    When User click on the graph link
    Then Graph page will be displayed

  Scenario: Testing the GraphRepersentations link in the Graph page
    When User click on the GraphRepersentations link
    Then GraphRepersentations page will be displayed
