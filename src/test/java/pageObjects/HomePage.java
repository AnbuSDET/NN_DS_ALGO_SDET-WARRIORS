package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		System.out.println("print");
	}
	
	//-----------WebElements-----------------
	@FindBy (xpath="//a[normalize-space()='NumpyNinja']")
	private WebElement NumpyNinjaLink;
	
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	private WebElement SignInLink;
	
	@FindBy (xpath="//a[contains(text(),'Get Started')]")
	private List<WebElement> HomepageGetStartedBtnList;
	
	@FindBy (xpath="//a[@href='data-structures-introduction']")
	private WebElement DataStructureGetStartedBtn;
	
	@FindBy (xpath="//a[@href='array']")
	private WebElement ArrayGetStartedBtn;
	
	@FindBy (xpath="//a[@href='linked-list']")
	private WebElement LinkedListGetStartedBtn;
	
	@FindBy (xpath="//a[@href='stack']")
	private WebElement StackGetStartedBtn;
	
	@FindBy (xpath="//a[@href='queue']")
	private WebElement QueueGetStartedBtn;
	
	@FindBy (xpath="//a[@href='tree']")
	private WebElement TreeGetStartedBtn;
	
	@FindBy (xpath="//a[@href='graph']")
	private WebElement GraphGetStartedBtn;
	
	@FindBy(xpath="//div[@role='alert']")
	private WebElement YouAreLoggedInMsg;
		
	@FindBy (xpath ="//div[contains(text(),'You are not logged in')]")
	private WebElement NotLoggedInErrMsg;
	
	
	//------------------Methods---------------
	
	public boolean NumpyNinjaLinkDisplay() {
		boolean display = NumpyNinjaLink.isDisplayed();
		return display;
	}
	
	public void clickSigIn() {
		SignInLink.click();
	}
	
	public boolean YouAreLoggedInMsg() {
		boolean status =  YouAreLoggedInMsg.isDisplayed();
		return status;
	}
	
	
	public boolean NotLoggedInErrorMsg() {
		boolean status = NotLoggedInErrMsg.isDisplayed();
		return status;
	}
	
	public void clickDataStrucGetStarted() {
		DataStructureGetStartedBtn.click();
	}
	
	public void clickArrayGetStarted()  {
		ArrayGetStartedBtn.click();
			}
	
	public void clickLinkedListGetStarted() {
		LinkedListGetStartedBtn.click();
	}
	
	public void clickStackGetStarted(){
		StackGetStartedBtn.click();
	}
	
	public void clickQueueGetStarted() {
		QueueGetStartedBtn.click();
		}
	
	public void clickTreeGetStarted() {
		TreeGetStartedBtn.click();
	}
	
	public void clickGraphGetStarted(){
		GraphGetStartedBtn.click();
	}
	

	

}
