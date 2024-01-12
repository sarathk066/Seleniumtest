package SeleniumIntract;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class keyboardAction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://text-compare.com/");

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME TO AUTOMATION SESSION");

        // Action class in java


        Actions act = new Actions(driver);

        // Ctrl +a
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        // ctrl +c
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        // Tab
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

       // Ctrl+v
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();



    }
}
