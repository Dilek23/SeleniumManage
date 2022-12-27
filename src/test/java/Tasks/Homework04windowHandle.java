package Tasks;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

public class Homework04windowHandle extends BaseTest {
    /*
    Go to URL: https://testproject.io/
   Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
   TestProject'in Blog sayfası için yeni bir Pencere açmak için Selenium'un 4 newWindow() yöntemi.
   https://blog.testproject.io/

     */
    @Test
    public void windowHandle(){
        driver.get("https://testproject.io/");
        String homePageId= driver.getWindowHandle();
        WebDriver newWindow=driver.switchTo().newWindow(WindowType.WINDOW);
        newWindow.get("https://blog.testproject.io/");








    }
}
