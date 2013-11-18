package tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class getBusinessDays {

	public static String next_business_date;
	public static String next_business_day;
	public static String next_business_year;
	public static String next_business_month;
	
	public static String next_business_date_1;
	public static String next_business_day_1;
	public static String next_business_year_1;
	public static String next_business_month_1;
	public static Date d = new Date("11/21/2013");
	
	public static void next_business_day() {  
		//Date d = new Date(a);  
		Calendar calendar = Calendar.getInstance();  
		calendar.setTime(d);  

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);  

		if (dayOfWeek == Calendar.FRIDAY) {  
			calendar.add(Calendar.DATE, 3);  
		} else if (dayOfWeek == Calendar.SATURDAY) {  
			calendar.add(Calendar.DATE, 2);  
		} else {  
			calendar.add(Calendar.DATE, 1);  
		}  

		Date nextBusinessDay = calendar.getTime(); 
		DateFormat dateFormat = new SimpleDateFormat("MM/d/YYYY");
		next_business_date=dateFormat.format(nextBusinessDay);
		System.out.println("Today's date      : " + dateFormat.format(d));  
		System.out.println("Next business date: " + next_business_date ); 
		
		DateFormat dayFormat = new SimpleDateFormat("d");
		next_business_day=dayFormat.format(nextBusinessDay);
		System.out.println("Next business day: " + next_business_day );  
		
		DateFormat monthFormat = new SimpleDateFormat("MMMMM");
		next_business_month=monthFormat.format(nextBusinessDay);
		System.out.println("Business month: " + next_business_month ); 
		
		DateFormat yearFormat = new SimpleDateFormat("YYYY");
		next_business_year=yearFormat.format(nextBusinessDay);
		System.out.println("Business year: " + next_business_year );  

	}  

	public static void next_business_day_1() {  
		@SuppressWarnings("deprecation")
		Date d1 = new Date(next_business_date);  
		Calendar calendar = Calendar.getInstance();  
		calendar.setTime(d1);  

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);  

		if (dayOfWeek == Calendar.FRIDAY) {  
			calendar.add(Calendar.DATE, 3);  
		} else if (dayOfWeek == Calendar.SATURDAY) {  
			calendar.add(Calendar.DATE, 2);  
		} else {  
			calendar.add(Calendar.DATE, 1);  
		}  

		Date nextBusinessDay = calendar.getTime(); 
		DateFormat dateFormat = new SimpleDateFormat("MM/d/YYYY");
		next_business_date_1=dateFormat.format(nextBusinessDay);
		System.out.println("Initial date      : " + dateFormat.format(d1));  
		System.out.println("Next business date: " + next_business_date_1 ); 
		
		DateFormat dayFormat = new SimpleDateFormat("d");
		next_business_day_1=dayFormat.format(nextBusinessDay);
		System.out.println("Next business day: " + next_business_day_1 );  
		
		DateFormat monthFormat = new SimpleDateFormat("MMMMM");
		next_business_month_1 =monthFormat.format(nextBusinessDay);
		System.out.println("Business month: " + next_business_month_1 ); 
		
		DateFormat yearFormat = new SimpleDateFormat("YYYY");
		next_business_year_1 =yearFormat.format(nextBusinessDay);
		System.out.println("Business year: " + next_business_year_1 );  

	}  

}
