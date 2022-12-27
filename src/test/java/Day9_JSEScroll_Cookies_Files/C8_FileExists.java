package Day9_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C8_FileExists {
    @Test
    public void FileExists() {
        //C:\Users\seyda-pc\Desktop\fileExist.png  // dosyamızın yolu
        // UserHome metodu
        System.out.println(System.getProperty("user.home"));// Home yolunu yazdırdık
        String homePath= System.getProperty("user.home");// Home yolunu atadık
        String filePath="\\Desktop\\fileExist.png ";// dosyanın kalan yolunu atadık
        String fullPath=homePath+filePath;// home ve dosya yolunu birleştrip full pathi elde ettik

        File image=new File(fullPath);// Path imizi file cevirdik

        Assert.assertTrue(image.exists());// exists metoduyla varolup olmadigini kontrol ettik
       // System.out.println("Files.exists(Paths.get(fullPath)) = " + Files.exists(Paths.get(fullPath)));
    }
}
