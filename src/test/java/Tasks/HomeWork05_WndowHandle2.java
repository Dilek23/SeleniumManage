package Tasks;

import org.junit.Test;
import utilities.BaseTest;

public class HomeWork05_WndowHandle2 extends BaseTest {
   // Go to URL: https://demoqa.com/browser-windows
   // Click on the windows - "WindowButton"Pencerelere tıklayın - "Pencere Düğmesi"
   // Click on all the child windows.Tüm alt pencereleri tıklayın.
   // Print the text present on all the child windows in the console.Konsoldaki tüm alt pencerelerde bulunan metni yazdırın.
   // Print the heading of the parent window in the console.Ana pencerenin başlığını konsolda yazdırın.

  @Test
    public void windowHandle(){
    driver.get("https://demoqa.com/browser-windows");
      String homePageId= driver.getWindowHandle();


  }






}
