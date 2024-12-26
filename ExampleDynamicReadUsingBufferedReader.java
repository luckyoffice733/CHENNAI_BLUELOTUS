package com.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleDynamicReadUsingBufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the some sentence");
	    String line=br.readLine();
		 System.out.println(line);
		 
	   System.out.println("Ente the employee Id ");
	   String empId = br.readLine();
	   //convert String into int,float,double we need to use wrapper classes
	   int eid=Integer.parseInt(empId);
		System.out.println("Employee Id is : "+eid);
		
		  System.out.println("Ente the employee sal ");
		   double empSalary = Double.parseDouble(br.readLine());
		System.out.println("Employee sal is : "+ empSalary);
	}
	
	
}
