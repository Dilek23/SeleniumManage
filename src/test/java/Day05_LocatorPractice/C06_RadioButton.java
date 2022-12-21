package Day05_LocatorPractice;

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

public class C06_RadioButton {
    //    Go to URL:  https://www.facebook.com/
//    Click on Create an Account button.
//    Then click on the radio buttons.
   // Click 'Kadın'
   // Click 'Erkek'

    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        // driver.quit();

    }
    @Test
    public void radioButton(){
        ////a[contains(@data-testid,'registration-form')] veya //a[@data-testid]
        driver.get(" https://www.facebook.com/");
        WebElement registerButton= driver.findElement(By.xpath("//a[contains(@data-testid,'registration-form')]"));
registerButton.click();
 WebElement kadinRadio= driver.findElement(By.xpath("//input[@name='sex'and @value='1']"));
 WebElement erkekRadio= driver.findElement(By.xpath("//input[@name='sex'and @value='2']"));
 kadinRadio.click();
 erkekRadio.click();
        Assert.assertTrue(erkekRadio.isSelected());
        Assert.assertTrue(!kadinRadio.isSelected());


    }
}