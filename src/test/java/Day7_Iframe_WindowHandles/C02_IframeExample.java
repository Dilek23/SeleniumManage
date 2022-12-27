package Day7_Iframe_WindowHandles;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class C02_IframeExample extends BaseTest {// Basetexte extend ederek ilgili metodları silip
    // basetext classından extend ettik
    // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
// Web sitesini maximize yapınız.
// İkinci emojiye tıklayınız.
// Tüm ikinci emoji öğelerine tıklayınız.
// Parent iframe geri dönünüz.
// Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button'a basınız.


    @Test
    public void Test() {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
       // emojis iFrame ne geciş yaptık
        driver.switchTo().frame("emoojis");
        // İkinci emojiye tıklayınız.contains kullandıgımız için x.Path ile aldık
        WebElement secondEmojiTab = driver.findElement(By.xpath("//a[@href='#nature']"));
        secondEmojiTab.click();
        // Tüm ikinci emoji öğelerine tıklayınız.
        List<WebElement> emojiList = driver.findElements(By.xpath("//div[@id='nature']//img"));
        // parent-child seklinde bir locate işlemi gercekleştirdik 2.->Locater //div[@id="nature"]
        emojiList.forEach(WebElement::click);// Lambda ile herbir elementi tek tek tıkladık
        driver.switchTo().defaultContent();// Parent Frame e geri döndük

        // Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button'a basınız.

        WebElement text = driver.findElement(By.id("text"));
        text.sendKeys("Text");

        WebElement smiles = driver.findElement(By.id("smiles"));
        smiles.sendKeys("Smiles");

        WebElement natura = driver.findElement(By.id("nature"));
        natura.sendKeys("Nature");

        WebElement food = driver.findElement(By.id("food"));
        food.sendKeys("food");

        WebElement activities = driver.findElement(By.id("activities"));
        activities.sendKeys("Activities");

        WebElement places = driver.findElement(By.id("places"));
        places.sendKeys("Places");

        WebElement objects = driver.findElement(By.id("objects"));
        objects.sendKeys("Objects");

        // apply button'a cliclkledik...
        WebElement applyButton = driver.findElement(By.id("send"));
        applyButton.click();
    }
}