package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_JunitAssertions {

        //    Go to Amazon homepage.
//    Do the following tasks by creating 3 different test methods.
//    1- Test if the URL contains Amazon.
//    2- Test if the title does not contain Facebook.
//    3- Test that the Amazon logo appears in the upper left corner.

//    assertEquals
//    assertTrue
//    assertFalse
//    assertNull
//    assertNotNull
//    assertSame
//    assertNotSame
//    assertArrayEquals

   WebDriver driver;

   @Before
   public void before(){
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
   }

   @After
   public void after(){

       driver.quit();
   }

   @Test
   public void URLTest(){
       driver.get("https://www.amazon.com/");
       String currentUrl = driver.getCurrentUrl();

       // URL amazon kelimesini iceriyor mu kontrol saglaniyor
       Assert.assertTrue("URL 'Amazon' icermiyor", currentUrl.contains("Amazon"));

   }

   @Test
   public void titleTest(){
       driver.get("https://www.amazon.com/");
       String title = driver.getTitle();
       System.out.println(title);
       Assert.assertFalse("Amazon kelimesi var...",title.contains("Amazon"));

   }
   @Test
      public void  URLnullTest(){
   driver.get("https://www.amazon.com/");
     String nullUrl= driver.getCurrentUrl();
   Assert.  assertNull("Null içermiyor ", true);
}
@Test
public void tİtleNotNullTest(){
       driver.get("https://www.amazon.com/");
    String titleNull = driver.getTitle();
       Assert.assertNotNull("titleNull",false);
}

    @Test
  public void  assertSameTest(){
       driver.get("https://www.amazon.com/");
        String Url= driver.getCurrentUrl();

       Assert.assertSame("referanslar karşılaştırıldı",Url,Url);


}
@Test
    public void  assertNotSameTest() {
    driver.get("https://www.amazon.com/");
    String url = driver.getCurrentUrl();
  String url1= driver.getCurrentUrl();
    Assert.assertNotSame("referanslar karşılaştırıldı", url, url1);

}
//TO BE CONTINUED...
    }

