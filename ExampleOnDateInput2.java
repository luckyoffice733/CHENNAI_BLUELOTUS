package com.cg.training.date;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExampleOnDateInput2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the entry");
		String ln = sc.nextLine();//1001:mouse:3000:03/12/2022
		String s[]=ln.split(":");
		
		DateTimeFormatter  df = DateTimeFormatter.ofPattern("dd/MM/yyyy");//dd/MM/yyyy
		
		LocalDate dt = LocalDate.parse(s[3],df); //YYYY-mm-dd
		System.out.println(dt);
	
}
}