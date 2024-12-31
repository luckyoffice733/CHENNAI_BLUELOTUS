package com.training.exception;

import java.util.Scanner;

public class ExceptionDemo4 {
	
	
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  
	  //exception explicitly or conditional you can throw it using throw keyword.
	  
	  if(a<b) {
		 throw new ArithmeticException("a is greater than b");
	  }
	  
	  
		
		
		
		
	}

}
