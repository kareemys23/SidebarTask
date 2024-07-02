import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class ShowRoot {
    public  static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        signInMethod();
        Thread.sleep(10000);
        accessSideMenu();
    }

    public static void signInMethod(){
        driver.get("https://app-stg.converted.in/dashboard/home");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("M.abolela+1+1+1@converted.in");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("password");
        WebElement signin = driver.findElement(By.xpath("/html/body/main/div[2]/div/div[2]/form/button"));
        signin.click();
    }

    public static void accessSideMenu(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        SearchContext shadow1 = driver.findElement(By.cssSelector("convertedin-sidebar")).getShadowRoot();
        shadow1.findElement(By.cssSelector("#people-tab")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        shadow1.findElement(By.id("people-overview")).click();

    }

}
