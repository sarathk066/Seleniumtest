package SeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;

public class handleAlerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        // acccept the alert
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        //Alert accept

       // Alert alertwindow = driver.switchTo().alert();
        Alert alertwindows =mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertwindows.getText());
        //alertwindows.accept();
        alertwindows.dismiss();
        // verify the alert message


        // validation
       String act_text=  driver.findElement(By.xpath("//*[@id='result']")).getText();
       String exp_text="Welcome to alerts";

        System.out.println(act_text);
        System.out.println(exp_text);

        // If class
        if(act_text.equals(exp_text))
        {
            System.out.println("test passed");
        }
        else {
            System.out.println("test is failed ");
        }
    }
}
