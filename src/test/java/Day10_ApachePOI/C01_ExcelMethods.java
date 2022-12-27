package Day10_ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ExcelMethods {

    public static void main(String[] args) throws IOException {

        String path="src/test/java/resources/excelfile.xlsx";// excell dosyasının pathi


        FileInputStream fileInputStream=new FileInputStream(path);//dosyamızı actik
        Workbook workbook= WorkbookFactory.create(fileInputStream);// actigimiz dosyayı escel workbook a cevirdir

       //Workbook muzdan sheetimize gecis yaptik
        Sheet sheet1= workbook.getSheetAt(0);
        //shetten satıra gectik
        Row row1=sheet1.getRow(0);
        // satırdan hücreye gectik
        Cell cell1= row1.getCell(0);

        System.out.println(cell1.toString().toLowerCase());





    }
}
