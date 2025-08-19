package utils;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    // Initialize the WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {  // Create a new driver if not initialized
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mehfe\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            
            
        }
        return driver;
    }

    // Quit the WebDriver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
