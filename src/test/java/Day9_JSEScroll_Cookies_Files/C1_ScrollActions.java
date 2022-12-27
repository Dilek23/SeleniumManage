package Day9_JSEScroll_Cookies_Files;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C1_ScrollActions extends BaseTest {

    @Test
    public void scroolArrowUpDown() throws InterruptedException {
        driver.get("https://amazon.com");
        Actions action=new Actions(driver);

        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).perform();// Klavyedeki oklarla  bi tık kadar asagı in yukarı çık
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_UP).perform();
    }

    @Test
    public void scrollPageUpDown() throws InterruptedException {
    driver.get("https://amazon.com");
    Actions action=new Actions(driver);

    Thread.sleep(2000);//implicitlywait bulunca beklemez Thread her halukarda bekler
    action.sendKeys(Keys.PAGE_DOWN).perform();// Klavyedeki oklarla  bi page  kadar asagı in yukarı çık

    Thread.sleep(2000);
    action.sendKeys(Keys.PAGE_DOWN).perform();

    Thread.sleep(2000);
    action.sendKeys(Keys.PAGE_UP).perform();

    Thread.sleep(2000);
    action.sendKeys(Keys.PAGE_UP).perform();


}

}
