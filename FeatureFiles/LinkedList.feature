@LinkedList
Feature: Testing the LinkedList page and its functionalities in NumpyNinja app
  I want to use this template for my feature file

Background: 
   Given User move to home page after login to application
   And clicking the get started of linked list
   And The user is in the LinkedList page after successful login
 
@Introduction
Scenario: Testing the Introduction tab in LinkedList page
  
  When The user clicks Introduction tab in the page
  Then The user should be redirected to the Introduction Page
    
Scenario: Testing the TryHere button in the LinkedList Introduction Page
 
  Given The user is in the Linked List Introduction Page
 When The user clicks the TryHere button int the LinkedList Page
 Then The user should be redirected to a page having the online editor console with run button
 
 Scenario: Testing the online editor in the LL page with valid python code
 		Given The user is in the try editor page of the Linked List  
 		When The user enters valid python code and press Run button
 		Then The user should see the code getting executed and output is displayed 
 		
 Scenario: Testing the online editor in the LL pagewith invalid python code
 		Given The user is in the try editor page of the Linked List 
  	        When The user enters invalid python code and press Run button
 		Then The user should see the code is not executed and error message pops up
 		
 Scenario: Testing the online editor in the LL pagewith no code at all
		 Given The user is in the try editor page of the Linked List 		
		 When The user enters no python code and press Run button
 		 Then The user should see no error message and stay in the same online editor page
 		
 		@CreatingALinkedList
 		
 		Scenario: Testing the Creating a LinkedList tab in LinkedList page
 		Given The user is in the LinkedList HomePage
 		When The user clicks Creating a linked list tab
 		Then The user should be redirected to the creating linked list page
 		
 		Scenario: Testing the "Try Here" button in the CreatingALinkedList page
 		Given The user is in the CreatingALinkedList page after successful login
 		When The user clicks the TryHere button in the CreatingALinkedList Page
 		Then The user should be redirected to the Try editor console page

   		 Scenario: Testing the online editor in the LL page with valid python code
 		Given The user is in the try editor page of the Linked List  
 		When The user enters valid python code and press Run button
 		Then The user should see the code getting executed and output is displayed 
 		
 Scenario: Testing the online editor in the LL pagewith invalid python code
 		Given The user is in the try editor page of the Linked List 
  	        When The user enters invalid python code and press Run button
 		Then The user should see the code is not executed and error message pops up
 		
 Scenario: Testing the online editor in the LL pagewith no code at all
		 Given The user is in the try editor page of the Linked List 		
		 When The user enters no python code and press Run button
 		 Then The user should see no error message and stay in the same online editor page

 		
 		@TypesOfLinkedlist
 		
 		Scenario: Testing the Types of Linked List tab in LinkedList page
 		Given The user is in the LinkedList HomePage
 		When The user clicks Types of linked list tab
 		Then The user should be redirected to the Types of linked list page
 		
 		Scenario: Testing the Try Here button in the TypesofLinkedList page
 		Given The user is in the TypesofLinkedList page after successful login
 		When The user clicks the TryHere button in the TypesOfLinkedList Page
 		Then The user should be redirected to the Try editor console page

    Scenario: Testing the online editor in the LL page with valid python code
 		Given The user is in the try editor page of the Linked List  
 		When The user enters valid python code and press Run button
 		Then The user should see the code getting executed and output is displayed 
 		
 Scenario: Testing the online editor in the LL pagewith invalid python code
 		Given The user is in the try editor page of the Linked List 
  	        When The user enters invalid python code and press Run button
 		Then The user should see the code is not executed and error message pops up
 		
 Scenario: Testing the online editor in the LL pagewith no code at all
		 Given The user is in the try editor page of the Linked List 		
		 When The user enters no python code and press Run button
 		 Then The user should see no error message and stay in the same online editor page

 		
 		@ImplementLinkedList
 		
 		Scenario: Testing the Implement Linked List in Python tab in LinkedList page
 		Given The user is in the LinkedList HomePage
 		When The user clicks Implement linked list tab
 		Then The user should be redirected to the Implement linked list page
 		
 		Scenario: Testing the Try Here button in the ImplementLinkedList page
 		Given The user is in the ImplementLinkedList page after successful login
 		When The user clicks the TryHere button in the ImplementLinkedList Page
 		Then The user should be redirected to the Try editor console page

    Scenario: Testing the online editor in the LL page with valid python code
 		Given The user is in the try editor page of the Linked List  
 		When The user enters valid python code and press Run button
 		Then The user should see the code getting executed and output is displayed 
 		
 Scenario: Testing the online editor in the LL pagewith invalid python code
 		Given The user is in the try editor page of the Linked List 
  	        When The user enters invalid python code and press Run button
 		Then The user should see the code is not executed and error message pops up
 		
 Scenario: Testing the online editor in the LL pagewith no code at all
		 Given The user is in the try editor page of the Linked List 		
		 When The user enters no python code and press Run button
 		 Then The user should see no error message and stay in the same online editor page

 		
 		@travesal
 		
 		Scenario: Testing the Traversal tab in LinkedList page
 		Given The user is in the LinkedList HomePage
 		When The user clicks Creating a Traversal tab
 		Then The user should be redirected to the Traversal page
 		
 		Scenario: Testing the "Try Here" button in the Traversal page
 		Given The user is in the Traversal page after successful login
 		When The user clicks the TryHere button in the Traversal Page
 		Then The user should be redirected to the Try editor console page

    Scenario: Testing the online editor in the LL page with valid python code
 		Given The user is in the try editor page of the Linked List  
 		When The user enters valid python code and press Run button
 		Then The user should see the code getting executed and output is displayed 
 		
 Scenario: Testing the online editor in the LL pagewith invalid python code
 		Given The user is in the try editor page of the Linked List 
  	        When The user enters invalid python code and press Run button
 		Then The user should see the code is not executed and error message pops up
 		
 Scenario: Testing the online editor in the LL pagewith no code at all
		 Given The user is in the try editor page of the Linked List 		
		 When The user enters no python code and press Run button
 		 Then The user should see no error message and stay in the same online editor page

 		
 		@Insertion
 		
 Scenario: Testing the Insertion tab in LinkedList page
 		Given The user is in the LinkedList HomePage
 		When The user clicks Insertion tab
 		Then The user should be redirected to the Insertion page
 		
 Scenario: Testing the "Try Here" button in the Insertion page
 		Given The user is in the Insertion page after successful login
 		When The user clicks the TryHere button in the Insertion Page
 		Then The user should be redirected to the Try editor console page

