package SeleniumIntract;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class interactwithElementJS {

    public static <JvascriptExecutor> void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Declear explicit wait
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        // frame switch keywrords
        //driver.switchTo().frame(0);
        // how to use javaScript click in application
         // declare the JS
        JavascriptExecutor js =(JavascriptExecutor) driver ;
        //JvascriptExecutor js = driver;

        // First name -input box
        WebElement inputbox = driver.findElement(By.id("name"));
        js.executeScript("arguments[0].setAttribute('value','jhon')",inputbox);
        // Button normal click
        WebElement button = driver.findElement(By.id("FSsubmit"));
        js.executeScript("arguments[0].click();",button);



    }
}
