package cv.generator;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CvGenerator {
        void createpdf(cv t)
    {
        Document  mydoc = new Document();
        PdfWriter p;
        try {
            
        p = PdfWriter.getInstance(mydoc,new FileOutputStream
            ("C:\\Users\\Koshika Gupta\\Desktop\\"+t.getFname()+".pdf"));
      
        mydoc.open();
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph("PERSONAL INFORMATION"));
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
        
        mydoc.add(new Paragraph(t.getFname()+t.getSname()));
        mydoc.add(new Paragraph(t.getContact()));
        mydoc.add(new Paragraph(t.getEmail()));
        mydoc.add(new Paragraph(t.getAdress1()));
        mydoc.add(new Paragraph(t.getAddress2()));
        
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph("QUALIFICATIONS"));
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph("University Name------"+t.getUnivname()));
        mydoc.add(new Paragraph(t.getQ1()));
        mydoc.add(new Paragraph(t.getQ2()));
        
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph("SKILLS"));
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph(t.getSkill1()));
        mydoc.add(new Paragraph(t.getSkill2()));
        mydoc.add(new Paragraph(t.getSkill3()));
        
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph("WORK EXPERIENCE"));
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph("COMPANY NAME------"+t.getCn1()));
        mydoc.add(new Paragraph("WORK DONE------"+t.getWd1()));
        mydoc.add(new Paragraph("COMPANY NAME------"+t.getCn2()));
        mydoc.add(new Paragraph("WORK DONE ------"+t.getWd2()));
        mydoc.add(new Paragraph("COMPANY NAME------"+t.getCn3()));
        mydoc.add(new Paragraph("WORK DONE------"+t.getWd3()));
        } 
        catch (DocumentException ex) {
         ex.printStackTrace();
        } 
        catch (FileNotFoundException ex) {
        }
        mydoc.close();
        System.out.println("done! pdf created");
                }
}
