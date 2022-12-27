package Tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class RobotClassHMW extends BaseTest {
/*
https://api.jquery.com/ sitesine gidelim
arama alanina json yazalim
Enter islemini robot class kullanrak yapalim
 */
@Test
    public void robotclass() throws AWTException {
    driver.get("https://api.jquery.com/");
//input[@class="ds-input"]
    WebElement arama= driver.findElement(By.xpath("//input[@class='ds-input']"));
    arama.sendKeys("json");
    Robot robot=new Robot();
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);


}

}
