package org.company;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;

class TestDate{

	public static void main(String args[]){
		  Date date1 = new Date();
		  Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
		 int a=localCalendar.get(Calendar.DATE);
		MyDate d1=new MyDate(18,9,1967);
		MyDate d2=new MyDate(22,7,2005);
		MyDate d3=new MyDate(d1);
	
		MyDate d4=d1;
		MyDate d5;
		d5=d2;

		
		System.out.println("Date 1: "+d1);
		System.out.println("Date 2: "+d2);
		System.out.println("Date 3: "+d3);
		System.out.println("Date 4: "+d4);
		System.out.println("Date 5: "+d5);
		System.out.println("Real Date  "+date1.toString());
		//d5=date1.addDays(3);
		System.out.println("Real Date add: "+d5);
		d5=d2.addDays(3);
		System.out.println("Date 5 + 3 days:"+d5);	
		d4=d1.addDays(a);
		System.out.println("Current Day + 10 days: "+d4);
	}
	
}