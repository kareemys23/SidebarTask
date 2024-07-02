package utils.signinLocators;

import org.openqa.selenium.By;

public class SigninLocator {

    public By loginEmail = By.id("email");
    public By loginPassword = By.id("password");
    public By signInBtn = By.xpath("//button[@type='submit']");
}
