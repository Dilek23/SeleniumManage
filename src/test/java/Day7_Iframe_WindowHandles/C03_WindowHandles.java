package Day7_Iframe_WindowHandles;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class C03_WindowHandles extends BaseTest {
/*
Herhangi bir tarayıcıdaki bir window, kullanıcının bir bağlantıya/URL'ye tıkladıktan sonra geldiği ana web
sayfasıdır.
Bir kullanıcı bir URL'ye ulaştığında bir web sayfası açılır. Bu ana sayfa, ana penceredir (parent window),
yani kullanıcının şu anda açtığı ve herhangi bir işlemi gerçekleştireceği ana penceredir.

 Methodları şunladır:
 1-driver.getWindowHandle();→ Mevcut sayfanın window handle değerini alır.
 2-driver.switchTo().window(switch);→ Window handle değerini kullanarak pencereler arası geçiş yapar.
 3-driver.switchTo().newWindow(WindowType.TAB);→ Yeni TAB oluşturarak geçiş yapar.
 4-driver.switchTo().newWindow(WindowType.WINDOW)→ Yeni WINDOW oluşturarak geçiş yapar.
 5-driver.getWindowHandles()→ Tüm sayfaların window handle değerini alır
 6-if (!mainWindow.equalsIgnoreCase(ChildWindow)): Parent window ile child window karşılaştırılır.
 7-Set <String> s = driver.getWindowHandles(): Tüm child window’ları String data type’ta bir sete atar.
 8-Iterator <String> itr = s.iterator(): Burada tüm child window’lar yinelenir.
 */

   //  Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
   //  Print the existing windowHandles ids by clicking all the links on the page.
   //  Click on the links that open a new page.
   //  Close other pages other than the home page.
   //  Set the driver back to the main page.

    @Test
    public void windowHandles(){
        driver.get(" https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");
        String homePageId= driver.getWindowHandle();// ana sayfa id'mizi korumak için sakladık

        List<WebElement>links=driver.findElements(By.xpath("//a[@target='_blank']"));// sayfada yeni sekmeler acmak için target kullanılır
        links.get(0).click();// 2 tane sekme açma linki tıkladık
        links.get(1).click();

       Set<String>window= driver.getWindowHandles();// acılan windowların içinde gezinmek için oluşturduk
        Iterator<String>iterator= window.iterator();//sayfalar arası gezinmek için
        while (iterator.hasNext()){// döngü ile ana sayfa id si iterator ile gidilen id ye esit olana kadar devam eder
            //ana sayfa gelince sekmeler kapanır
            // herbir gezinilen id kullanılarak o anki sekmeye switch ediyoruz.
            driver.switchTo().window(iterator.next());
            if(driver.getWindowHandle().equals(homePageId)){// home page kapanmaması için

                continue;
            }
           driver.close();
         /*
          2.yol
          while (iterator.hasNext()){
            String kapanacakPencere=iterator.next();
            if (!kapanacakPencere.equals(homePageId)){
                driver.switchTo().window(kapanacakPencere);
                driver.close();
         */




        }
    }
}
