package Tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.Set;

public class HomeWork07WindowHandle extends BaseTest {
    /*
    Go to URL: https://demoqa.com/browser-windows
   Click on the windows - "WindowButton"Pencerelere tıklayın - "Pencere Düğmesi"
   Click on all the child windows.Tüm alt pencereleri tıklayın.
   Print the text present on all the child windows in the console.Konsoldaki tüm alt pencerelerde bulunan metni yazdırın.
   Print the heading of the parent window in the console.Ana pencerenin başlığını konsolda yazdırın.
     */

    @Test
    public void windowHandle(){
        driver.get("https://demoqa.com/browser-windows");
        String homePage = driver.getWindowHandle();
        driver.findElement(By.id("tabButton")).click();
        driver.findElement(By.id("windowButton")).click();
         driver.findElement(By.id("messageWindowButton")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> i = windows.iterator();
        while(i.hasNext()){
            driver.switchTo().window(i.next());
            if(!driver.getWindowHandle().equals(homePage)){
                System.out.println(driver.findElement(By.tagName("body")).getText());

                driver.close();
            }
        }
        driver.switchTo().window(homePage);
        System.out.println(driver.getTitle());

    }
}
