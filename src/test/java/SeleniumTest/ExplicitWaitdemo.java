package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitdemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // Explicit wait method
        // Declear explicit wait
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // navigated to URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // Enter the username
        WebElement Username = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        Username.sendKeys("Admin");
        // Enter the Password
        WebElement Password = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        Password.sendKeys("admin123");
        // Click Login button
        WebElement Loginbtn = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")));
        Loginbtn.click();

    }
}
