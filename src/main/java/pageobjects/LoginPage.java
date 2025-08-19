package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.*;


public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.xpath("//input[@data-test='username']");
    private By passwordField = By.xpath("//input[@data-test='password']");
    private By loginButton   = By.xpath("//input[@data-test='login-button']");

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    
   
}