package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class HandleCheckboxes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Declear explicit wait
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://demo.opencart.com/index.php?route=product/product&language=en-gb&path=25_28&product_id=42");
        driver.manage().window().maximize();
        // Scenario verify user able to check the first option [checkbox]
        // Scenario verify user able to click the radio button
        driver.findElement(By.xpath("//label[@for='input-option-value-8']")).click();
    }
}
