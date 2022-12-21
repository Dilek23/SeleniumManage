package Day6_Dropdown_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/*
driver.switchTo().alert().accept();//ok demek
driver.switchTo().alert().dismiss();//cancel demek
driver.switchTo().alert().getText();//metni getirir
driver.switchTo().alert().sendKeys("");//metin kutusu doldurulur
 */

public class C03_Alerts {
    WebDriver driver;
    //11
//https://www.guru99.com/select-option-dropdown-selenium-webdriver.html
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @After
    public void tearDown() {
        // driver.quit();

    }
    @Test
    public void alerts() throws InterruptedException {
        //http://demo.guru99.com/test/delete_customer.php
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        WebElement idinput= driver.findElement(By.name("cusid"));
        idinput.sendKeys("123");
        driver.findElement(By.name("submit")).click();

        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
    }
}
//https://automationexercise.com/ bu siteyide kullanabiliriz pratik için...
//https://the-internet.herokuapp.com/javascript_alerts