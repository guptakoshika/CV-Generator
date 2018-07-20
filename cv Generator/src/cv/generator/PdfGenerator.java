package cv.generator;

import Screens.workexperience;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;

public class PdfGenerator {

    int createpdf(cv t, String imagepath, String pdfpath) {
        Document mydoc = new Document();
        try {

            PdfWriter.getInstance(mydoc, new FileOutputStream(pdfpath + t.getFname() + ".pdf"));

            Font font = new Font(Font.FontFamily.HELVETICA, 27, Font.BOLD);
            mydoc.open();
            Image image = Image.getInstance(imagepath);
            image.setAbsolutePosition(300f, 550f);
            mydoc.add(new Paragraph("----------------------------------------------------------------------------------------------"));
            mydoc.add(new Paragraph("PERSONAL INFORMATION", font));
            mydoc.add(new Paragraph("------------------------------------------------------------------------------------------------"));

            mydoc.add(new Paragraph(t.getFname() + t.getSname()));
            mydoc.add(new Paragraph(t.getContact()));
            mydoc.add(new Paragraph(t.getEmail()));
            mydoc.add(new Paragraph(t.getAdress1()));
            mydoc.add(new Paragraph(t.getAddress2()));
            mydoc.add(image);

            qualifications q = new qualifications();
            q = t.getQual();
            mydoc.add(new Paragraph("-------------------------------------------------------------------------------------------------"));
            mydoc.add(new Paragraph("QUALIFICATIONS", font));
            mydoc.add(new Paragraph("----------------------------------------------------------------------------------------------"));
            mydoc.add(new Paragraph(q.getUnivname()));
            mydoc.add(new Paragraph(q.getQ1()));
            mydoc.add(new Paragraph(q.getQ2()));

            skills s = new skills();
            s = t.getSkill();
            mydoc.add(new Paragraph("----------------------------------------------------------------------------------------------"));
            mydoc.add(new Paragraph("SKILLS", font));
            mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
            PdfPTable table = new PdfPTable(2);

            PdfPCell cell1 = new PdfPCell(new Paragraph(s.getSkill1()));
            PdfPCell cell2 = new PdfPCell(new Paragraph(s.getSkill2()));

            table.addCell(cell1);
            table.addCell(cell2);
            mydoc.add(table);
            PdfPCell cell3 = new PdfPCell(new Paragraph(s.getSkill3()));
            PdfPCell cell4 = new PdfPCell(new Paragraph(s.getSkill4()));
            mydoc.add(table);

            workexperience w = new workexperience();
            w = t.getWork();
            mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
            mydoc.add(new Paragraph("WORK EXPERIENCE", font));
            mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
            mydoc.add(new Paragraph(w.getCn1()));
            mydoc.add(new Paragraph(w.getWd1()));
            mydoc.add(new Paragraph(w.getCn2()));
            mydoc.add(new Paragraph(w.getWd2()));
            mydoc.add(new Paragraph(w.getCn3()));
            mydoc.add(new Paragraph(w.getWd3()));
            mydoc.close();
            System.out.println("done! pdf created");
            mailClass m = new mailClass();
            int r = m.sendpdf(t);
            return r;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
