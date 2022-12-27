package Day10_ApachePOI;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class UploadFileTask extends BaseTest {
    // Go to URL: https://www.monsterindia.com/seeker/registration
    // Upload file.


    @Test
    public void uploadFileTask() {
        driver.get("https://www.monsterindia.com/seeker/registration");
        String textPath="C:\\Users\\seyda-pc\\IdeaProjects\\CWJunitSelenium\\src\\test\\java\\resources\\upload.txt";
        WebElement uploadFile= driver.findElement(By.id("file-upload"));
        uploadFile.sendKeys(textPath);
        System.out.println("Files.exists(Paths.get(textPath)) = " + Files.exists(Paths.get(textPath)));







    }
}
