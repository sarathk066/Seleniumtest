package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboardpage {
    WebDriver driver ;
    //
    public void Dashboard(WebDriver driver) {
        this .driver =driver;

        // locators for the page title and logout button
        By heading = By.xpath("//div[@classs='main-content']");
        By logoutbtn = By.id("Submit");


        // Method to capture the page heading

        public String getheading() {
            String head = driver .findElement(heading).getText();
            return;
        }

        // Method for logout

        public void clicLogout() {
            driver.findElement(logoutbtn).click();

        }
    }
}
