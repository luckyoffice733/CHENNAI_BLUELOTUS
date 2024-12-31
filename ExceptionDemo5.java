package com.training.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		System.out.println("statement-1");
		try {
			Scanner sc = new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=a/b;
         System.out.println("division is : "+c);
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage()); //description of the exception
			System.err.println("Denominator should not be zero");
		}catch (InputMismatchException ime) {
			System.err.println("Input should be of int type");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("here code to close the resources objecct");
		}
       System.out.println("end of the program");
	}
}
