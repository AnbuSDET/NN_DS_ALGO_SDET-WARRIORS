package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.TreePage;

import org.testng.Assert;

public class TreeSteps {
    WebDriver driver;
    HomePage homePage;
    TreePage treePage;

    @Given("User moves to the home page after logging into the application")
    public void user_moves_to_home_page() {
        // Set the path to the chromedriver executable
     
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dsportalapp.herokuapp.com/home");
        homePage = new HomePage(driver);
        treePage = new TreePage(driver);
    }

    @Given("the user is on the Homepage")
    public void the_user_is_on_the_Homepage() {
        // Verify the user is on the Homepage
        String expectedUrl = "https://dsportalapp.herokuapp.com/home";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "User is not on the Homepage!");
    }

    @When("the user clicks the {string} button on the Homepage")
    public void the_user_clicks_button_on_Homepage(String buttonName) {
        // Click the specified button on the Homepage
        if (buttonName.equals("Tree_Get Started")) {
            homePage.clickTreeGetStartedButton();
        }
    }

    @Then("the user should be able to navigate to the Tree Page")
    public void the_user_should_be_able_to_navigate_to_the_tree_page() {
        // Verify navigation to the Tree Page
        String expectedUrl = "https://dsportalapp.herokuapp.com/tree";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Navigation to Tree Page failed!");
    }

    @Given("the user is on the Overview of Trees page")
    public void the_user_is_on_the_Overview_of_Trees_page() {
        // Navigate to the Overview of Trees page
        driver.get("https://dsportalapp.herokuapp.com/tree/overview");
    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_button(String buttonName) {
        // Click the specified button
        if (buttonName.equals("Try_Here")) {
            treePage.clickTryHereButton();
        } else if (buttonName.equals("Run")) {
            treePage.clickRunButton();
        }
    }

    @When("the user types {string} in the Editor box")
    public void the_user_types_in_Editor_box(String code) {
        // Type the specified code in the Editor box
        treePage.typeInEditorBox(code);
    }

    @Then("the user should see {string} in the console output")
    public void the_user_should_see_in_console_output(String expectedOutput) {
        // Verify the console output
        String actualOutput = treePage.getConsoleOutput();
        Assert.assertEquals(actualOutput, expectedOutput, "Console output is incorrect!");
    }
}
