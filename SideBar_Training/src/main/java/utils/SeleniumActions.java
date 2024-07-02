package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SeleniumActions extends BaseIdent {

    public void OpenWebApp(){
        driver.get("https://app-stg.converted.in/dashboard/home");
        driver.manage().window().maximize();
    }

    public void click(By path) {
        WebElement Click = driver.findElement(path);
        Click.click();
    }

    public void sendKeys(By path, String text) {
        WebElement SendKey = driver.findElement(path);
        SendKey.sendKeys(text);
    }
}
