Feature: To test the functionality of Login

  Background: 
    Given User clicks the GetStarted Button at start page
    Given User clicks the Sign In link

  #Scenario: Test login with valid credentials to check 'you are logged in' message at home page
  #	  Given User enters a valid username "username" and "password" at Login page
  #	  When User clicks on Login Button
  #	  Then You are logged in message should be displayed
  #
  #Scenario: Test login with valid credentials to check the display of username at home page
  #	  Given User enters a valid username "username" and "password" at Login page
  #	  When User clicks on Login Button
  #		Then Username should be displayed as a link at the home page
  #
#	 Scenario Outline: Test login with invalid Username or Password
#		  Given User enters a username "<username>" at Login page
#		  And User enters a password "<password>" at Login page
#		  When User clicks on Login Button
#		  Then Invalid Username and Password error message should be displayed
#		  
#		  Examples:
#		  | username | password     |
#		  | Invalid  | Password@143 |
#		  | Testing  | Trial123@    |
#		  | Test123  | Trial123@    |
	  
	 Scenario Outline: Test login without entering Username or Password or both
	    Given User enters a username "<username>" at Login page
	    And User enters a password "<password>" at Login page
	    When User clicks on Login Button
	    Then Please fill out this field warning message should be displayed

    Examples: 
      | username | password     |
      |          | Password@143 |
      | Testing  |              |
      |          |              |
      
   #Scenario: Test to move to Register page from login page
     #When User clicks Register link at the Sign In page
     #Then Register page should be displayed
