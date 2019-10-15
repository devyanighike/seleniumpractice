package practice_examples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d= new Date();
Calendar c= Calendar.getInstance();

SimpleDateFormat sd=new SimpleDateFormat("M-dd-yyyy");
System.out.println(sd.format(d));
System.out.print(sd.get2DigitYearStart());
//System.out.print(c.get(Calendar.AM_PM));

//System.out.println(d.toString());
//	c.getTimeZone();

	}

}
