package Day2_WebElementLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tekrar {
   // https://www.linkedin.com/
   WebDriver driver;
    @Before
    //Driver oluşturuldu
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
     driver.get("https://www.linkedin.com/");

    }
 public void tearDown(){
        //driver kapatıldı
       // driver.quit();
 }


@Test
   public void idLocator(){
// idLocator "session_key"
WebElement email=driver.findElement(By.id( "session_key"));
email.sendKeys("Clarusway selenium dersinden selamlar");

   }
   @Test

public void nameLocator(){
//"session_password"
WebElement password= driver.findElement(By.name("session_password"));
password.sendKeys("ebikgabik");

       
}


}
