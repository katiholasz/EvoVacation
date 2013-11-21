package tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;

public class ShowAllEmails {
	public static String email_sent_date;
	public static String email_received_date;
	public static String email_sender;
	public static String email_subject;
	public static String email_content;
	public static String sent_date;
	public static String cureent_date;
	public static boolean match_found=true;


	static public void showAllMails(Folder inbox) {
		try {
			Message msg[] = inbox.getMessages();
			System.out.println("MAILS: " + msg.length);
			for (Message message : msg) {
				try {
					//System.out.println("DATE: \t" + message.getSentDate().toString());
					DateFormat dateFormat = new SimpleDateFormat("EEE MMM d yyyy, 'Hour:' HH");

					Calendar cal = Calendar.getInstance();
					cureent_date=dateFormat.format(cal.getTime());
					System.out.println("CURRENT DATE: \t"+dateFormat.format(cal.getTime()));

					sent_date =dateFormat.format(message.getSentDate());
					//System.out.println("SENT DATE: \t"+ sent_date);
					System.out.println("SENT DATE: \t"+dateFormat.format(message.getSentDate()));

					email_sent_date = message.getSentDate().toString();
					System.out.println("RECEIVED DATE: \t" + dateFormat.format(message.getReceivedDate()));
					email_received_date = message.getReceivedDate().toString();
					//System.out.println("SENT DATE: \t" + message.getSentDate());

					System.out.println("FROM: \t "+ message.getFrom()[0].toString());
					email_sender = message.getFrom()[0].toString();

					System.out.println("SUBJECT: \t"+ message.getSubject().toString());
					email_subject = message.getSubject().toString();

					System.out.println("CONTENT: \t"+ message.getContent().toString());
					email_content = message.getContent().toString();

					//if(email_date==tools.Constants.EMAIL_RECIEVED_DATE || email_sender==tools.Constants.EMAIL_FROM || email_subject == tools.Constants.EMAIL_SUBJECT_APPROVED){
					if( email_sender.toString().toLowerCase().contains(tools.Constants.EMAIL_FROM.toString().toLowerCase()) 
							&& email_subject.toString().toLowerCase().contains(tools.Constants.EMAIL_SUBJECT_APPROVED.toString().toLowerCase())
							//	&& email_date.toString().toLowerCase().contains(tools.Constants.EMAIL_RECIEVED_DATE.toString().toLowerCase())
							&& email_content.toString().toLowerCase().contains(tools.Constants.EMAIL_CONTENT_USER.toString().toLowerCase())){
						match_found=true;
						//System.out.println("MATCH FOUND");
					}else
					{
						match_found=false;
						//System.out.println("NO MATCH FOUND");
					}
					
					if(match_found)
					{
						System.out.println("MATCH FOUND");
					}else
					{
						System.out.println("NO MATCH FOUND");
					}
					System.out.println("-------------------------------------------------------------------------------------------------------------");
				} catch (Exception e) {
					System.out.println("No emails were found!");
				}
			}
		} catch (MessagingException e) {
			System.out.println(e.toString());
		}
	}

}
