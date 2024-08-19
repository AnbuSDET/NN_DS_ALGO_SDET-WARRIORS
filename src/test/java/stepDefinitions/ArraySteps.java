package stepDefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Factory.BaseClass;
import Utilities.DataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.DataStructurePage;
import pageObjects.HomePage;

public class ArraySteps {
	
	WebDriver driver;
	Properties p;
	Logger logger = BaseClass.getLogger();
	
	List<HashMap<String, String>> datamap;
	
	ArrayPage Ap = new ArrayPage(BaseClass.getDriver());	
	
	@When("The User clicks the Array Get Started button")
	public void the_user_clicks_the_array_get_started_button() {
		logger.info("Clicking the Array Page After Login..........");
		HomePage Hp = new HomePage(BaseClass.getDriver());
		Hp.clickArrayGetStarted();
	}

	@Then("The User should navigate to the Array Page")
	public void the_user_should_navigate_to_the_array_page() {
	   
		String CurtURL= BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(true, CurtURL.contains("array"));
	}

	// Testing the Arrays in Python link in Array Page
	
	@Given("The User is in the Array Page")
	public void the_user_is_in_the_array_page() {
		String CurtURL= BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(true, CurtURL.contains("array"));
		
	}	
	
	@When("The User clicks the Arrays in Python link in the array Page")
	public void the_user_clicks_the_arrays_in_python_link_in_the_array_page() {
	    
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ArraysInPython_Btn();
	}

	@Then("The User should be redirected to the Arrays In Python Page")
	public void the_user_should_be_redirected_to_the_arrays_in_python_page() {
	    String CurrentURL = BaseClass.getDriver().getCurrentUrl();
	    Assert.assertEquals(true, CurrentURL.contains("python"));
	}

	// Testing the arrays-using-list  Link in Array Page
	

