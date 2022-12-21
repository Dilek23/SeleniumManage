package Day4_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework2 {
    //Navigate to https://testpages.herokuapp.com/styled/index.html
// Click on Calculate under Micro Apps.
// Type any number in the first input.
// Type any number in the second input.
// Click on Calculate.
// Get the result.
// Print the result.
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
    public void calcuLate(){
        //https://testpages.herokuapp.com/styled/index.html sayfamıza gittik
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calclick= driver.findElement(By.id("calculatetest"));
        calclick.click();
       driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("23"+ Keys.TAB);
        driver.findElement(By.id("number2")).sendKeys("30"+Keys.TAB);
      WebElement onCalculate= driver.findElement(By.xpath("//*[@id='calculate']"));
     onCalculate.click();
     WebElement result= driver.findElement(By.xpath("//p[text()='Answer : ']"));//  //p[text()='Answer : ']soncun tüm satırına bakar Answer: sonucunu yazdırır
     String ansWer= result.getText();// diger bir text yazdırma sekli //.span[.='']
        System.out.println( ansWer);
    }
}
