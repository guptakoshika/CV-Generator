package cv.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class excelsheet {
    void savetoexcel(cv o) throws IOException
    {
           XSSFWorkbook workbook = new XSSFWorkbook(); 
           XSSFSheet spreadsheet = workbook.createSheet("CV DATA");

            XSSFRow row;

      //This data needs to be written (Object[])
      Map < String, Object[] > empinfo = 
      new TreeMap < String, Object[] >();
      //empinfo.put( "1", new Object[] { "FIRST NAME", "LAST NAME", "CONTACT NUMBER","EMAIL","DATE OF BIRTH" });
      empinfo.put( "1", new Object[] { o.getFname(),o.getSname(),o.getContact(),o.getEmail(),o.getDob()});
      
      //Iterate over data and write to sheet
      Set < String > keyid = empinfo.keySet();
      int rowid = 0;

      for (String key : keyid) {
         row = spreadsheet.createRow(rowid++);
         Object [] objectArr = empinfo.get(key);
         int cellid = 0;

         for (Object obj : objectArr) {
            Cell cell = row.createCell(cellid++);
            cell.setCellValue((String)obj);
         }
      }

      //Write the workbook in file system
      FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Koshika Gupta\\Desktop\\java\\Writesheet.xlsx"));
      workbook.write(out);
      out.close();
      System.out.println("Writesheet.xlsx written successfully");
    }
}
