package Day8_WindowHandles_Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C04_Acttions extends BaseTest {
/*
Go to URL: https://rangeslider.js.org/
Shift 100 units to the right and 100 units to the left on the horizontal axis
Yatay eksende 100 birim sağa ve 100 birim sola kaydırma
 */

@Test
    public void dragAndDropOffset(){
   driver.get("https://rangeslider.js.org/");
    WebElement slider=driver.findElement(By.xpath("//div[@class='rangeslider__handle'][1]"));
    Actions actions=new Actions(driver);

     actions.dragAndDropBy(slider,420,0).perform();


}
//"https://www.amazon.com.tr/"
/*Go to URL: https://www.amazon.com/
    Click on “Hello, Sign in Account & Lists” link.
    Click on Orders page.
    Verify the page title contains “Amazon”

 */
}
