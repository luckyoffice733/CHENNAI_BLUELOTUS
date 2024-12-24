package com.training;

import java.util.Scanner;

public class ExampleOnMenu {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch='y';
		do {
		
		System.out.println("Menu");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBSTRACTION");
		System.out.println("3.DIVISION");
		System.out.println("5.EXIT");
		
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		
		switch(choice) {
		 
		case 1:System.out.println("Enter the firt input1");
		       int a=sc.nextInt();
		       System.out.println("Enter the firt input2");
		       int b=sc.nextInt();
		       System.out.println("Some to two numbers is : "+(a+b));
		       break;
		case 2:System.out.println("Enter the firt input1");
	       a=sc.nextInt();
	       System.out.println("Enter the firt input2");
	       b=sc.nextInt();
	       System.out.println("Substraction of  to two numbers is : "+(a-b));
	       break;
	       
		case 5:System.out.println("Exists From Operation");
		     ch='Y';
		
		}
		
		
		
		}while(ch!='Y');
		
		
		
	}

}
