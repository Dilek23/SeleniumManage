package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C9_FileDownload extends BaseTest {
    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
    Login page valid credentials.
    Download sample CSV file.Örnek CSV dosyasını indirin.
    Verify if the file downloaded successfully.Dosyanın başarıyla indirilip indirilmediğini doğrulayın.
     */
    @Test
    public void FileDownload() throws InterruptedException {
driver.get(" https://opensource-demo.orangehrmlive.com/");
        WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginButton= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        loginButton.click();

        WebElement pımbutton= driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper'][2]"));
        pımbutton.click();
       WebElement configrationTab= driver.findElement(By.xpath("//span[text()='Configuration ']"));
       configrationTab.click();

       WebElement dataImport= driver.findElement(By.linkText("Data Import"));

       dataImport.click();
       WebElement download= driver.findElement(By.className("download-link"));
       download.click();
       Thread.sleep(5000);

        String downloadPath = "C:\\Users\\seyda-pc\\Downloads\\importData.csv";
        // Dosyanin indirildigini kontrol ediyoruz
        Assert.assertTrue("Indirilen dosya bulunamadi", Files.exists(Paths.get(downloadPath)));
    }
}