Scenario: Testing the online editor in the LL page with valid python code
 		Given The user is in the try editor page of the Linked List  
 		When The user enters valid python code and press Run button
 		Then The user should see the code getting executed and output is displayed 
 		
 Scenario: Testing the online editor in the LL pagewith invalid python code
 		Given The user is in the try editor page of the Linked List 
  	        When The user enters invalid python code and press Run button
 		Then The user should see the code is not executed and error message pops up
 		
 Scenario: Testing the online editor in the LL pagewith no code at all
		 Given The user is in the try editor page of the Linked List 		
		 When The user enters no python code and press Run button
 		 Then The user should see no error message and stay in the same online editor page

 		
 		@Deletion
 		
 Scenario: Testing the Deletion tab in LinkedList page
 		Given The user is in the LinkedList HomePage
 		When The user clicks Deletion tab
 		Then The user should be redirected to the Deletion page
 		
 Scenario: Testing the "Try Here" button in the Deletion page
 		Given The user is in the Deletion page after successful login
 		When The user clicks the TryHere button in the Deletion Page
 		Then The user should be redirected to the Try editor console page

 Scenario: Testing the online editor in the LL page with valid python code
 		Given The user is in the try editor page of the Linked List  
 		When The user enters valid python code and press Run button
 		Then The user should see the code getting executed and output is displayed 
 		
 Scenario: Testing the online editor in the LL pagewith invalid python code
 		Given The user is in the try editor page of the Linked List 
  	        When The user enters invalid python code and press Run button
 		Then The user should see the code is not executed and error message pops up
 		
 Scenario: Testing the online editor in the LL pagewith no code at all
		 Given The user is in the try editor page of the Linked List 		
		 When The user enters no python code and press Run button
 		 Then The user should see no error message and stay in the same online editor page

 		
 		@PracticeQnsLinkedList
 		
 		Scenario: Testing the Practice Questions link in the LL page
 		Given The user is in the LinkedList Page
 		When The user clicks practice qns tab 
 		Then The user should be redirected to the practice qns page
 		
 		
 		
