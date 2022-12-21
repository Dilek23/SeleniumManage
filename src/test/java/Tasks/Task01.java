package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
// 1) Open the browser
//2) Enter the URL “http://practice.automationtesting.in/”
// 3) Click on Shop Menu
//4) Now click on Home menu button
//5) Test whether the Home page has Three Sliders only
//6) The Home page must contains only three sliders

public class Task01 {
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
    public void Test(){
        driver.get("http://practice.automationtesting.in/");
        //li[@id='menu-item-40']
        WebElement element= driver.findElement(By.xpath("//li[@id='menu-item-40']"));
        element.click();
        WebElement home=driver.findElement(By.linkText("Home"));
        home.click();

    }
}
