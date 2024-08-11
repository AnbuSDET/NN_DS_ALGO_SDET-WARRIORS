package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StackPage extends BasePage {

	public StackPage(WebDriver driver) {
		super(driver);
		}

	//--------------------Web Elements--------------------------
	
	@FindBy(xpath="//a[@href=\'stack\']")
	private WebElement GetStartedStack;
	
	@FindBy(xpath="//a[@href=\'operations-in-stack\']")
	private WebElement StackOperations;
	
	@FindBy(xpath="a[@href=\"/stack/implementation/\"]")
	private WebElement StackImplementation;
	
	@FindBy(xpath="//a[@href=\"/stack/stack-applications/\"]")
	private WebElement StackApplication;
	
	@FindBy(xpath="//a[@href=\"/stack/practice\"]")
	private WebElement StackPracticeQns;
	
	@FindBy(xpath="//a[@href=\"/tryEditor\"]")
	private WebElement TryHereBtn;
	
	//----------------Variables-------------------
	
	String Stack_Homepage_URL="https://dsportalapp.herokuapp.com/stack/";
	String Stack_Operations_URL="https://dsportalapp.herokuapp.com/stack/operations-in-stack/";
	String Stack_Implementations_URL="https://dsportalapp.herokuapp.com/stack/implementation/";
	String Stack_Applications_URL="https://dsportalapp.herokuapp.com/stack/stack-applications/";
	String Stack_PracticeQns_URL="https://dsportalapp.herokuapp.com/stack/practice";
	
	}
