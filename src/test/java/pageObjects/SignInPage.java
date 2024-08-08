package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

	public SignInPage(WebDriver driver) {
		super(driver);
		}
	
	
	//--------------WebElements------------

	@FindBy(xpath="//input[@id='id_username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='id_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement LoginButton;
	
	//--------------Methods----------
	
	public void enterUsername(String userName) {
		username.sendKeys(userName);
	}
	
	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		LoginButton.click();
	}
			

}
