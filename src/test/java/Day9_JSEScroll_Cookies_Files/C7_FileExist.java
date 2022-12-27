package Day9_JSEScroll_Cookies_Files;

import utilities.BaseTest;

import java.nio.file.Files;
import java.nio.file.Paths;
/*
Selenium ile windows uygulamalarını test edemiyoruz.
Ama test etmek için JAVA kullanabiliriz.
Bilgisayarımızda bir dosya olup olmadığını(exist) kontrol
etmek için Java'yı kullanabiliriz

System.getProperty ("user.dir"); İçinde bulunulan
klasörün yolunu (path) verir.
System.getProperty ("user.home"); Bilgisayarımızda
bulunan user klasörünü verir.
Files.exists (Paths.get (filePath)); Bilgisayarınızda
dosyanın olup olmadığını kontrol eder
upload=yüklemek
  System.out.println(System.getProperty("user.dir"));//projemizin rootunun yolunu verir.
     String projectRoot=System.getProperty("user.dir");// projeden öncekcşi kısım
     String filePath="/src/test/java/resources/fileExist.jpg";// projeden sonraki kısım
        filePath=projectRoot+filePath;
        System.out.println(Files.exists(Paths.get(filePath)));//String olan classı path clasına cevirdik
        if (Files.exists(Paths.get(filePath))){
            System.out.println("Dosya bulundu");
        }else System.out.println(" Dosya bulunamadı");

    }

 */

public class C7_FileExist  {
    public static void main(String[] args) {
   String projeyekadarYol=System.getProperty("user.dir");
   String procwUnitFileexistekadarolanyol="/src/test/java/resources/fileExist.jpg";
   String dosyayaKadarOlanYol= projeyekadarYol+procwUnitFileexistekadarolanyol;
   // String absuluteyol="C:\Users\seyda-pc\IdeaProjects\CWJunitSelenium\src\test\java\resources\fileExist.jpg"
        System.out.println("Files.exists(Paths.get(dosyayaKadarOlanYol)) = " + Files.exists(Paths.get(dosyayaKadarOlanYol)));
        if(Files.exists(Paths.get(dosyayaKadarOlanYol))){
            System.out.println("dosya var");
        }else System.out.println("dosya yok");


    }

}
