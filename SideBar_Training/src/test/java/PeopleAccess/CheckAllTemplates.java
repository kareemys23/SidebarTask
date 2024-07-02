package PeopleAccess;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.peopleTab.PeopleTabSide;
import pom.signIn.SignInPage;
import utils.BaseIdent;
import utils.SeleniumActions;

public class CheckAllTemplates {
    HomePage home = new HomePage();
    SignInPage signInPage = new SignInPage();
    PeopleTabSide selectPeople = new PeopleTabSide();


    @BeforeTest
    public void init() {
        BaseIdent seleniumBase = new BaseIdent();
        SeleniumActions actions = new SeleniumActions();
        seleniumBase.SeleniumConfig();
        actions.OpenWebApp();
    }

    @Test
    public void openApp() throws InterruptedException {
        home.WebAppOpenAssert();
        signInPage.Signin();


    }

    @Test(dependsOnMethods = "openApp")
    public void selectTabs() throws InterruptedException {

       PeopleTabSide.accessSideMenu();


    }


}
