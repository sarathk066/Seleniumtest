package SeleniumIntract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScrollingPage {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Declear explicit wait
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // 1) scroll down page by pixel
//        js.executeScript("window.scrollBy(0,8000)","");
//        System.out.println(js.executeScript("return window.pageYoffset;"));

        // 2) Scroll down the page till the element is present
        WebElement flag =driver.findElement(By.xpath("//img[@alt='Flag of India']"));
        js.executeScript("arguments[0].scrollIntoView();",flag);
        System.out.println((js.executeScript("return window.pageYOffset;")));

        // go back to intinal postion

       // js.executeScript(("window.scrollBy(0,-document.body.scrollHeight"""));

    }
}
