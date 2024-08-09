package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataStructurePage extends BasePage{

	public DataStructurePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//-------------WebElements--------------
	
	@FindBy (xpath="//*[text()='Data Structures-Introduction']//following::a[1]")
	private WebElement DS_Introduction_GetStartedBtn;

	@FindBy (xpath="//*[@class='list-group-item']")
	private WebElement TimeComplexityBtn;
	
	@FindBy(linkText="Practice Questions") 
	private WebElement PracticeQuestionsBtn;
	
	
	@FindBy (xpath="//*[@class='btn btn-info']")
	private WebElement DS_TimeComplexity_TryHereBtn;	
	
	
	@FindBy (linkText = "Run")
	private WebElement DS_TimeComplexity_RunBtn;
	
	
	@FindBy (xpath ="//*[@class='CodeMirror-lines']")
	private WebElement DS_PythonEditor_ConsoleInput;
	
	
	@FindBy (xpath ="//*[@id='output']")
	private WebElement DS_PythonEditor_ConsoleOutPut;
	
	
	
	//-----------Methods---------
	
	
	
	public void click_GetStartedBtn_DSIroduction()
	{
		DS_Introduction_GetStartedBtn.click();
	}
	
	public void click_TimeComplexityBtn()
	{
		TimeComplexityBtn.click();
	}
	
	public void click_DS_PracticeQuestionsBtn()
	{
		PracticeQuestionsBtn.click();
	}
	
	
	public void click_DS_TimeComplexity_TryhereBtn()
	{
		
		DS_TimeComplexity_TryHereBtn.click();
		
	}
	
	
	
	public void click_DS_PythonEditor_RunBtn()
	{
		DS_TimeComplexity_RunBtn.click();
	}
	
	
	public void Click_DS_PythonEditor_Runbtn_WithoutCodes()
	{
		DS_PythonEditor_ConsoleInput.sendKeys("");
	}
	
	
	public void Click_DS_PythonEditor_Runbtn_ValidCodes()
	{
		DS_PythonEditor_ConsoleInput.sendKeys("print"+"'Numpy Ninja'");
		
	}
	
	public void Click_DS_PythonEditor_Runbtn_InValidCodes()
	{
		DS_PythonEditor_ConsoleInput.sendKeys("Print"+"'Numpy Ninja'");	
	}
	
	
}
