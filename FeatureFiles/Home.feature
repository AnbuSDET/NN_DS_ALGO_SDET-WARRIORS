Feature: To test the features of Home Page

  Background: 
    Given User clicks the GetStarted button at start page
    
  @Trial
  Scenario Outline: Testing click of "<topic>" Get Started button at Home page should NOT ENTER into "<topic>" page WITHOUT sign in .
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
  
  
  Scenario Outline: Testing click of "<topic>" Get Started button at Home page SHOULD ENTER into "<topic>" page AFTER sign in.
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
  
  
  Scenario Outline: Testing selection of any "<topic>" topic from Data Structures drop-down WITHOUT sign in should throw a YOU ARE NOT LOGGED IN error message
	  When User clicks on "<topic>" value in DataStructures drop down
	  Then You are not logged in error message is displayed
	  
	  Examples:
	  | topic         |
	  | Array         |
	  | Linked List   |
	  | Stack         |
	  | Queue         |
	  | Tree          |
	  | Graph         |
  
  
  Scenario Outline: Testing selection of any "<topic>" topic from Data Structures drop-down AFTER sign in SHOULD ENTER into that "<topic>" page
	  Given User sign in to the app with valid username "username" and "password"
	  When User clicks on "<topic>" value in DataStructures drop down
	  Then The "<topic>" page should be displayed
	  
	  Examples:
	  | topic         |
	  | Array         |
	  | Linked List   |
	  | Stack         |
	  | Queue         |
	  | Tree          |
	  | Graph         |
	  
  
   Scenario Outline: Testing the click of Numpy Ninja link from "<topic>" topic page moves to the Start page AFTER Sign In
	    Given User sign in to the app with valid username "username" and "password"
	    And Click Get Started button of "<topic>" topic login
	    And The "<topic>" page should be displayed
	    When User clicks the Numpy Ninja link at the top from "<topic>" page 
	    Then The Start page should be displayed.
	    
	    Examples:
	      | topic         |
	      | DataStructure |
	      | Array         |
	      | Linked List   |
	      | Stack         |
	      | Queue         |
	      | Tree          |
	      | Graph         |
      
   Scenario Outline: Testing the click of Numpy Ninja link from Home page moves to the Start page AFTER Sign In
	    Given User sign in to the app with valid username "username" and "password"
	    When User clicks the Numpy Ninja link at the top from that page  
	    Then The Start page should be displayed.
	    
    
   Scenario Outline: Testing the click of Numpy Ninja link from Home page WITHOUT Signing In moves to the Start page 
	    When User clicks the Numpy Ninja link at the top from that page  
	    Then The Start page should be displayed.
	    
	    
	 Scenario Outline: Testing the click of Numpy Ninja link from Sign In page moves to the Start page 
	    Given User clicks the Sign In link
	    When User clicks the Numpy Ninja link at the top from that page 
	    Then The Start page should be displayed.
	    
	 Scenario Outline: Testing the click of Numpy Ninja link from Register page moves to the Start page 
	    Given User clicks the Sign In link
	    When User clicks the Numpy Ninja link at the top from that page 
	    Then The Start page should be displayed.
    
  
    
    
     
    
