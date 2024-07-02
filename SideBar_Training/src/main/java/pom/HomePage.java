package pom;

import org.testng.Assert;

import static utils.BaseIdent.driver;


public class HomePage {

    public void WebAppOpenAssert() {
        String homePage =driver.getTitle();
        Assert.assertEquals(homePage, "Convertedin - Login", "home page assertion is done");
        Assert.assertNotNull(homePage, "assertion home page is null");
    }

}
