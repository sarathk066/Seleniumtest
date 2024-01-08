package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTest {
    // Verify user is able to enter valid logins
    //main method
    public static void main(String[] args) throws InterruptedException {
       // Launch the Browser instance
        WebDriver driver = new ChromeDriver();
        // wait statement implicitlywait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // declaring explict wait
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
        // Maximize the browser
        driver.manage().window().maximize();
        // open the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // validation
        System.out.println(driver.getCurrentUrl());
        // validate title of the application
        System.out.println(driver.getTitle());
       WebElement username= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
       username.sendKeys("Admin");
        // Ente the input value
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        // enter the password value
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        // Click on loginbutton
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        //driver.close();
        // Browser with all tabs will close
        // driver.quit();
        //driver.close();




    }
}
