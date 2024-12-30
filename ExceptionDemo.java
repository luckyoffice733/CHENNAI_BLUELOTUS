package com.training.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("statement-1");
		try {
         int a=10;
         int b=0;
         int c=a/b;
         System.out.println("division is : "+c);
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage()); //description of the exception
			System.err.println("Denominator should not be zero");
		}        
       System.out.println("end of the program");
	}
}