	@When("The User clicks the arrays-using-list link in the array Page")
	public void the_user_clicks_the_arrays_using_list_link_in_the_array_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ArraysUsingList_Btn();
		
	}

	@Then("The User should be redirected to the arrays-using-list Page")
	public void the_user_should_be_redirected_to_the_arrays_using_list_page() {
		String CurrentURL = BaseClass.getDriver().getCurrentUrl();
	    Assert.assertEquals(true, CurrentURL.contains("using"));
		
	}

	
	// Testing the Arrays in Basic Operations List link from Array Page
	
	@When("The User clicks the Basic Opearations List link in the array Page")
	public void the_user_clicks_the_basic_opearations_list_link_in_the_array_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_BasicOperations_Btn();
	}

	@Then("The User should be redirected to the Basic Opearations List link Page")
	public void the_user_should_be_redirected_to_the_basic_opearations_list_link_page() {
		String CurrentURL = BaseClass.getDriver().getCurrentUrl();
	    Assert.assertEquals(true, CurrentURL.contains("operations"));
	}

	// Testing the Arrays in Applications of Array link from Array Page
	
	
	@When("The User clicks the Applications of Array link in the array Page")
	public void the_user_clicks_the_applications_of_array_link_in_the_array_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ApplicationsOfArray_Btn();
	}

	
	
	@Then("The User should be redirected to the Applications of Array link Page")
	public void the_user_should_be_redirected_to_the_applications_of_array_link_page() {
		String CurrentURL = BaseClass.getDriver().getCurrentUrl();
	    Assert.assertEquals(true, CurrentURL.contains("applications"));
	}
	
	
	// Testing the  Arrays in Python Page Try Here button

	@Given("The user is in Arrays in Python Page")
	public void the_user_is_in_arrays_in_python_page() {
	    
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ArraysInPython_Btn();
	}
	
	// 

	@Given("The user is in the Arrays in Python Page PY Editor Page")
	public void the_user_is_in_the_arrays_in_python_page_py_editor_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ArraysInPython_Btn();
			Ap.Click_TryhereBtn();
	}

	
	// Testing the Arrays In Python link in left panel links 
	
	@Then("The user clicks the  Arrays in Python link from the left panel")
	public void the_user_clicks_the_arrays_in_python_link_from_the_left_panel() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_LeftPanel_ArraysInPyhton_Btn();
	}
	
	@Then("The user should stayed in the same Arrays in Python Page")
	public void the_user_should_stayed_in_the_same_arrays_in_python_page() {
		String CurrentURL = BaseClass.getDriver().getCurrentUrl();
	    Assert.assertEquals(true, CurrentURL.contains("python"));
	}
	
	//Testing the Arrays Using List link in left panel links 	
	
	@When("The user clicks the Arrays Using List link in the array Page from the left panel")
	public void the_user_clicks_the_arrays_using_list_link_in_the_array_page_from_the_left_panel() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_LeftPanel_ArraysUsingList_Btn();
	}
	
	
	//   Testing the --  Basic Operations in List link in left panel links 
	
	@When("The user clicks the Basic Operations in List link in the array Page from the left panel")
	public void the_user_clicks_the_basic_operations_in_list_link_in_the_array_page_from_the_left_panel() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_LeftPanel_BasicOpeartionsInList_Btn();
	}

	// Testing the Applications of Array link in left panel links 
	
	@When("The user clicks the Applications of Array in the array Page from the left panel")
	public void the_user_clicks_the_applications_of_array_in_the_array_page_from_the_left_panel() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_LeftPanel_ApplicationsOFArray_Btn();
		
	}
	
	// Testing the Practice Questions in List link in left panel links 
	

	@When("The user clicks the Practice Questions  in the array Page from the left panel")
	public void the_user_clicks_the_practice_questions_in_the_array_page_from_the_left_panel() {
	   
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_PracticeQuestion_Btn();
	}
	
	@Then("The user should be Redirected to the Practice Questions Page")
	public void the_user_should_be_redirected_to_the_practice_questions_page() {
	    
		String CurrentURL= BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(true, CurrentURL.contains("practice"));
	}
	
	// Testing the  Arrays using list Python Editor page with Valid Python codes -> already Implemented
	// Testing the  Arrays using list Page - Python Editor without Python codes -> already Implemented
	// Testing the  Arrays using list Page - Python Editor with In-Valid Python codes -> already Implemented
	
	@Given("The user is in the Arrays using list PY Editor Page")
	public void the_user_is_in_the_arrays_using_list_py_editor_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ArraysUsingList_Btn();
		Ap.Click_TryhereBtn();    
	}
	
	//  Testing the Try here in arrays-using-list Page
	
	@Given("The user is in the arrays-using-list page")
	public void the_user_is_in_the_arrays_using_list_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ArraysUsingList_Btn();
	}
	
	//  Basic Operations Page Scenarios
	//  Testing the  Basic Operations in Lists Python Editor page with Valid Python codes --> already Implemented
	//  Testing the  Basic Operations Page - Python Editor with In-Valid Python codes --> already Implemented
	//  Testing the  Basic Operations Page - Python Editor without Python codes  --> already Implemented
	
	@Given("The user is in the Basic Operations in Lists PY Editor Page")
	public void the_user_is_in_the_basic_operations_in_lists_py_editor_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_BasicOperations_Btn();
		Ap.Click_TryhereBtn();
	}
	
		//Testing the Try here in Basic Operations Page
	
	
	@Given("The user is in the Basic Operations in Lists page")
	public void the_user_is_in_the_basic_operations_in_lists_page() {
	   
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_BasicOperations_Btn();
		
	}
	
	//Testing the Applications of array Python Editor page with Valid Python codes --> Already Implemented
	
	// Testing the  Applications of array - Python Editor with In-Valid Python codes --> Already Implemented
	
	// Testing the  Applications of array - Python Editor without Python codes --> Already Implemented
	
	
	@Given("The user is in the Applications of array PY Editor Page")
	public void the_user_is_in_the_applications_of_array_py_editor_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ApplicationsOfArray_Btn();
		Ap.Click_TryhereBtn();
	}
	
	
	// Testing the Try here in Applications of array page
	
	@Given("The user is in the Applications of array in Lists page")
	public void the_user_is_in_the_applications_of_array_in_lists_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ApplicationsOfArray_Btn();
	}
	
	
	
	@Given("The user is in the Search the array Practice question Editor Page")
	public void the_user_is_in_the_search_the_array_practice_question_editor_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ArraysInPython_Btn();
		Ap.Click_PracticeQuestion_Btn();
		Ap.Click_SearchTheArray_Btn();
	}
	
	@Then("The user should get valid output in the console whe he passed the  valid python code from excel sheet {string}")
	public void the_user_should_get_valid_output_in_the_console_whe_he_passed_the_valid_python_code_from_excel_sheet(String rownumber) throws InterruptedException {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.ExcelData_PythonEditor(rownumber);			
       	 
	}
	
	
	
	// Testing the Search the array Practice question with In-Valid Python codes
	
	
	@When("The user passed the Invalid {string} python code in the Python Editor")
	public void the_user_passed_the_invalid_python_code_in_the_python_editor(String Rownumber) {
		Rownumber="2";
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.ExcelData_PythonEditor(Rownumber);
		
	}
	
	
	
	@Then("The user should get the {string} alert Message")
	public void the_user_should_get_the_alert_message(String alert_RomNumber) {
		logger.info("Alert Message in search the Array using Invalid Code --->");
		alert_RomNumber="2";
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		
		Ap.ExcelData_PythonEditor_AlertValidation(alert_RomNumber);
	}	
	
	
	
	// Testing the Search the array Practice question with Valid Python codes
	
	@When("The user passed the valid {string} python code in the Python Editor")
	public void the_user_passed_the_valid_python_code_in_the_python_editor(String Rownum) {
		Rownum="1";
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
	    Ap.ExcelData_PythonEditor(Rownum);
		
	}
	
	
	
	@Then("The user should see the output {string} in the console")
	public void the_user_should_see_the_output_in_the_console(String OutputRowNum) {
		OutputRowNum="1";
		Ap.ExcelData_PythonEditor_OutPutConsole_Validation(OutputRowNum);
	    
	}	
	
	
	
	
	// Testing the python Editor in Max Consecutive one Page with Valid Codes
	
	@Given("The user is in the Max consecutive one Python Editor Page")
	public void the_user_is_in_the_max_consecutive_one_python_editor_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ArraysInPython_Btn();
		Ap.Click_PracticeQuestion_Btn();
		Ap.Click_MaxConsecutive_Btn();
		
	}
	
	
	@When("The user passed the Valid {string} python code for Max Consecutive one")
	public void the_user_passed_the_valid_python_code_for_max_consecutive_one(String rownumber) throws InterruptedException {
		rownumber="3";
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());		
		Ap.ExcelData_PythonEditor(rownumber);	
		
		
	}
	
	
	@Then("The user should see the Valid output {string} in the console")
	public void the_user_should_see_the_valid_output_in_the_console(String OutputRowNum_3) {
		logger.info("Validating Console output for Max Consecutive Page --->" );
		
		OutputRowNum_3="3";
		Ap.ExcelData_PythonEditor_OutPutConsole_Validation(OutputRowNum_3);
		
	}	
	
	
	
	
	// Testing the python Editor in Max Consecutive one Page with In-Valid Codes
	
	
	@When("The user passed the In-Valid {string} python code for Max Consecutive one")
	public void the_user_passed_the_in_valid_python_code_for_max_consecutive_one(String rownumber) throws InterruptedException {
		rownumber="4";		
		Ap.ExcelData_PythonEditor(rownumber);		
	    
	}	
	
	
	@Then("The user should get the Alert {string}  Message in the Pop Up")
	public void the_user_should_get_the_alert_message_in_the_pop_up(String alert_RomNumber_4) {
		alert_RomNumber_4 = "4"	;
		Ap.ExcelData_PythonEditor_AlertValidation(alert_RomNumber_4);
		
	}		
	
	
	
	//  Testing the Find Numbers with Even number of digits question page with valid codes
	
	@Given("The user is in the Find Numbers with Even number of digits Python Editor Page")
	public void the_user_is_in_the_find_numbers_with_even_number_of_digits_python_editor_page() {
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_ArraysInPython_Btn();
		Ap.Click_PracticeQuestion_Btn();
		Ap.Click_EvenNumberQuestion_Btn();
		
	}
	@When("The user passed the Valid Python codes {string} for the Python Editor Page")
	public void the_user_passed_the_valid_python_codes_for_the_python_editor_page(String ExcelRowNum) throws InterruptedException {
		ExcelRowNum="5";		
		Ap.ExcelData_PythonEditor(ExcelRowNum);		
		
	}
	
	
	
	@Then("The user should see the correct {string} output in the console")
	public void the_user_should_see_the_correct_output_in_the_console(String Outout_RowNum_5) {
		Outout_RowNum_5 = "5";
		Ap.ExcelData_PythonEditor_OutPutConsole_Validation(Outout_RowNum_5);
		
	}	
	

	
	
