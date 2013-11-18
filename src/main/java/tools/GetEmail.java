package tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

public class GetEmail {

	public static void all_emails() {
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getDefaultInstance(props, null);
			Store store = session.getStore("imaps");

			// IMAP host for gmail
			//store.connect("imap.mail.gmail.com", "", "");
			store.connect("zimbra.evozon.com", "amelia.ilies@evozon.com","Qwerty12345!");
			// IMAP host for yahoo.
			// store.connect("imap.mail.yahoo.com", "<username>", "<password>");
			System.out.println(store);

			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_ONLY);

			BufferedReader optionReader = new BufferedReader(new InputStreamReader(System.in));
			/*System.out.println("Press 'U' to get only UNREAD mails!");
			System.out.println("Press 'A' to get all mails");
			try {
				char answer = (char) optionReader.read();
				if (answer == 'A' || answer == 'a') {
			 */
			tools.ShowAllEmails.showAllMails(inbox);
			
			/*tools.Constants.EMAIL_RECIEVED_DATE.compareTo(tools.ShowAllEmails.email_date) ;
			tools.Constants.EMAIL_FROM.compareTo(tools.ShowAllEmails.email_sender) ;
			tools.Constants.EMAIL_CONTENT.compareTo(tools.ShowAllEmails.email_content) ;
			tools.Constants.EMAIL_SUBJECT_APPROVED.compareTo(tools.ShowAllEmails.email_subject) ;*/
			
			/*} else if (answer == 'U' || answer == 'u') {
					tools.ShowUnreadEmails.showUnreadMails(inbox);
				}
				optionReader.close();
			} catch (IOException e) {
				System.out.println(e);
			}

		} catch (NoSuchProviderException e) {
			System.out.println(e.toString());
			System.exit(1);*/
		} catch (MessagingException e) {
			System.out.println(e.toString());
			System.exit(2);
		}
	}

	public static void new_vacation_request_submited_email() {
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getDefaultInstance(props, null);
			Store store = session.getStore("imaps");
			//store.connect("imap.mail.gmail.com", "", "");
			store.connect("zimbra.evozon.com", "amelia.ilies@evozon.com","Qwerty12345!");
			// store.connect("imap.mail.yahoo.com", "<username>", "<password>");
			System.out.println(store);

			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_ONLY);

			@SuppressWarnings("unused")
			BufferedReader optionReader = new BufferedReader(new InputStreamReader(System.in));
			tools.CheckVacationRequest.checked_email_if_user_submited_new_vacation_request(inbox);
		
		} catch (MessagingException e) {
			System.out.println(e.toString());
			System.exit(2);
		}
	}

	public static void vacation_approved_email() {
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getDefaultInstance(props, null);
			Store store = session.getStore("imaps");
			//store.connect("imap.mail.gmail.com", "", "");
			store.connect("zimbra.evozon.com", "amelia.ilies@evozon.com","Qwerty12345!");
			// store.connect("imap.mail.yahoo.com", "<username>", "<password>");
			System.out.println(store);

			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_ONLY);

			BufferedReader optionReader = new BufferedReader(new InputStreamReader(System.in));
		
			tools.CheckVacationRequest.checked_email_if_vacation_approved(inbox);
		
		} catch (MessagingException e) {
			System.out.println(e.toString());
			System.exit(2);
		}
	}
	
	public static void vacation_rejected_email(){
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getDefaultInstance(props, null);
			Store store = session.getStore("imaps");
			//store.connect("imap.mail.gmail.com", "", "");
			store.connect("zimbra.evozon.com", "amelia.ilies@evozon.com","Qwerty12345!");
			// store.connect("imap.mail.yahoo.com", "<username>", "<password>");
			System.out.println(store);
			
			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_ONLY);
			
			BufferedReader optionReader = new BufferedReader(new InputStreamReader(System.in));
			
			tools.CheckVacationRequest.checked_email_if_vacation_rejected(inbox);
			
		} catch (MessagingException e) {
			System.out.println(e.toString());
			System.exit(2);
		}
	}

}
