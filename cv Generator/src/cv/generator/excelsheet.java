package cv.generator;

import java.io.*;
import java.util.List;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class excelsheet {

    int createexcel(String excelpath) throws FileNotFoundException, IOException {
        
    String filename = excelpath+java.time.LocalDate.now()+".xls";
    HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet sheet = workbook.createSheet("firstsheet");
    HSSFRow rowhead = sheet.createRow((short)0);
    rowhead.createCell(0).setCellValue("Name");
    rowhead.createCell(1).setCellValue("DOB");
    rowhead.createCell(2).setCellValue("Address1");
    rowhead.createCell(3).setCellValue("Address2");
    rowhead.createCell(4).setCellValue("contact number");
    rowhead.createCell(5).setCellValue("Email");
    
    Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory s = cfg.buildSessionFactory();
        Session session = s.openSession();
        Transaction tx = session.beginTransaction();
        
        int i =1;
        Query q = session.createQuery("from cv");
        List <cv> data = q.list();
         for (cv obj : data)
        {
            HSSFRow row = sheet.createRow((short)i);
            row.createCell(0).setCellValue(obj.getFname()+obj.getSname());
            row.createCell(1).setCellValue(obj.getDob());
            row.createCell(2).setCellValue(obj.getAdress1());
            row.createCell(3).setCellValue(obj.getAddress2());
            row.createCell(4).setCellValue(obj.getContact());
            row.createCell(5).setCellValue(obj.getEmail());
            i++;
        }
         FileOutputStream fileOut = new FileOutputStream(filename);
         workbook.write(fileOut);
         fileOut.close();
         return 1;
    }
}
