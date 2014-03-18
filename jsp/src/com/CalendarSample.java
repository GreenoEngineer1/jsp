package calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarSample {
	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String s = dateFormat.format(date);
		System.out.println(s);
		/*
		
		
		
		 Calendar c = new GregorianCalendar(2013, 9, 23);
		    int diff = Calendar.TUESDAY - c.get(Calendar.DAY_OF_WEEK);
		    if (diff < 0) {
		        diff = 7 + diff;
		    }
		    c.add(Calendar.DATE, diff);
		    Date monday = c.getTime();
		    System.out.println(monday);
		    
		
		
		System.out.println(Calendar.MONDAY + "  ," + Calendar.TUESDAY + " , "+ Calendar.WEDNESDAY + " , "+ Calendar.THURSDAY + ", "+ Calendar.FRIDAY + " , "+ Calendar.SATURDAY + " , " + Calendar.SUNDAY);
		
		SimpleDateFormat df = new SimpleDateFormat( "dd/MM/yy" );
		//parse in the date  
		java.util.Date date = null;
		try {
			date = df.parse( "06/10/2013");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		//change the pattern to output the day of week  
		df.applyPattern( "EEE" );  
		//print the formatted date out  
		System.out.println( "Day of Week = " + df.format( date ) );  
		
		String dateCurrent = df.format( date );
		
		
		
		int dateCount = 0;
		if (dateCurrent.equals("Sun")) {
			dateCount = 1;
		} else if (dateCurrent.equals("Mon")) {
			dateCount = 2;
		}else if (dateCurrent.equals("Tue")) {
			dateCount = 3;
		}else if (dateCurrent.equals( "Wed")) {
			dateCount = 4;
		}else if (dateCurrent.equals("Thu")) {
			dateCount = 5;
		}else if (dateCurrent.equals("Fri")) {
			dateCount = 6;
		}else if (dateCurrent.equals("Sat")) {
			dateCount = 7;
		}
		
		 Calendar c = new GregorianCalendar(2013, 9, 6);
		    int diff = (dateCount-1) - c.get(Calendar.DAY_OF_WEEK);
		    if (diff < 0) {
		        diff = 7 + diff;
		    }
		    c.add(Calendar.DATE, diff);
		    Date monday = c.getTime();
		    System.out.println(monday);
		
	*/}
}
