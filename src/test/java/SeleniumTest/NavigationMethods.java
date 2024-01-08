package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class NavigationMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://phppot.com/");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
    }
}
