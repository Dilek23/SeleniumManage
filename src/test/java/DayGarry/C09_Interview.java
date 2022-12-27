package DayGarry;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class C09_Interview extends BaseTest {
 /*
 o https://www.amazon.com.tr/ sitesi açılır.
o Ana sayfanın açıldığı kontrol edilir.
o  Çerez tercihlerinden Çerezleri kabul et seçilir.
o  Siteye login olunur.
o Login işlemi kontrol edilir.
o Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
o Bilgisayar kategorisi seçildiği kontrol edilir.
o Arama alanına MSI yazılır ve arama yapılır.
o Arama yapıldığı kontrol edilir.
o Arama sonuçları sayfasından 2. sayfa açılır.
o 2. sayfanın açıldığı kontrol edilir.
o Sayfadaki 2. ürün favorilere eklenir.
o 2. Ürünün favorilere eklendiği kontrol edilir.
o Hesabım > Favori Listem sayfasına gidilir.
o “Favori Listem” sayfası açıldığı kontrol edilir.
o Eklenen ürün favorilerden silinir.
o Silme işleminin gerçekleştiği kontrol edilir.
o Üye çıkış işlemi yapılır.
o Çıkış işleminin yapıldığı kontrol edilir.



ÖNEMLİ AÇIKLAMALAR
● Çalışmanın 3 gün içerisinde tamamlanması beklenmektedir.
● Tüm işlemleri tamamladıktan sonra projenin github linki private proje olarak
  */



    @Test
    public void test() throws InterruptedException {
        driver.get(" https://www.amazon.com.tr/");
        WebElement anasayfacilmakontrol=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        Assert.assertTrue(anasayfacilmakontrol.isDisplayed());
        WebElement cerezlerikabulet=driver.findElement(By.id("sp-cc-accept"));
        cerezlerikabulet.click();
        Actions acitons=new Actions(driver);
        WebElement loginButton= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        acitons.moveToElement(loginButton);// istedigimiz yere gelir tıklama yapmadan yazılari acar
      WebElement girisYap= driver.findElement(By.linkText("Giriş yap"));
      girisYap.click();
      WebElement emailgiris= driver.findElement(By.name("email"));
       emailgiris.sendKeys("trydilek23@gmail.com"+ Keys.ENTER);
        WebElement sifre = driver.findElement(By.id("ap_password"));
        sifre.sendKeys("trdilek49"+Keys.ENTER);
     //Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
        WebElement drpDown = driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(drpDown);
        select.selectByValue("search-alias=computers");



    }


}
