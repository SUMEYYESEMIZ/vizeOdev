import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {

    public static void sendEmail(String toEmail, String subject, String messageBody) throws Exception {
        // SMTP sunucu ve port bilgileri
        String host = "smtp.gmail.com";
        int port = 587;

        // SMTP kimlik doğrulama bilgileri
        String username = "gonderen@gmail.com";
        String password = "sifre";

        // E-posta ayarları
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        // Session oluşturma
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        // E-posta oluşturma
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
        message.setSubject(subject);
        message.setText(messageBody);

        // E-posta gönderme
        Transport.send(message);

        System.out.println("E-posta gönderildi!");
    }
}
