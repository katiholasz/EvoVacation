package tools;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

import com.sun.mail.imap.IMAPFolder;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class MAIL {

	Session session;

	public static void checkEmailWithParameters(String mailType, String username, String password,
			String from, String subject) throws MessagingException, IOException {
		try {

			Properties props = new Properties();
			props.put("mail.store.protocol", "imaps");

			Session session;
			session = Session.getDefaultInstance(props, null);

			Store store = session.getStore("imaps");
			store.connect(mailType, username, password);

			IMAPFolder folder = (IMAPFolder) store.getFolder("inbox");
			folder.open(Folder.READ_ONLY);

			Flags seen = new Flags(Flags.Flag.SEEN);
			FlagTerm unseenFlagTerm = new FlagTerm(seen, false);
			Message message[] = folder.search(unseenFlagTerm);

			@SuppressWarnings("unused")
			String content;

			int x = message.length - 1;
			for (int i = x; i >= 0; i--) {
				System.out.println("From :" + message[i].getFrom()[0]);
				System.out.println("Subject : " + message[i].getSubject());
				System.out.println("Date : " + message[i].getReceivedDate());

				Date date = message[i].getReceivedDate();
				String f = message[i].getFrom()[0].toString();
				String FromE = from;
				String subj = message[i].getSubject().toString();
				String SubjE = subject;

				if (from.contains(FromE) && subj.contains(SubjE)) {
					System.out.println("The email was received successfully! ");
					break;
				} else {
					System.out.println("The email wasn't found!");
				}

				Object content1 = message[i].getContent();

				if (content1 instanceof String) {
					String body = (String) content1;
					System.out.println("Body: " + body);
					System.out
							.println("-------------------------------------------------------------------------");

				} else {

					Multipart multipart = (Multipart) message[i].getContent();
					for (int j = 0; j < multipart.getCount(); j++) {
						BodyPart bodyPart = multipart.getBodyPart(j);
						String disposition = bodyPart.getDisposition();
						if (disposition != null
								&& (disposition.equalsIgnoreCase("ATTACHMENT"))) {
							System.out
									.println("Your email contains ATTACHMENTS!");

							DataHandler handler = bodyPart.getDataHandler();
							System.out.println("file name : "
									+ handler.getName());
						} else {

							System.out.println("Content of the email: \n"
									+ bodyPart.getContent());
							content = bodyPart.getContent().toString();
						}
					}
				}

			}

			folder.close(false);
			store.close();
		} catch (MessagingException e) {
			System.out.println("Error: " + e);
		}

	}
}
