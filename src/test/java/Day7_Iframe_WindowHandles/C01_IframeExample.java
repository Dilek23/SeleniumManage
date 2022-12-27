package Day7_Iframe_WindowHandles;

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

public class C01_IframeExample {
    //        Go to URL: https://the-internet.herokuapp.com/iframe
//        Verify the Bolded text contains "Editor"
//        Locate the text box
//        Delete the text in the text box
//        Type "Hi everyone"
//        Verify the text Elemental Selenium text is displayed on the page.


    /*
        iFrame, bir HTML belgesinin içine gömülü bir HTML belgesidir.

   iFrame bulmak için 3 metodumuz vardr:

    1• switchTo.frame (int frame Number)
    2• switchTo.frame (string frame Name Or Id)
    3• switchTo.frame (WebElement frame Element)

    -->iframeden çıkmak için 2 metodumuz var
    1• driver.switchTo( ).parentFrame( );
      1 üst seviyedeki frame çıkartır.
    2• driver.switchTo( ).defaultContent( );
     En üstteki frame çıkmak için kullanılır

     */


    WebDriver driver;


    @Before
    public void setup() {
        //Driver ile ilgili her turlu initial(baslangic) islemi burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatmak (varsa raporlari dosyalamak) icin kullanilir.
        //driver.quit();
    }
    @Test
    public void Test(){
        driver.get("https://the-internet.herokuapp.com/iframe");

        // Verify the Bolded text contains "Editor"
        WebElement boldedText=driver.findElement(By.tagName("h3"));// tagname metodu ile h3 textini getirdik

        String text= boldedText.getText();// h3 taginin içine girip textini getirdik
        Assert.assertTrue(text.contains("Editor"));//contains ile içinde editor kelimesinin varlıgını kontrol ettik
       //sayfamızda tek bir iframe oldugu için index 0 ile frame geciş yaptık
        driver.switchTo().frame(0);// ilgili frame gecmezsek exception fırlatır
      //  Locate the text box
        WebElement textBox= driver.findElement(By.id("tinymce"));// diger bir locate //body[@id='tinymce']
       //   Delete the text in the text box
        textBox.clear();
        //   Type "Hi everyone"
        textBox.sendKeys("Hello Selenium");
        // .switchTo() ile frame içinden cıktık eger çıkmazsak hata fırlatır
        driver.switchTo().defaultContent();
        // Verify the text Elemental Selenium text is displayed on the page.
        Assert.assertTrue(driver.findElement(By.partialLinkText("Elemental")).isDisplayed());
    }
}