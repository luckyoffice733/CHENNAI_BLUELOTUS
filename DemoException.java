package com.training.exception;

public class DemoException {
	
	public static void division(int num1,int num2 ) {
		
		int qut = num1/num2;
		System.out.println("Quotient is : "+qut);
		
	}

	public static void main(String[] args) {
		
		try {
		DemoException.division(10,0);//exception propogation
		}catch(ArithmeticException ae) {
			System.err.println("Denomiator should not be zero");
		}
		
		
	}
}
