package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getBackpackImageSrc() {
        return driver.findElement(By.xpath("//img[@data-test='inventory-item-sauce-labs-backpack-img']")).getAttribute("src");
    }
}
