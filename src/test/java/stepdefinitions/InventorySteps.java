package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobjects.InventoryPage;
import utils.DriverFactory;

import static org.testng.Assert.assertEquals;

public class InventorySteps {

    WebDriver driver = DriverFactory.getDriver();  // Accessing the shared WebDriver from the factory
    InventoryPage inventoryPage;

    @Then("I should see the wrong backpack image")
    public void i_should_see_the_wrong_backpack_image() {
        inventoryPage = new InventoryPage(driver);  // Initialize InventoryPage with the shared driver
        String imageSrc = inventoryPage.getBackpackImageSrc();
        String expectedWrongImage = "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg";
        assertEquals(imageSrc, expectedWrongImage, "Expected the broken image for backpack");
    }
}
