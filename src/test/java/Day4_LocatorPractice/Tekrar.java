package Day4_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Tekrar {

    //http://the-internet.herokuapp.com/add_remove_elements/
    // Click on the "Add Element" button 100 times.
    // Write a function that takes a number, and clicks the "Delete" button.
    // Given number of times, and then validates that given number of buttons was deleted.
    // 1. Method: createButtons(100)
    // 2. Method: DeleteButtonsAndValidate()
WebDriver driver;
@Before
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@After
    public void tearDown(){
   // driver.quit();
}
  @Test
    public void linkeGit(){
    driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
   //onclick="addElement()
WebElement addElemets= driver.findElement(By.cssSelector("button[onclick='addElement()']"));
int amount=100;
      for (int i = 0; i <amount ; i++) {
         addElemets.click();

      }
      System.out.println("addElemets = " + addElemets);
   WebElement deleteElement= driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
  int delete=40;
      for (int i = 0; i <delete ; i++) {
          deleteElement.click();

      }
      System.out.println("deleteElement = " + deleteElement);

  }
  @Test
    public void silindktnSonra(){
      List<WebElement> deleteButtonsList = driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
      int silinmedenOnceDeleteButtonSayisi = deleteButtonsList.size(); // 100

      List<WebElement>deleteButton=driver.findElements(By.cssSelector("button[onclick='deleteElement()']"));
      int deleteAfterList=deleteButton.size();
      Assert.assertEquals(silinmedenOnceDeleteButtonSayisi-deleteAfterList,deleteButton);
  }
}
