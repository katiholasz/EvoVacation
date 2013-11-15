package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class GetEmail {

	public static void email() {
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getDefaultInstance(props, null);
			Store store = session.getStore("imaps");

			// IMAP host for gmail

			store.connect("imap.gmail.com", "holaszkati@gmail.com",
					"fcbarcelona1991");
			
			// IMAP host for yahoo.
			// store.connect("imap.mail.yahoo.com", "<username>", "<password>");

			System.out.println(store);

			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_ONLY);

			BufferedReader optionReader = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("Press 'U' to get only UNREAD mails!");
			System.out.println("Press 'A' to get all mails");
			try {
				char answer = (char) optionReader.read();
				if (answer == 'A' || answer == 'a') {
					tools.ShowAllEmails.showAllMails(inbox);
				} else if (answer == 'U' || answer == 'u') {
					tools.ShowUnreadEmails.showUnreadMails(inbox);
				}
				optionReader.close();
			} catch (IOException e) {
				System.out.println(e);
			}

		} catch (NoSuchProviderException e) {
			System.out.println(e.toString());
			System.exit(1);
		} catch (MessagingException e) {
			System.out.println(e.toString());
			System.exit(2);
		}

	}


	

}
