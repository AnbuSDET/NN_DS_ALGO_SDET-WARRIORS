package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Factory.BaseClass;

public class TreePage extends BasePage{

	public TreePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Page Objects
	
	@FindBy (xpath = "//*[text()='Data Structures-Introduction']//following::a[5]")
	WebElement Tree_GetStartedBtn;
	

    
}
