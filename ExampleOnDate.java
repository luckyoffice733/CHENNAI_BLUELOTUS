package com.cg.training.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleOnDate {

	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();//current system date
		System.out.println(d);// Wed sept 18 Ist 2024
	
		String pattern="yyyy-MM-dd"; //HH -hours ,mm -- minute, MM--millsecond, ss-seconds
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String d2=sdf.format(d);//it will covert the Date into given pattern format return in string
		System.out.println(d2);//2024-09-18
		
		Date d3= sdf.parse(d2); //converting string format of date into Date class format
		//System.out.println(d3);//
		
        /*
		 * System.out.println(d);//current system date and time
		 * System.out.println("Day : "+d.getDate()); //18
		 * System.out.println("Month: "+d.getMonth());
		 * System.out.println("Year : "+d.getYear());
		 */
		//LocalDate,LocaDateTime,LocalTime
		
	}
}
