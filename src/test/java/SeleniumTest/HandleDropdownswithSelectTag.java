package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;

public class HandleDropdownswithSelectTag {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();
        // Dropdown
        WebElement dropCountryEle=driver.findElement(By.id("country-list"));
        Select dropCountry =new Select(dropCountryEle);
        // Selecting an option from the dropdwon
        //dropCountry.selectByVisibleText("India");
       // dropCountry.selectByValue("3");
        //dropCountry.selectByIndex(3);

        // 2. Find total options in dropdown
        List<WebElement> options =dropCountry.getOptions();
        System.out.println("total number of options:"+ options.size());

        // 3. Print options in console window
        // validate all the options displayed in dropdown
        for(int i=0; i<options.size();i++)
        {
            System.out.println(options.get(i).getText());
        }

    }
}
