package cv.generator;

import java.util.Properties;
import javax.activation.*;
import javax.mail.PasswordAuthentication;
import javax.mail.*;
import javax.mail.internet.*;

public class mailClass {
 
    int sendpassword(userdata t)
    {
         try {
            String to = t.getEmailid();

            // Sender's email ID needs to be mentioned
            String from = "koshika@gmail.com";

            // Assuming you are sending email from localhost
            String host = "465";

            // Get system properties
            Properties prop = System.getProperties();

            String username = "koshikaje@gmail.com";
            String password = "koshikaa@a";
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

            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Your Password for CV Generator");
            BodyPart messageBodyPart = new MimeBodyPart();

            messageBodyPart.setText("Your password is ");
            messageBodyPart.setText(t.getPassword());
            messageBodyPart.setText("Thank You! for using CV genretaor!");
            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);
            
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Sent message successfully....");
            return 1;
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    int sendpdf(cv t , String pdfPath) {
        try {
            String to = t.getEmail();

            // Sender's email ID needs to be mentioned
            String from = "koshika@gmail.com";

            // Assuming you are sending email from localhost
            String host = "465";

            // Get system properties
            Properties prop = System.getProperties();

            String username = "koshikaje@gmail.com";
            String password = "koshikaa@a";
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

            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Thank you for using CV Generator!");
            BodyPart messageBodyPart = new MimeBodyPart();

            // Fill the message
            messageBodyPart.setText("Here is your CV! please find the attachment enclosed!");

            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            String filename = pdfPath;
            String filename1 = t.getFname();
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename1);
            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);

            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
            return 1;
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
