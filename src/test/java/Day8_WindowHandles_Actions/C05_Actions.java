package Day8_WindowHandles_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C05_Actions extends BaseTest {
    /*
    Go to URL: https://www.amazon.com/
Click on “Hello, Sign in Account & Lists” link.
Click on Orders page.Siparişler sayfasına tıklayın.
Verify the page title contains “Amazon”
 hoverOver: üzerinde gezdirmek
     */

    @Test
    public void hoverOver(){

      driver.get("https://www.amazon.com/");

      WebElement accountsAndLists = driver.findElement(By.id("nav-link-accountList"));// //a[@id='nav-link-accountList']

      Actions actions = new Actions(driver);

      // Hesaplar ve listeler alaninin ustune gelip siparislerim linkine tikladik
      actions
              .moveToElement(accountsAndLists)
              .click(driver.findElement(By.id("nav_prefetch_yourorders")))
              .perform();


      // Amazon login sayfasinin acildigini dogruladik
      Assert.assertEquals("Amazon Sign-In",driver.getTitle());

  }
}