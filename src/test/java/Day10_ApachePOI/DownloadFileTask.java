package Day10_ApachePOI;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadFileTask extends BaseTest {
    // Go to https://the-internet.herokuapp.com/download
//  Download sample.png file
//  Then verify if the file downloaded successfully.Ardından, dosyanın başarıyla indirilip indirilmediğini doğrulayın


    @Test
    public void  downloadFileTask() {
        driver.get("https://the-internet.herokuapp.com/download");
      WebElement sample=  driver.findElement(By.linkText("sample.png"));
      sample.click();
      String downloadPath="C:\\Users\\seyda-pc\\Downloads\\sample.png";
        Assert.assertTrue(Files.exists(Paths.get(downloadPath)));
        System.out.println("Files.exists(Paths.get(downloadPath)) = " + Files.exists(Paths.get(downloadPath)));


    }
}
