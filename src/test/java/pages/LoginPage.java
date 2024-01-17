package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver ;
    // Constrcutor that will be automatically called as soon as the Object of the class is created
    public LoginPage(WebDriver driver) {
        this.driver=driver;

        // Locators also we can maintain in the Pages
        // Username
        By Username = By.id("userName");
        // Password
        By Password =By.id("password");
        // Locators for login button
        By LoginBtn= By.id("Login");


        // method to Enter username

     /*   public void enterUsername() {
            driver.findElement(Username).sendKeys("test");
        }
*/
        // Method to enter password

        public void enterpassword(); {
            driver.findElement(Password).sendKeys("pass");
        }
        //Method to login button
        public void clickLogin(); {
            driver.findElement(LoginBtn).click();
        }

    }
    public void enterUsername(String admin) {
        By Username = null;
        driver.findElement(Username).sendKeys("test");
    }
}
