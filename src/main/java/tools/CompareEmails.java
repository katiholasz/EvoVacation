package tools;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;

import com.sun.mail.imap.IMAPFolder;

public class CompareEmails 
{
	public static String email_sent_date;
	public static String email_received_date;
	public static String email_sender;
	public static String email_subject;
	public static String email_content;
	public static String sent_date;
	public static String cureent_date;
	public static boolean match_found=true;

	//static public void getEmailsForApprovedVacationRequest(String EMAIL_SUBJECT_APPROVED, String EMAIL_FROM, String EMAIL_CONTENT_USER, String EMAIL_SENT_DATE) throws MessagingException,IOException {
		static public void getEmailsForApprovedVacationRequest() throws MessagingException,IOException {
		IMAPFolder folder = null;
		Store store = null;

		try {
			Properties props = System.getProperties();
			props.setProperty("mail.store.protocol", "imaps");

			Session session = Session.getDefaultInstance(props, null);

			store = session.getStore("imaps");

			store.connect(tools.Constants.IMAP_TYPE,tools.Constants.ACOOUNT_ADDRESS,tools.Constants.ACOOUNT_PASSWORD);

			folder = (IMAPFolder) store.getFolder("inbox");
			
			DateFormat dateFormat = new SimpleDateFormat("EEE MMM d yyyy, 'Hour:' HH");

			if (!folder.isOpen()) folder.open(Folder.READ_WRITE);

			Message[] msg = folder.getMessages();
			System.out.println("All Messages : " + folder.getMessageCount());
			System.out.println("Unread Messages : "+ folder.getUnreadMessageCount());
			System.out.println();
			for (Message message : msg) {				
				Calendar cal = Calendar.getInstance();
				cureent_date=dateFormat.format(cal.getTime());
				sent_date =dateFormat.format(message.getSentDate());
				email_sent_date = message.getSentDate().toString();
				email_received_date = message.getReceivedDate().toString();
				email_sender = message.getFrom()[0].toString();
				email_subject = message.getSubject().toString();
				email_content = message.getContent().toString();

				String text=email_sender+email_subject+email_content+sent_date;
				if (checkIfTextContainsTerms(text,false,tools.Constants.EMAIL_SUBJECT_APPROVED) 
						&& checkIfTextContainsTerms(text,false,tools.Constants.EMAIL_FROM)
						&& checkIfTextContainsTerms(text, false, tools.Constants.EMAIL_CONTENT_USER)
						&& checkIfTextContainsTerms(text,false,tools.Constants.EMAIL_SENT_DATE)){
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("CURRENT DATE: \t"+dateFormat.format(cal.getTime()));
					System.out.println("SENT DATE: \t"+dateFormat.format(message.getSentDate()));
					System.out.println("RECEIVED DATE: \t" + dateFormat.format(message.getReceivedDate()));
					System.out.println("FROM: \t "+ message.getFrom()[0].toString());
					System.out.println("SUBJECT: \t"+ message.getSubject().toString());
					System.out.println("CONTENT: \t"+ message.getContent().toString());
					System.out.println("MATCH FOUND!");

				}
				String contentType = message.getContentType();
				if (contentType.contains("text/plain")
						|| contentType.contains("text/html")) {
				} else if (contentType.contains("multipart")) {
					Multipart multiPart = (Multipart) message.getContent();
					int numberOfParts = multiPart.getCount();
					for (int partCount = 0; partCount < numberOfParts; partCount++) {
						BodyPart part = multiPart.getBodyPart(partCount);
					}
				}
			}
		} finally {
			if (folder != null && folder.isOpen()) {
				folder.close(true);
			}
			if (store != null) {
				store.close();
			}
		}
	}
	
	static public void getEmailsForRejectedVacationRequest() throws MessagingException,IOException {
		IMAPFolder folder = null;
		Store store = null;
		
		try {
			Properties props = System.getProperties();
			props.setProperty("mail.store.protocol", "imaps");
	
			Session session = Session.getDefaultInstance(props, null);
			store = session.getStore("imaps");
			
			folder = (IMAPFolder) store.getFolder("inbox");
			
			DateFormat dateFormat = new SimpleDateFormat("EEE MMM d yyyy, 'Hour:' HH");
	
			if (!folder.isOpen()) folder.open(Folder.READ_WRITE);
			
			Message[] msg = folder.getMessages();
			System.out.println("All Messages : " + folder.getMessageCount());
			System.out.println("Unread Messages : "+ folder.getUnreadMessageCount());
			System.out.println();
			for (Message message : msg) {				
				Calendar cal = Calendar.getInstance();
				cureent_date=dateFormat.format(cal.getTime());
				sent_date =dateFormat.format(message.getSentDate());
				email_sent_date = message.getSentDate().toString();
				email_received_date = message.getReceivedDate().toString();
				email_sender = message.getFrom()[0].toString();
				email_subject = message.getSubject().toString();
				email_content = message.getContent().toString();
				
				String text=email_sender+email_subject+email_content+sent_date;
				if (checkIfTextContainsTerms(text,false,tools.Constants.EMAIL_SUBJECT_REJECTED) 
						&& checkIfTextContainsTerms(text,false,tools.Constants.EMAIL_FROM)
						&& checkIfTextContainsTerms(text, false, tools.Constants.EMAIL_CONTENT_USER)
						&& checkIfTextContainsTerms(text,false,tools.Constants.EMAIL_SENT_DATE)){
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("CURRENT DATE: \t"+dateFormat.format(cal.getTime()));
					System.out.println("SENT DATE: \t"+dateFormat.format(message.getSentDate()));
					System.out.println("RECEIVED DATE: \t" + dateFormat.format(message.getReceivedDate()));
					System.out.println("FROM: \t "+ message.getFrom()[0].toString());
					System.out.println("SUBJECT: \t"+ message.getSubject().toString());
					System.out.println("CONTENT: \t"+ message.getContent().toString());
					System.out.println("MATCH FOUND!");
					
				}
				String contentType = message.getContentType();
				if (contentType.contains("text/plain")
						|| contentType.contains("text/html")) {
				} else if (contentType.contains("multipart")) {
					Multipart multiPart = (Multipart) message.getContent();
					int numberOfParts = multiPart.getCount();
					for (int partCount = 0; partCount < numberOfParts; partCount++) {
						BodyPart part = multiPart.getBodyPart(partCount);
					}
				}
			}
		} finally {
			if (folder != null && folder.isOpen()) {
				folder.close(true);
			}
			if (store != null) {
				store.close();
			}
		}
	}
	
