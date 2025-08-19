package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;
import utils.DriverFactory;

import static org.testng.Assert.assertEquals;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();  // Access the shared WebDriver from the factory
    LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://www.saucedemo.com");
        loginPage = new LoginPage(driver);
    }

    @When("I log in with username {string} and password {string}")
    public void i_log_in_with_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("I should be redirected to the inventory page")
    public void i_should_be_redirected_to_inventory_page() {
        assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Login failed");
    }

    @Then("I should see an error message {string}")
    public void i_should_see_error_message(String expectedMessage) {
        String actualMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        assertEquals(actualMessage, expectedMessage, "Error message did not match!");
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();  // Quit the WebDriver after each test
    }
}
