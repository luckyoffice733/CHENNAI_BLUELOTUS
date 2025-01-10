package com.cg.training.date;

import java.time.LocalDate;
import java.util.Scanner;

public class ExampleOnDateInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the entry");
		String ln = sc.nextLine();//1001:mouse:3000:2021-09-30
		String s[]=ln.split(":");
		System.out.println(s[3]+" "+s[3].getClass());
		/*
		 * for(String st:s) { System.out.println(st); }
		 */
		
	//default format date of LocalDate - YYYY-mm-dd
		//String dateformat into LocalDate class using parse()
		LocalDate dt = LocalDate.parse(s[3]);
		System.out.println(dt);
		System.out.println("data type of the dt reference :"+dt.getClass());
		
	}
	
}
