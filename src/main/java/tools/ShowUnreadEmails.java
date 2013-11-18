package tools;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.search.FlagTerm;

public class ShowUnreadEmails {

	public static String email_date;
	public static String email_received_date;
	public static String email_sender;
	public static String email_subject;
	public static String email_content;

	static public void showUnreadMails(Folder inbox) {
		try {
			FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
			Message msg[] = inbox.search(ft);
			System.out.println("MAILS: " + msg.length);
			for (Message message : msg) {
				try {
					System.out.println("DATE: \t" + message.getSentDate().toString());
					email_date = message.getSentDate().toString();
					System.out.println("RECEIVED DATE: \t" + message.getReceivedDate().toString());
					email_received_date = message.getReceivedDate().toString();
					//System.out.println("SENT DATE: \t" + message.getSentDate());
					/*System.out.println("MONTH: \t" + message.getSentDate());
					System.out.println("DAY: \t" + message.getSentDate().toString());
					System.out.println("HOUR: \t" + message.getSentDate().toString());
					System.out.println("MINUTES: \t" + message.getSentDate().toString());
					System.out.println("SECONDS: \t" + message.getSentDate().toString());
					System.out.println("TIMEZONE: \t" + message.getSentDate().toString());*/
					System.out.println("FROM: \t "+ message.getFrom()[0].toString());
					email_sender = message.getFrom()[0].toString();
					System.out.println("SUBJECT: \t"+ message.getSubject().toString());
					email_subject = message.getSubject().toString();
					System.out.println("CONTENT: \t"+ message.getContent().toString());
					email_content = message.getContent().toString();
					System.out.println("------------------------------------------------------------------------------------------");
				} catch (Exception e) {
					System.out.println("No unreaded emails were found!");
				}
			}
		} catch (MessagingException e) {
			System.out.println(e.toString());
		}
	}

}
