package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Dashboardpage;
import pages.Homepage;
import pages.LoginPage;

import java.time.Duration;

public class ValidLogins {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        // wait statement implicitlywait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("//https:testemail.com");

        // Creating Object of LoginPage
        LoginPage login = new LoginPage(driver);

        // Creating object of Home page
        Homepage home = new Homepage(driver);

        // Click on the login button
        // Enter the user and password
        login.enterUsername("Admin");
        login.enterpassword("Password");

        // Login button
        login.clickLogin();


    }
}
