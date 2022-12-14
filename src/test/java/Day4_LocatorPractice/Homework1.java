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

public class Homework1 {
    //https://id.heroku.com/login sayfasına gidiniz.
//Bir mail adresi giriniz.
//Bir password giriniz.
//Login butonuna tıklayınız.
//"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
//Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
//Tüm sayfaları kapatınız.
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
    //Bir mail adresi giriniz.
    public void mailGir() {
        driver.get("https://id.heroku.com/login");//id="email"
        //email girdik
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("trydilek23@gmail.com" + Keys.TAB);
        //password girdik
        WebElement passWord = driver.findElement(By.cssSelector("#password"));
        passWord.click();
        passWord.sendKeys("2323" + Keys.TAB);
        WebElement login = driver.findElement(By.name("commit"));
        login.click();
 kayitYapildiYapilmadi();

    }

     public void kayitYapildiYapilmadi(){
        WebElement loginText = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        System.out.println(loginText.isDisplayed() ? "Kayıt yapılamadı" : "Kayıt yapıldı...");
    }
}


