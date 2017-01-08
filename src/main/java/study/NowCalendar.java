package study;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class NowCalendar {

	public static void main(String[] args) {

		GregorianCalendar gc=new GregorianCalendar();
		int today=gc.get(Calendar.DAY_OF_MONTH);
		int today_month=gc.get(Calendar.MONTH);
		
		gc.set(Calendar.MONTH,1);
		
		int weekday=gc.get(Calendar.DAY_OF_WEEK);
		System.out.println(gc.getTime());
		int firstDayOfWeek=gc.getFirstDayOfWeek();
		String[] weekName=new DateFormatSymbols().getShortWeekdays();
		for(String s: weekName)
		System.out.printf("%4s",s);
		
	}

}
 