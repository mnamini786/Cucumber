package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    WebDriver driver;

    @Before
    public void setUp() {
        // initialize driver
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}