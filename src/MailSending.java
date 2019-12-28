
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class MailSending
{
	public static void main(String[] args)
	{
		new MailSending();
	}

	String d_email = "exemple@gmail.com", d_password = "mot de passe de exemple@gmail.com ",
	d_host = "smtp.gmail.com", d_port = "465",
	m_subject = "Data integrity Alert from TPA ", m_text = "text from me to you";

	public MailSending( ) {


	String s1 = " ";

	SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

	Date now = new Date();

	String strDate = sdfDate.format(now);
	String strTime = sdfTime.format(now);

	String dt = strDate + " " + strTime;


	m_text = " ";

	Properties props = System.getProperties();
	props.put("mail.smtp.user", d_email);
	props.put("mail.smtp.host", d_host);
	props.put("mail.smtp.port", d_port);
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.auth", "true");
	// props.put("mail.smtp.debug", "true");
	props.put("mail.smtp.socketFactory.port", d_port);
	props.put("mail.smtp.socketFactory.class",
	"javax.net.ssl.SSLSocketFactory");
	props.put("mail.smtp.socketFactory.fallback", "false");

	SecurityManager security = System.getSecurityManager();

	try {

	Authenticator auth = new SMTPAuthenticator();
	Session session = Session.getInstance(props, auth);
	// session.setDebug(true);

	MimeMessage msg = new MimeMessage(session);
	msg.setText(m_text);

	msg.setSubject(m_subject);
	msg.setFrom(new InternetAddress(d_email));
	msg.addRecipient(Message.RecipientType.TO,new InternetAddress("pourquile_mesaage_est_destiné@gmail.com"));
	Transport.send(msg);
	} catch (Exception mex) {
	mex.printStackTrace();
	}
	}

	private class SMTPAuthenticator extends javax.mail.Authenticator {
	public PasswordAuthentication getPasswordAuthentication() {
	return new PasswordAuthentication(d_email, d_password);
	}
 }
}
