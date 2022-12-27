package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.BaseTest;

import java.util.Set;

public class C4_Cookies extends BaseTest {
/*
Go to URL: https://kitchen.applitools.com/ingredients/cookie
Get Cookie.
Find the total number of cookies.
Print all the cookies.
Add Cookie.
Edit Cookie.
Delete Cookie.
Delete All Cookies.
 */
@Test
    public void cookies(){
    driver.get(" https://kitchen.applitools.com/ingredients/cookie");
    System.out.println("test get cookies");
    Cookie cookie=driver.manage().getCookieNamed("protein");// cookie'yi isimle çağırdık
    Assert.assertEquals("chicken",cookie.getValue());// cookkie'nin valuesinin ismi cookie'imi onu dogruladık
   //h1[@class='chakra-heading css-1vyua5b']
   // Find the total number of cookies.
    Set<Cookie>allcookies=driver.manage().getCookies();
    int numOfCookies=allcookies.size();
    System.out.println("numOfCookies = " + numOfCookies);
    //Print all the cookies.
    for (Cookie each:allcookies ){
        System.out.println("each cookie= " + each);
        System.out.println("each cookie.getName() = " + each.getName());
        System.out.println("each cookie.getValue() = " + each.getValue());
    }
    // Add cookie...
    System.out.println("Add Cookie...");
    Cookie cookie1=new Cookie("fruit","apple");// Cookie oluşturduk
    driver.manage().addCookie(cookie1);
    Assert.assertEquals(cookie1.getValue(),driver.manage().getCookieNamed(cookie1.getName()).getValue());

     allcookies=driver.manage().getCookies();// sayfada var olan cookies döndürür
    System.out.println("allcookies = " + allcookies.size());// allcookies = 3 cookie eklendiken sonra

    // Edit Cookie
    System.out.println("edit cookie");
    Cookie editedcookie=new Cookie(cookie1.getName(),"mango");
    driver.manage().addCookie(editedcookie);
    Assert.assertEquals(editedcookie.getValue(),driver.manage().getCookieNamed(cookie1.getName()).getValue());
    System.out.println(driver.manage().getCookieNamed(cookie1.getName()).getValue());//mango editlenip yazdrıldı

}
@Test
    public void deleteCookies(){
    driver.get(" https://kitchen.applitools.com/ingredients/cookie");
    System.out.println("delete cookies");
    Cookie addedCookies=new Cookie("drinks","ayran");// eklencek cookie oluştruduk
    driver.manage().addCookie(addedCookies);// ekledik
    Set<Cookie> allCookies = driver.manage().getCookies(); // sayfada var olan cookieleri dondurur

    driver.manage().deleteCookie(addedCookies);//son ekledigimiz cookie yi sildik
    Assert.assertNull("cookie hala var...",driver.manage().getCookieNamed(addedCookies.getName()));
    allCookies = driver.manage().getCookies(); // sayfada var olan cookieleri dondurur
    System.out.println("allCookies = " + allCookies.size()); //allCookies = 2
    driver.manage().deleteAllCookies(); //browserdan hepsi sildik
    allCookies = driver.manage().getCookies(); // sayfada var olan cookieleri dondurur
    System.out.println("allCookies = " + allCookies.size()); // allCookies = 0

}



}
