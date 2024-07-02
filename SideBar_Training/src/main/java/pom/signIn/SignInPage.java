package pom.signIn;

import utils.SeleniumActions;
import utils.signinLocators.SigninLocator;

public class SignInPage {

    SeleniumActions seleniumActions = new SeleniumActions();
    SigninLocator locators = new SigninLocator();

    public void Signin() throws InterruptedException {

        seleniumActions.sendKeys(locators.loginEmail, "M.abolela+1+1+1@converted.in");
        seleniumActions.sendKeys(locators.loginPassword, "password");
        seleniumActions.click(locators.signInBtn);


    }


}
