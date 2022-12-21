package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HomeWork02MultpleSelect {
    /*
    - https://demoqa.com/select-menu sitesine gidin
- Multiple select yapabileceginiz <select> elementini locate edin
- Birden fazla secim yapip secimlerinizi DOGRULAyin
     */
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
    public void multipleTest(){
        driver.get(" https://demoqa.com/select-menu ");
      //  WebElement element= driver.findElement(By.xpath("//div[text()='Select...']"));
        WebElement elements= driver.findElement(By.name("cars"));
        Select select=new Select(elements);
        System.out.println(select.isMultiple());
        select.selectByIndex(1);
        select.selectByValue("audi");
        select.selectByVisibleText("Opel");
        Assert.assertTrue(select.isMultiple());


    }
}
