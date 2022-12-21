package Day3_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Practice {
    //    Go to https://www.linkedin.com/
//    When we write an e-mail without the @ sign in the e-mail box and press enter.
//    Let's test the "Invalid email address" warning.
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
     driver.quit();
    }
    @Test
    public void xpathPractice(){
        // 1.adım-> Linkesın sayfasına gittik
    driver.get("https://www.linkedin.com/");
//  2.Adım->email. alanına @ sembolu bulunmayan bir email adresi gir
        driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("clarusway.com"+ Keys.ENTER);
 // 3.Adım->hata mesajının görüntülendigini dogrula
////p[@class='alert-content']
        WebElement alertMessage= driver.findElement(By.xpath("//p[@class='alert-content']"));
        Assert.assertTrue(alertMessage.isDisplayed());//1.yol
        //Assert.assertEquals(true,alertMessage.isDisplayed());//2. yol
        //Assert.assertFalse(!alertmessage.isDisplayed()); 3. yol->
    }
}
