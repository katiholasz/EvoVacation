package tools;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;

public class ShowAllEmails {
	static public void showAllMails(Folder inbox) {
		try {
			Message msg[] = inbox.getMessages();
			System.out.println("MAILS: " + msg.length);
			for (Message message : msg) {
				try {
					System.out.println("DATE: " + message.getSentDate().toString());
					System.out.println("FROM: " + message.getFrom()[0].toString());
					System.out.println("SUBJECT: " + message.getSubject().toString());
					System.out.println("CONTENT: " + message.getContent().toString());
					System.out.println("--------------------------------------------------------------------------------------");
				} catch (Exception e) {
					System.out.println("No emails were found!");
				}
			}
		} catch (MessagingException e) {
			System.out.println(e.toString());
		}
	}

}
