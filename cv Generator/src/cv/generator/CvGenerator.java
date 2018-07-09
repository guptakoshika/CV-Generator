package cv.generator;

import com.itextpdf.text.*;
import java.io.FileOutputStream;
import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;
import com.itextpdf.text.pdf.*;

public class CvGenerator {
        void createpdf(cv t,String path)
    {
        Document  mydoc = new Document();
        try {
            
        PdfWriter.getInstance(mydoc,new FileOutputStream
            ("C:\\Users\\Koshika Gupta\\Desktop\\java\\"+t.getFname()+".pdf"));
      
        Font font = new Font(Font.FontFamily.HELVETICA, 27 , Font.BOLD);
        mydoc.open();
         Image image = Image.getInstance(path);
         image.setAbsolutePosition(500f, 650f);
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph("PERSONAL INFORMATION",font));
        mydoc.add(new Paragraph("------------------------------------------------------------------------------------------------"));
        
        mydoc.add(new Paragraph(t.getFname()+t.getSname()));
        mydoc.add(new Paragraph(t.getContact()));
        mydoc.add(new Paragraph(t.getEmail()));
        mydoc.add(new Paragraph(t.getAdress1()));
        mydoc.add(new Paragraph(t.getAddress2()));
        mydoc.add(image);
        
        qualifications q = new qualifications();
        q = t.getQual();
        mydoc.add(new Paragraph("-------------------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph("QUALIFICATIONS",font));
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph(q.getUnivname()));
        mydoc.add(new Paragraph(q.getQ1()));
        mydoc.add(new Paragraph(q.getQ2()));
        
        skills s = new skills();
        s = t.getSkill();
         mydoc.add(new Paragraph("----------------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph("SKILLS",font));
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
        mydoc.add(new Paragraph("WORK EXPERIENCE",font));
        mydoc.add(new Paragraph("----------------------------------------------------------------------------------------"));
        mydoc.add(new Paragraph(w.getCn1()));
        mydoc.add(new Paragraph(w.getWd1()));
        mydoc.add(new Paragraph(w.getCn2()));
        mydoc.add(new Paragraph(w.getWd2()));
        mydoc.add(new Paragraph(w.getCn3()));
        mydoc.add(new Paragraph(w.getWd3()));
        mydoc.close();
        System.out.println("done! pdf created");
        sendmail(t);
      }
        catch(Exception e)
                        {
                        
                        }
    }
        void sendmail(cv t ){
            try {
                String to = "koshikaje@gmail.com";
                
                // Sender's email ID needs to be mentioned
                String from = "koshika@gmail.com";
                
                // Assuming you are sending email from localhost
                String host = "465";
                
                // Get system properties
                Properties prop = System.getProperties();
                
                String username = "koshikaje@gmail.com";
                String password= "koshikaa@a";
                // Setup mail server
                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "465");
                props.put("mail.transport.protocol", "smtp");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                
                Session session = Session.getInstance(props,
                        new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(username, password);
                            }
                        });
                MimeMessage message = new MimeMessage(session);
                
                // Set From: header field of the header.
                message.setFrom(new InternetAddress(from));
                
                // Set To: header field of the header.
                message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
                
                // Set Subject: header field
                message.setSubject("Thank you for using CV Generator!");
                
                // Create the message part
                BodyPart messageBodyPart = new MimeBodyPart();
                
                // Fill the message
                messageBodyPart.setText("Here is your CV! please find the attachment enclosed!");
                
                // Create a multipar message
                Multipart multipart = new MimeMultipart();
                
                // Set text message part
                multipart.addBodyPart(messageBodyPart);
                messageBodyPart = new MimeBodyPart();
                String filename = "C:\\Users\\Koshika Gupta\\Desktop\\java\\"+t.getFname()+".pdf";
                String filename1 = t.getFname();
                DataSource source = new FileDataSource(filename);
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(filename1);
                multipart.addBodyPart(messageBodyPart);
                
                // Send the complete message parts
                message.setContent(multipart );
                
                // Send message
                Transport.send(message);
                System.out.println("Sent message successfully....");
            } catch (AddressException ex) {
                ex.printStackTrace();
            } catch (MessagingException ex) {
                    ex.printStackTrace();
            }
        } 
}
