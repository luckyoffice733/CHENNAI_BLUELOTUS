package com.training.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo6 {
	public static void main(String[] args) {
		System.out.println("statement-1");
		try {
			Scanner sc = new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=a/b;
         System.out.println("division is : "+c);
		}catch(ArithmeticException | InputMismatchException ae) {
			ae.printStackTrace();
		}
		
       System.out.println("end of the program");
	}
}
