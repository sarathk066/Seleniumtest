package SeleniumIntract;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;

public class screenshots {


    // selenium 4

    // Capture the screenshots

    // Find element

    WebElement logo = driver.findElement("");

    File src = logo.getScreenshotAs(OutputType.FILE);
    file trg= new File(("D:\\"));
    FileUtils.copyFile(src,trg)''

}