//  Testing the Find Numbers with Even number of digits question page with In-valid codes 
	
	
	@When("The user passed the In-Valid Python codes {string} for the Python Editor Page")
	public void the_user_passed_the_in_valid_python_codes_for_the_python_editor_page(String ExcelRowNum) throws InterruptedException {
		ExcelRowNum ="6";		
		Ap.ExcelData_PythonEditor(ExcelRowNum);		
	}
	
	

  @Then("The user should get the alert Message {string} in the pop up for Even number Question")
  public void the_user_should_get_the_alert_message_in_the_pop_up_for_even_number_question(String Alert_RowNumber_6) {
	Alert_RowNumber_6 = "6";
	Ap.ExcelData_PythonEditor_AlertValidation(Alert_RowNumber_6);
  }
	
	
	
	
	
	//  Testing the Squares of Sorted array question with Valid codes
	
	@Given("The User is  in the Squares of Sorted array Page Python Editor")
	public void the_user_is_in_the_squares_of_sorted_array_page_python_editor() {		
		Ap.Click_ArraysInPython_Btn();
		Ap.Click_PracticeQuestion_Btn();
		Ap.Click_SortedSquared_Ctn();
		
	}
	@When("The user passed the Valid Python codes {string} for the Squares of Sorted array Python Editor Page")
	public void the_user_passed_the_valid_python_codes_for_the_squares_of_sorted_array_python_editor_page(String ExcelRowNum) {
		ExcelRowNum="7";
		Ap.ExcelData_PythonEditor(ExcelRowNum);
			
	}	
	
	
	@Then("The user should see the Corresponding output {string} in the console")
	public void the_user_should_see_the_corresponding_output_in_the_console(String Outout_RowNum_7) {
		Outout_RowNum_7="7";
		Ap.ExcelData_PythonEditor_OutPutConsole_Validation(Outout_RowNum_7);
	    
	}
	
	
	
	
	// Testing the Squares of Sorted array question with In-Valid codes
	
	@When("The user passed the In-Valid Python codes {string} for the Squares of Sorted array Python Editor Page")
	public void the_user_passed_the_in_valid_python_codes_for_the_squares_of_sorted_array_python_editor_page(String ExcelRowNum) {
		ExcelRowNum="8";		
	   Ap.ExcelData_PythonEditor(ExcelRowNum);	
	}	
	
	
	@Then("The user should get the alert Message {string} for the Sorted array Python Editor Page")
	public void the_user_should_get_the_alert_message_for_the_sorted_array_python_editor_page(String Alert_RowNumber_8) {
		Alert_RowNumber_8 ="8";
		Ap.ExcelData_PythonEditor_AlertValidation(Alert_RowNumber_8);
	}
	
	
	
	
	// Testing the Submit button valid codes in Search the array Practice question 
	
	@When("The user clicks the submit button with {string} Valid Codes")
	public void the_user_clicks_the_submit_button_with_valid_codes(String rowNum) throws InterruptedException {
		rowNum="1";		
		Ap.Click_Submit_Btn_ExcelData_ValidCodes(rowNum);
		
	}
	
	
	@Then("The should see the submission successful message {string} in the console")
	public void the_should_see_the_submission_successful_message_in_the_console(String Success_RowNumer_9) {
		Success_RowNumer_9 = "9";
		Ap.ExcelData_PythonEditor_OutPutConsole_Validation(Success_RowNumer_9);
		
	}	
	
	
	
	// Testing the Submit button with valid codes in Max Consecutive one Page Python Editor
	
	
	@When("The user clicks the submit button with {string} Valid Codes in Max Consecutive one Page")
	public void the_user_clicks_the_submit_button_with_valid_codes_in_max_consecutive_one_page(String rowNumber) {
		rowNumber="10";
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_Submit_Btn_ExcelData_ValidCodes(rowNumber);
		
	}
	
	
	
	@Then("The user should see the success message {string} in the console for Max Consecutive one Page")
	public void the_user_should_see_the_success_message_in_the_console_for_max_consecutive_one_page(String Success_RowNumer_10) {
		Success_RowNumer_10 ="10";
		Ap.ExcelData_PythonEditor_OutPutConsole_Validation(Success_RowNumer_10);
	}	
	
	
	
	// Testing the Submit button with valid codes in Find Numbers with Even number of digits question page Python Editor
	
	
	@When("The user clicks the submit button with {string} Valid codes in Even number of digits question page")
	public void the_user_clicks_the_submit_button_with_valid_codes_in_even_number_of_digits_question_page(String rowNumber) {
		rowNumber="11";
		ArrayPage Ap = new ArrayPage(BaseClass.getDriver());
		Ap.Click_Submit_Btn_ExcelData_ValidCodes(rowNumber);
	}
	
	
	@Then("The should see the submission successful message {string} in the console for Even number of digits question page")
	public void the_should_see_the_submission_successful_message_in_the_console_for_even_number_of_digits_question_page(String Success_RowNumer_11) {
		Success_RowNumer_11="11";
		Ap.ExcelData_PythonEditor_OutPutConsole_Validation(Success_RowNumer_11);
	    
	}
	
	
	
	// Testing the Submit button valid codes in Squares of a Sorted Array
	
	
	@When("The user clicks the Submit button with {string} Valid codes in Squares of a sorted Array Page")
	public void the_user_clicks_the_submit_button_with_valid_codes_in_squares_of_a_sorted_array_page(String rownumber) throws InterruptedException {
		rownumber="12";		
		Ap.Click_Submit_Btn_ExcelData_ValidCodes(rownumber);		
	   
	}
	
	@Then("The should see the  successful message in the console {string} in the console for Squares of a sorted Array Page")
	public void the_should_see_the_successful_message_in_the_console_in_the_console_for_squares_of_a_sorted_array_page(String Success_RowNumer_12) {
		Success_RowNumer_12="12";
		Ap.ExcelData_PythonEditor_OutPutConsole_Validation(Success_RowNumer_12);	   
	}

	
}
