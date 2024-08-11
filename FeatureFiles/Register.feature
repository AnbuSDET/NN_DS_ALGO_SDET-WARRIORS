Feature: To test the functionality of Register page

  Background: 
    Given User clicks the GetStarted Button at start page
    And User clicks the Register link at home page

  Scenario: Test to register a new user with valid details
    Given User provides valid username "username" password "password" and password confirmation "password_confirmation" details at register page
    When User clicks the Register button
    Then New Account Created message is displayed at home page

  Scenario: Test to register a new user with valid details
    Given User provides valid username "username" password "password" and password confirmation "password_confirmation" details at register page
    When User clicks the Register button
    Then User should be signed in with newly registered username link

  Scenario: Test to register a new user with an existing password
    Given User provides NEW username "username" and an ALREADY existing "password" and "password confirmation" details
    When User clicks the Register button
    Then New Account Created message is displayed at home page

  Scenario: Test to register a new user with different password and password confirmation details
    Given User provides valid username "username" but different password "password" and password confirmation "pwd-confirm" details
    When User clicks the Register button
    Then Error message stating password mismatch should be displayed

  Scenario: Test to register a new user with an existing username
    Given User provides EXISTING username "username" but valid password "password" and password confirmation "pwd-confirm" details
    When User clicks the Register button
    Then Error message stating username already exists should be displayed
    
  
  Scenario Outline: Test to register a new user with unaccepted password details
    Given User provides valid username "<username>" but unaccepted password "<password>" data
    When User clicks the Register button
    Then Error message stating password setting rules should be displayed

    Examples: 
      | username  | password     |
      | dfsjdfhgh | trial12      |
      | jgfgfggfh |     12345678 |
      | fdjfhjdsf | Password@143 |

  Scenario: Test to move to login page from register page
    When User clicks the Login link at the bottom of Register page
    Then Sign In page must be displayed

  
  Scenario Outline: Test to register a new user without providing username or password or password confirmation details
    Given User enters a valid username "<username>" and password  "<password>" and password confirmation "<pwd_confirm>" details
    When User clicks the Register button
    Then Validation message Please Fill Out This Field should be displayed at "<username>" "<password>" "<pwd_confirm>" missed field

    Examples: 
      | username  | password  | pwd_confirm |
      |           | Tiger@123 | Tiger@123   |
      | Tryuser12 |           | Tiget@123   |
      | Tryuser12 | Tiget@123 |             |
