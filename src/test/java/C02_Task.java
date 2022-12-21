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

public class C02_Task {
    //https://www.teknosa.com/ adresine gidiniz.
// Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
// Sonuç sayısını yazdırınız.
// Çıkan ilk ürüne tıklayınız.
// Sepete ekleyiniz.
// Sepetime gite tıklayınız.
// Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
// Alışverişi tamamlayınız.
// Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
// Driver'ı kapatınız.
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
    public void teknosaGit(){
        driver.get("https://www.teknosa.com/");
     // //input[@name='s']
        WebElement aramaAlani=driver.findElement(By.name("s"));
        aramaAlani.sendKeys("oppo"+ Keys.ENTER);
        //sonuc sayisi //plp-info
WebElement sonucSayisi= driver.findElement(By.className("plp-info"));
        System.out.println(sonucSayisi);
        //iilk  ürüne tıklanıp spete ekle
        WebElement ilkUrun= driver.findElement(By.className("prd-link"));
        ilkUrun.click();
//sepete ekle butonuna tıkla
// button[@id='addToCartButton'][1]-->birinci index i seceriz
        WebElement septeEkleBoutton= driver.findElement(By.xpath("//button[@id='addToCartButton'][1]"));//By.id deolur
        septeEkleBoutton.click();


        WebElement sepetimeGit= driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));
        sepetimeGit.click();


        WebElement siparisOzet= driver.findElement(By.xpath("//div[@class='cart-sum-body']"));
        System.out.println(siparisOzet.getText());

        WebElement alısVerisTamamla= driver.findElement(By.partialLinkText("Alışverişi Tamamla"));
        alısVerisTamamla.click();

        //class="lrp-title
        WebElement hosGeldiniz= driver.findElement(By.xpath("//div[@class=lrp-title]"));
        System.out.println(hosGeldiniz.getText());


    }
}
