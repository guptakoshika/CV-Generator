package cv.generator;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

public class CvGenerator {
        void createpdf(cv t)
    {
        
      String to = "koshikaje@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "koshikaje@gmail.com";

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
        mydoc.close();
        System.out.println("done! pdf created");
        
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("This is the Subject Line!");

         // Create the message part 
         BodyPart messageBodyPart = new MimeBodyPart();

         // Fill the message
         messageBodyPart.setText("This is message body");
         
         // Create a multipar message
         Multipart multipart = new MimeMultipart();

         // Set text message part
         multipart.addBodyPart(messageBodyPart);
          messageBodyPart = new MimeBodyPart();
         String filename = "C:\\Users\\Koshika Gupta\\Desktop\\"+t.getFname()+".pdf";
         DataSource source = new FileDataSource(filename);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(filename);
         multipart.addBodyPart(messageBodyPart);

         // Send the complete message parts
         message.setContent(multipart );

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
        } 
        catch (DocumentException | FileNotFoundException | MessagingException ex) {
         ex.printStackTrace();
        } 
      }
}
