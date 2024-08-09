package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinkedListPage extends BasePage {

	public LinkedListPage(WebDriver driver) {
		super(driver);
		
	
	}
	
	//-------------WebElements--------------
		
		@FindBy (linkText="Introduction")
		private WebElement IntroductionBtn;
		
		@FindBy (linkText="Creating Linked LIst")
		private WebElement CreatingLinkedListBtn;
		
		@FindBy (linkText="Types of Linked List")
		private WebElement TypesOfLinkedListBtn;
		
		@FindBy (linkText="Implement Linked List in Python")
		private WebElement ImplementLinkedListBtn;
		
		@FindBy (linkText="Traversal")
		private WebElement TraversalBtn;
		
		@FindBy (linkText="Insertion")
		private WebElement InsertionBtn;
		
		@FindBy (linkText="Deletion")
		private WebElement Deletion;
		
		@FindBy (linkText="Practice Questions")
		private WebElement PracticeQns;
		
		@FindBy (linkText="Try here")
		private WebElement TryhereBtn;
		
		
		
		///html/body/div[2]/div/div[2]/a-- button
		///html/body/div[2]/div/div[2]/a
		////span[@role='presentation']--try editor console
		
		
		
		
		
		//-----------Methods---------
		
		public void clickIntroduction() {
			IntroductionBtn.click();
		}
		
		
			
		}
		
		
