package Day10_ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/*
Workbook → Excel dosyamız.
Sheet → Açık excel sekmesi (Sheet1, Sheet2, etc.)Sayfa1 sayfa2
Row (Satır) → Java, yalnızca içeride veri varsa satırları sayar. Default olarak, Java perspektifinden satır sayısı 0’dır.
Cells (Hücre) → Java her satıra bakar ve yalnızca hücrede veri varsa hücre sayısını sayar

 */
/*
Add the excel file on the resources folder.
Open the file.
Open the workbook using file input stream.
Open the first worksheet.
Go to first row.
Go to first cell on that first row and print.
Go to second cell on that first row and print.
Go to 2nd row first cell and assert if the data equal to Russia.
Go to 3rd row 2nd cell-chain the row and cell.
Find the number of used row.
Print country, area key value pairs as map object.
 */

public class C02_ApachePoiTask {


    @Test
    public void apacheTest() throws IOException {
        //    Add the excel file on the resources folder.
        String path="src/test/java/resources/excelfile.xlsx";

        //    Open the file.
        FileInputStream fileInputStream=new FileInputStream(path);

        //    Open the workbook using file input stream.
        Workbook workbook= WorkbookFactory.create(fileInputStream);

        //    Open the first worksheet.
        Sheet sheet1= workbook.getSheetAt(0);
        //    Go to first row.
        Row row1= sheet1.getRow(0);
        //    Go to first cell on that first row and print.
        Cell row1cell1= row1.getCell(0);

        System.out.println("row1cell1 = " + row1cell1);
        //    Go to second cell on that first row and print.
        Cell row1cell2=row1.getCell(1);
        System.out.println("row1cell2 = " + row1cell2);
        //    Go to 2nd row first cell and assert if the data equal to Russia
        Row row2= sheet1.getRow(1);
        Cell row2cell1=row2.getCell(0);
        Assert.assertEquals("Rusya",row2cell1.toString());
        Cell row3Cell2=sheet1.getRow(2).getCell(1);
        System.out.println("row3Cell2 = " + row3Cell2);

        System.out.println("sheet1.getPhysicalNumberOfRows() = " + sheet1.getPhysicalNumberOfRows());
        System.out.println("sheet1.getLastRowNum() = " + sheet1.getLastRowNum());

        int totalRows= sheet1.getPhysicalNumberOfRows();

        Map<String,String>countryAreas=new HashMap<>();
        for (int row=1;row<totalRows;row++){
            String country=sheet1.getRow(row).getCell(0).toString();
            System.out.println((row+1)+" .satir= "+country);

            String area=sheet1.getRow(row).getCell(1).toString();
            countryAreas.put(country,area);

        }
        System.out.println(countryAreas);
        //   Boolean isPresent = driver.findElements().size() > 0
    }
}
