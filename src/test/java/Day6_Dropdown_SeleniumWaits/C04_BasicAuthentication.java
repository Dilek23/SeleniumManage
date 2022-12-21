package Day6_Dropdown_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BasicAuthentication {
    WebDriver driver;
    //https://the-internet.herokuapp.com/javascript_alerts
//
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
    public void basicAuth(){

        driver.get("https://admin:admin@the-internet.herokuapp.com/javascript_alerts");
        WebElement content= driver.findElement(By.id("content"));
        Assert.assertTrue(content.getText().contains("Congratulations"));
    }
}
