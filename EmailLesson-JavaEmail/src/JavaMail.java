import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class JavaMail {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("poczta.interia.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("login", "password"));
        email.setSSLOnConnect(true);
        email.setFrom("fromemail");
        email.setSubject("Email z kursu Java");
        email.setMsg("Cześć uczę się właśnie javy i idzie mi świetnie.\n" +
                "Pozdrawiam.");
        email.addTo("toemail");
        System.out.println("Wysyłanie e-maila.");
        email.send();
        System.out.println("E-mail wysłany");
    }
}
