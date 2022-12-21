package Day1_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_WebDriverManagerTest {
    public static void main(String[] args) {
        // Set Path.
// Create chrome driver.
// Maximize the window.
// Open google home page https://www.google.com/
// Verify that you are Google in the title.
           //System... yerineEbDriver clasiini kullanarak chromedriver binary indirdik
        WebDriverManager.firefoxdriver().setup();

        // Driver objemizi oluşturduk
        WebDriver driver=new FirefoxDriver();

        // window u maximize ettik
        driver.manage().window().maximize();

        driver.get(" https://www.google.com/");
        //Titlemizi aldk
        String title= driver.getTitle();

        //title mizi dogruladık
        if (title.equalsIgnoreCase("Google")){
            System.out.println("TEst PASSEd");
        }else System.out.println("test FAİLED");

          driver.quit();





    }
}
