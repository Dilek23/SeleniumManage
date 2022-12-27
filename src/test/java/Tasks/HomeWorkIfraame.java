package Tasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class HomeWorkIfraame extends BaseTest {
/*
Go to URL: http://demo.guru99.com/test/guru99home/
Find the number of iframes on the page.Sayfadaki iframe sayısını bulun.
Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.Dördüncü iframe bağlantısı (JMeter Made Easy)
 (https:www.guru99.comlive selenium project.html) buraya tıklayın.
Exit the iframe and return to the main page.
 */
@Test
    public void demoGuru(){
    driver.get(" http://demo.guru99.com/test/guru99home/");

    List<WebElement>iframe=driver.findElements(By.tagName("iframe"));

    System.out.println(iframe.size());

   driver.switchTo().frame(("a077aa5e"));

   driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();

   driver.switchTo().parentFrame();


}

}
