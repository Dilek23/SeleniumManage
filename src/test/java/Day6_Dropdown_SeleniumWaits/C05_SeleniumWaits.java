package Day6_Dropdown_SeleniumWaits;

import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseTest;

import java.time.Duration;

public class C05_SeleniumWaits  extends BaseTest {
//Explicit wait
    @Test
    public void webDriverWait(){
        driver.get("https://demoqa.com/elements");
// Adım 1-> Webdriverwait objemiz oluştruldu local wait oldugu için obje  oluşturmalıyız
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));



        // element clicki yapana kadar bekle komutu verdik

    }

}
