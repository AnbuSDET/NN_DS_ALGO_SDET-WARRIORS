Feature: Testing the functionalities of Array Page

Background: Login to the DS ALGO Application

 Given User moves to home page after login to application
 When The User clicks the Array Get Started button
 Then The User should navigate to the Array Page
 
## Array Page

Scenario: Testing the Arrays in Python link in Array Page

Given The User is in the Array Page 
When The User clicks the Arrays in Python link in the array Page
Then The User should be redirected to the Arrays In Python Page

Scenario: Testing the arrays-using-list  Link in Array Page

Given The User is in the Array Page
When The User clicks the arrays-using-list link in the array Page
Then The User should be redirected to the arrays-using-list Page


Scenario: Testing the Arrays in Basic Operations List link from Array Page

Given The User is in the Array Page 
When The User clicks the Basic Opearations List link in the array Page
Then The User should be redirected to the Basic Opearations List link Page


Scenario: Testing the Arrays in Applications of Array link from Array Page

Given The User is in the Array Page
When The User clicks the Applications of Array link in the array Page
Then The User should be redirected to the Applications of Array link Page


## Arrays in Python Page Scenarios

Scenario: Testing the  Arrays in Python Page Try Here button 

Given The user is in Arrays in Python Page
When The user clicks the Try here button in this Page
Then The User should be redirected to Python Editor page


Scenario: Testing the  Arrays in Python Page - Python Editor with Valid Python codes

Given The user is in the Arrays in Python Page PY Editor Page
When The user write the Valid python code in Editor and Clicks Run button
Then The User should be able to see the output in the console

Scenario: Testing the  Arrays in Python Page - Python Editor with In-Valid Python codes

Given  The user is in the Arrays in Python Page PY Editor Page
When The user write the Valid python code in Editor and Clicks Run button
Then The User should be able to see the output in the console

Scenario: Testing the  Arrays in Python Page - Python Editor without Python codes

Given The user is in the Arrays in Python Page PY Editor Page
When The user clicks the Run without any Codes
Then The User should should be in the same page with No error message 


## Left Panel links Scenarios

Scenario: Testing the Arrays In Python link in left panel links 


Given The user is in Arrays in Python Page
Then The user clicks the  Arrays in Python link from the left panel
Then The user should stayed in the same Arrays in Python Page


Scenario: Testing the Arrays Using List link in left panel links 

Given The user is in Arrays in Python Page
When The user clicks the Arrays Using List link in the array Page from the left panel
Then The User should be redirected to the arrays-using-list Page

Scenario: Testing the --  Basic Operations in List link in left panel links 

Given The user is in Arrays in Python Page
When The user clicks the Basic Operations in List link in the array Page from the left panel
Then The User should be redirected to the Basic Opearations List link Page 

Scenario: Testing the Applications of Array link in left panel links 

Given The user is in Arrays in Python Page
When The user clicks the Applications of Array in the array Page from the left panel
Then The User should be redirected to the Applications of Array link Page


Scenario: Testing the Practice Questions in List link in left panel links 

Given The user is in Arrays in Python Page
When The user clicks the Practice Questions  in the array Page from the left panel
Then The user should be Redirected to the Practice Questions Page


#     Arrays using list Scenarios


Scenario: Testing the  Arrays using list Python Editor page with Valid Python codes

Given The user is in the Arrays using list PY Editor Page
When The user write the Valid python code in Editor and Clicks Run button
Then The User should be able to see the output in the console


Scenario: Testing the  Arrays using list Page - Python Editor with In-Valid Python codes

Given The user is in the Arrays using list PY Editor Page
When The user write the Valid python code in Editor and Clicks Run button
Then The User should be able to see the output in the console


Scenario: Testing the  Arrays using list Page - Python Editor without Python codes

Given The user is in the Arrays using list PY Editor Page
When The user clicks the Run without any Codes
Then The User should should be in the same page with No error message 


Scenario: Testing the Try here in arrays-using-list Page

Given The user is in the arrays-using-list page
When The user clicks the Try here button in this Page
Then The User should be redirected to Python Editor page


 ## Basic Operations Page Scenarios
 
 
 Scenario: Testing the  Basic Operations in Lists Python Editor page with Valid Python codes

Given The user is in the Basic Operations in Lists PY Editor Page
When The user write the Valid python code in Editor and Clicks Run button
Then The User should be able to see the output in the console


Scenario: Testing the  Basic Operations Page - Python Editor with In-Valid Python codes

Given The user is in the Basic Operations in Lists PY Editor Page
When The user write the Valid python code in Editor and Clicks Run button
Then The User should be able to see the output in the console


Scenario: Testing the  Basic Operations Page - Python Editor without Python codes

Given The user is in the Basic Operations in Lists PY Editor Page
When The user clicks the Run without any Codes
Then The User should should be in the same page with No error message 


Scenario: Testing the Try here in Basic Operations Page

Given The user is in the Basic Operations in Lists page
When The user clicks the Try here button in this Page
Then The User should be redirected to Python Editor page

 
 ## Applications of array Page Scenarios
 

 Scenario: Testing the Applications of array Python Editor page with Valid Python codes