	static public void getEmailsForSubmitedVacationRequest() throws MessagingException,IOException {
		IMAPFolder folder = null;
		Store store = null;
		
		try {
			Properties props = System.getProperties();
			props.setProperty("mail.store.protocol", "imaps");
			
			Session session = Session.getDefaultInstance(props, null);
			
			store = session.getStore("imaps");
			
			store.connect(tools.Constants.IMAP_TYPE,tools.Constants.ACOOUNT_ADDRESS,tools.Constants.ACOOUNT_PASSWORD);
			
			folder = (IMAPFolder) store.getFolder("inbox");
			
			DateFormat dateFormat = new SimpleDateFormat("EEE MMM d yyyy, 'Hour:' HH");
			
			if (!folder.isOpen()) folder.open(Folder.READ_WRITE);
			
			Message[] msg = folder.getMessages();
			System.out.println("All Messages : " + folder.getMessageCount());
			System.out.println("Unread Messages : "+ folder.getUnreadMessageCount());
			System.out.println();
			for (Message message : msg) {				
				Calendar cal = Calendar.getInstance();
				cureent_date=dateFormat.format(cal.getTime());
				sent_date =dateFormat.format(message.getSentDate());
				email_sent_date = message.getSentDate().toString();
				email_received_date = message.getReceivedDate().toString();
				email_sender = message.getFrom()[0].toString();
				email_subject = message.getSubject().toString();
				email_content = message.getContent().toString();
				
				String text=email_sender+email_subject+email_content+sent_date;
				if (checkIfTextContainsTerms(text,false,tools.Constants.EMAIL_SUBJECT_NEW_REQUEST) 
						&& checkIfTextContainsTerms(text,false,tools.Constants.EMAIL_FROM)
						&& checkIfTextContainsTerms(text, false, tools.Constants.EMAIL_CONTENT_USER)
						&& checkIfTextContainsTerms(text,false,tools.Constants.EMAIL_SENT_DATE)){
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("CURRENT DATE: \t"+dateFormat.format(cal.getTime()));
					System.out.println("SENT DATE: \t"+dateFormat.format(message.getSentDate()));
					System.out.println("RECEIVED DATE: \t" + dateFormat.format(message.getReceivedDate()));
					System.out.println("FROM: \t "+ message.getFrom()[0].toString());
					System.out.println("SUBJECT: \t"+ message.getSubject().toString());
					System.out.println("CONTENT: \t"+ message.getContent().toString());
					System.out.println("MATCH FOUND!");
					
				}
				String contentType = message.getContentType();
				if (contentType.contains("text/plain")
						|| contentType.contains("text/html")) {
				} else if (contentType.contains("multipart")) {
					Multipart multiPart = (Multipart) message.getContent();
					int numberOfParts = multiPart.getCount();
					for (int partCount = 0; partCount < numberOfParts; partCount++) {
						BodyPart part = multiPart.getBodyPart(partCount);
					}
				}
			}
		} finally {
			if (folder != null && folder.isOpen()) {
				folder.close(true);
			}
			if (store != null) {
				store.close();
			}
		}
	}

	public static boolean checkIfTextContainsTerms(String text,
			boolean ignoreCase, String... strTerms) {
		text = removeNewLinesMultipleSpacesAndTabs(text);
		if (ignoreCase)
			text = text.toLowerCase();
		for (String term : strTerms) {
			if (ignoreCase)
				term = term.toLowerCase();
			if (!text.contains(term))
				return false;
		}
		return true;
	}

	public static String removeNewLinesMultipleSpacesAndTabs(String body) {
		body = body.replaceAll("[\0\t\n\r]", " ");
		body = body.replaceAll("&nbsp;", " ");
		while (body.indexOf("  ") != -1) {
			body = body.replaceAll("  ", " ");
		}
		return body;
	}
}

