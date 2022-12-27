package Day8_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.Set;

public class C01_WindowHandleSe4 extends BaseTest {
    /*
Go to URL: https://testproject.io/
Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
TestProject'in Blog sayfası için yeni bir Pencere açmak için Selenium'un 4 newWindow() yöntemi.
https://blog.testproject.io/

 */
    @Test
    public void newWindow() {
        driver.get("https://testproject.io/");
        //Yeni pencere oluşturup o pencereye switch ediyoruz
      driver.switchTo().newWindow(WindowType.WINDOW);
      //WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);seklide de yazılabilir
      //YEni penceremizin URL ini ziyaret ediyoruz
     driver.get("https://blog.testproject.io/");
    }
    @Test
    public void newTab(){
        driver.get("https://blog.testproject.io/");
        WebDriver newTab=driver.switchTo().newWindow(WindowType.WINDOW);
      newTab.get("https://www.amazon.com/");


      //Aktif tab in title i yazdırıldıkitap okumak gibi..geçmiş sayfayı okumak için bir sayfa geri dönemiz gerekiyor
        // ..hangi sayfa açıksa onu okuyabiliyoruz
        System.out.println(driver.getTitle());

    }
    @Test
    public void handleWindow() {
       driver.get("https://www.amazon.com/");
        String homePageId= driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com.tr/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");

        // tablar ve sekmeler arasında geçis yapmak için id leri bulunduran collection oluştrduk
        Set<String>handles=driver.getWindowHandles();
        //aralarında gezinmek için ıterator oluşturduk
       Iterator <String>i=handles.iterator();
         while (i.hasNext()){
            // driver.switchTo().window(id) herbir pencere id sini kullanarak swicth to ile ilgili pencereye gectik
      String currentTab=i.next();
      driver.switchTo().window(currentTab);
             System.out.println(driver.getTitle());
           // 1.Yol
            if(!driver.getWindowHandle().equals(homePageId)){
                driver.close();
             }

             //          if (!driver.getTitle().contains("Spend")){
             //2. yol-> sayfa title spend içermiyorsa sayfaları kapat kontrol şartını sagladık
          //if (!driver.getTitle().contains("Spend")){
            //  driver.close();
          }

         }

        }