Given The user is in the Applications of array PY Editor Page
When The user write the Valid python code in Editor and Clicks Run button
Then The User should be able to see the output in the console

Scenario: Testing the  Applications of array - Python Editor with In-Valid Python codes

Given The user is in the Applications of array PY Editor Page
When The user write the Valid python code in Editor and Clicks Run button
Then The User should be able to see the output in the console


Scenario: Testing the  Applications of array - Python Editor without Python codes

Given The user is in the Applications of array PY Editor Page
When The user clicks the Run without any Codes
Then The User should should be in the same page with No error message 


Scenario: Testing the Try here in Applications of array page

Given The user is in the Applications of array in Lists page
When The user clicks the Try here button in this Page
Then The User should be redirected to Python Editor page  


## Python Editor Search the array -> Valid and Invalid


 Scenario: Testing the Search the array Practice question with In-Valid Python codes
 
Given The user is in the Search the array Practice question Editor Page
When The user passed the Invalid '<Rownumber>' python code in the Python Editor 
Then The user should get the '<alert_RomNumber>' alert Message 


Scenario: Testing the Search the array Practice question with Valid Python codes  
 
Given The user is in the Search the array Practice question Editor Page
When The user passed the valid '<Rownumber>' python code in the Python Editor 
Then The user should see the output '<OutputRowNum>' in the console



## Python Editor Max Consecutive one Page -> Valid and Invalid



Scenario: Testing the python Editor in Max Consecutive one Page with Valid Codes 

Given The user is in the Max consecutive one Python Editor Page
When The user passed the Valid '<rownumber>' python code for Max Consecutive one
Then The user should see the Valid output '<OutputRowNum_3>' in the console



Scenario: Testing the python Editor in Max Consecutive one Page with In-Valid Codes

Given The user is in the Max consecutive one Python Editor Page
When The user passed the In-Valid '<rownumber>' python code for Max Consecutive one
Then The user should get the Alert '<alert_RomNumber_4>'  Message in the Pop Up

  
   ## Python Editor Find Numbers with Even number of digits -> Valid and Invalid
   

Scenario: Testing the Find Numbers with Even number of digits question page with valid codes 

Given The user is in the Find Numbers with Even number of digits Python Editor Page
When The user passed the Valid Python codes '<ExcelRowNum>' for the Python Editor Page
Then The user should see the correct '<Outout_RowNum_5>' output in the console



Scenario: Testing the Find Numbers with Even number of digits question page with In-valid codes 

Given The user is in the Find Numbers with Even number of digits Python Editor Page
When The user passed the In-Valid Python codes '<ExcelRowNum>' for the Python Editor Page
Then The user should get the alert Message '<Alert_RowNumber_6>' in the pop up for Even number Question

 
 
 ## Python Editor Squares of Sorted array -> Valid and Invalid
 

Scenario: Testing the Squares of Sorted array question with Valid codes 

Given The User is  in the Squares of Sorted array Page Python Editor
When The user passed the Valid Python codes '<ExcelRowNum>' for the Squares of Sorted array Python Editor Page
Then The user should see the Corresponding output '<Outout_RowNum_7>' in the console



Scenario: Testing the Squares of Sorted array question with In-Valid codes

Given The User is  in the Squares of Sorted array Page Python Editor
When The user passed the In-Valid Python codes '<ExcelRowNum>' for the Squares of Sorted array Python Editor Page
Then The user should get the alert Message '<Alert_RowNumber_8>' for the Sorted array Python Editor Page




## Search the array  ->Submit button # Negative Scenario --> It will fail  --> Bug


Scenario: Testing the Submit button valid codes in Search the array Practice question   

Given The user is in the Search the array Practice question Editor Page
When The user clicks the submit button with '<rowNum>' Valid Codes
Then The should see the submission successful message '<Success_RowNumer_9>' in the console



## Max Consecutive one Page -> Submit button


Scenario: Testing the Submit button with valid codes in Max Consecutive one Page Python Editor

Given The user is in the Max consecutive one Python Editor Page
When  The user clicks the submit button with '<rowNumber>' Valid Codes in Max Consecutive one Page
Then The user should see the success message '<Success_RowNumer_10>' in the console for Max Consecutive one Page



## Find Numbers with Even number of digits question--> Submit Button  # Negative Scenario --> It will fail  --> Bug


Scenario: Testing the Submit button with valid codes in Find Numbers with Even number of digits question page Python Editor 


Given The user is in the Find Numbers with Even number of digits Python Editor Page
When The user clicks the submit button with '<rowNumber>' Valid codes in Even number of digits question page
Then The should see the submission successful message '<Success_RowNumer_11>' in the console for Even number of digits question page



## Python Editor Squares of Sorted array  -> Submit button 


Scenario: Testing the Submit button valid codes in Squares of a Sorted Array

Given The User is  in the Squares of Sorted array Page Python Editor
When The user clicks the Submit button with '<rownumber>' Valid codes in Squares of a sorted Array Page
Then The should see the  successful message in the console '<Success_RowNumer_12>' in the console for Squares of a sorted Array Page









