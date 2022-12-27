package Tasks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.BaseTest;

import java.util.Set;

public class Cookies extends BaseTest {
    /*
    Go to URL: http://facebook.com
     getCookies,
     addCookie,
       deleteCookieNamed,
     deleteAllCookies.
     */
    @Test
    public void cookies(){
        driver.get("http://facebook.com");
        System.out.println("test get cookies");
        Set<Cookie> allCookies = driver.manage().getCookies();
        Cookie addcoockies=new Cookie("shoes","stiletto");
        driver.manage().addCookie(addcoockies);




    }
}
