package Day2_WebElementLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {
    WebDriver driver;

    // her metodda Webdriver objesini kullanacagmz için her seferinde oluşturmamak için @Before anotasyonu oluşruldu
    @Before
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get(" https://www.linkedin.com/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        //  driver.quit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// 10 sn boyunca kontrol saglar
    }

    @Test
    public void idLocattor() throws InterruptedException {

        WebElement email = driver.findElement(By.id("session_key"));
        email.sendKeys("Clarusway selenium dersinden selamlar...");

    }

    @Test
    public void nameLOcator() {
        WebElement passWord = driver.findElement(By.name("session_password"));
        passWord.sendKeys("Sifre");


    }

    @Test
    public void classLocator() {
        // class locaor-> "input__input"
        WebElement email = driver.findElement(By.className("input__input"));
        email.sendKeys("Class locator test");
    }

    @Test
    public void tagName() {
        List<WebElement> emailList = driver.findElements(By.tagName("input"));
        WebElement email = emailList.get(1);

        email.sendKeys("Tag locator test");
    }

    @Test
    public void linkTextLocator() {
        WebElement forgotPass = driver.findElement(By.linkText("Şifrenizi mi unuttunuz?"));
        forgotPass.click();
    }

    @Test
    public void partiallinkTextLocator() {
        WebElement forgotPass = driver.findElement(By.partialLinkText("Şifrenizi mi"));
        forgotPass.click();
    }

    @Test
    public void absoluteXpath() {// Kullanımı önerilmiyor.../ tek slach ile ayrılır (mutlak yol)
        WebElement email = driver.findElement(By.xpath("/html/body/script[2]"));
        email.sendKeys("basarılı şekilde tamamalndı");
    }

    @Test
    public void relativeXpath() {//* en çok kulllanılan ancak en yavaş calısan Xpath // çift slach ile calışır
        WebElement email = driver.findElement(By.xpath("// input[@name='session_key']"));
        email.sendKeys("basarılı şekilde tamamlandı");
    }
    //https://www.linkedin.com/


    @Test
    public void multipleAttributeXpath() {
////input[@class='input__input'][@name='session_key']// path oluşturuken 1 of 1 olana kadar attribute eklenir
        WebElement email = driver.findElement(By.xpath("//input[@class='input__input'][@name='session_key']"));
        email.sendKeys("Hello multipleAttribute tamamlandı");
    }

    @Test
    public void andOrXpath() {
////input[@class='input__input'][@name='session_key']// path oluşturuken 1 of 1 olana kadar attribute eklenir.Tek element locat etmek istiyorsak
        WebElement email = driver.findElement(By.xpath("//input[@class='input__input'and @name='session_key'and @id='session_key']"));
        email.sendKeys("AndOrXpath tamamlandı");
    }

    @Test
    public void andOrXpath1() {
////input[@class='input__input'][@name='session_key']// path oluşturuken 1 of 1 olana kadar attribute eklenir.Tek element locat etmek istiyorsak
        WebElement email = driver.findElement(By.xpath("//input[@id='sesion_key'or @id='sesion_password']"));
        email.sendKeys("AndOrXpath1 tamamlandı");
    }

    @Test
    public void containsXpath() {
////input[@class='input__input'][@name='session_key']// path oluşturuken 1 of 1 olana kadar attribute eklenir.Tek element locat etmek istiyorsak
        WebElement email = driver.findElement(By.xpath("//input[contains(@id,'session')]"));
        email.sendKeys("contains metodu başarıyla tamamlandı");
    }

    @Test
    public void stratWithsXpath() {

        WebElement email = driver.findElement(By.xpath("//input[starts-with(@id,'session')]"));
        email.sendKeys("Starts-with metodu başarıyla tamamlandı");
    }
       //button[contains(text(),'Oturum açın')]
       @Test
       public void textXpath() {
// text metodu kullandgımızda 'Sign in'elementini kapsar ancak text yerine . koyarsak button içindeki tum text e bakar
           WebElement email = driver.findElement(By.xpath("//button[contains(text(),'Oturum açın')]"));
           email.sendKeys("text metodu başarıyla tamamlandı");
       }
}











