package pom.peopleTab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static utils.BaseIdent.driver;

public class PeopleTabSide {

    public static void accessSideMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement shadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("convertedin-sidebar")));

        SearchContext shadowRoot = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);

        WebElement peopleTab = (WebElement) js.executeScript("return arguments[0].querySelector('#people-tab')", shadowRoot);
        wait.until(ExpectedConditions.visibilityOf(peopleTab));
        js.executeScript("arguments[0].scrollIntoView(true);", peopleTab);
        wait.until(ExpectedConditions.elementToBeClickable(peopleTab));
        peopleTab.click();

        WebElement peopleOverview = (WebElement) js.executeScript("return arguments[0].querySelector('#people-overview')", shadowRoot);
        wait.until(ExpectedConditions.visibilityOf(peopleOverview));
        js.executeScript("arguments[0].scrollIntoView(true);", peopleOverview);
        wait.until(ExpectedConditions.elementToBeClickable(peopleOverview));
        peopleOverview.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String overviewTitle =driver.getTitle();
        Assert.assertEquals(overviewTitle, "Convertedin - People", "Overview opened successfully");
        Assert.assertNotNull(overviewTitle, "Error happened");

    }

    }

