package calendar;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateConversion {
	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Calendar cal = Calendar.getInstance();				  
	    String minDate = dateFormat.format(cal.getTime());
	    
	    Timestamp ts = Timestamp.valueOf(minDate);
	    System.out.println(ts);
		
		/*String startDate="01-02-2013";
		   
		   java.util.Date date;
		try {
			date = dateFormat.parse(startDate);
			 java.sql.Date sqlStartDate = new Date(date.getTime()); 
			 System.out.println(sqlStartDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		  
	/*	java.util.Date date = new java.util.Date();
		System.out.println(dateFormat.format(date));
		 Timestamp ts = Timestamp.valueOf(dateFormat.format(date));
		 System.out.println(ts);*/
	/*	Calendar cal = Calendar.getInstance();				  
	    String minDate = dateFormat.format(cal.getTime());
	    
	    Timestamp ts = Timestamp.valueOf(minDate);
	    System.out.println(ts);
	    System.out.println(minDate);
	    java.sql.Date sqlDate_validUpto = null;
	    String strDate = minDate;
	       java.util.Date util_date = null;
	       try {
	    	   util_date = dateFormat.parse(strDate);
			 sqlDate_validUpto =  new Date(util_date.getTime());
	       } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	       }
		System.out.println(sqlDate_validUpto);
		*/
		
//		long millisec = sqlDate_validUpto.getTime();
//		System.out.println(millisec);
//		
//		Calendar calendar = Calendar.getInstance();
//	     calendar.setTimeInMillis(millisec);
//	     System.out.println(dateFormat.format(calendar.getTime()));
	}
}
