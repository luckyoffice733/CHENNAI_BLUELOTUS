package com.training;

import java.util.Scanner;

public class ExampleOnDynamicRead {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee Id");
		int empId = sc.nextInt();
		System.out.println("Employee Id is : "+empId);
		
		System.out.println("Enter the employee Salary");
		double empSal= sc.nextDouble();
		System.out.println("Employee Salary is : "+empSal);
	   
		System.out.println("Enter the Sentence");
		sc.nextLine(); 
		String wrd=sc.nextLine();
		// String wrd= sc.next()+sc.nextLine();
		System.out.println(wrd);
		
		sc.close();
		
	}
}
