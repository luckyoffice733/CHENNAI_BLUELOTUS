package com.training.usecases;

import java.util.Scanner;

public class ExampleOnArray2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int sz = sc.nextInt();
		
		String s[] = new String[sz];
		sc.nextLine();
		System.out.println("Initialize an array using for loop");
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter the value/element at index position: s["+i+"]");
			s[i]=sc.nextLine();
		}
		
		System.out.println("Element from array using for loop");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
	
		}
		
		System.out.println("Element from array using enhancedfor loop");
		for(String s1:s) {
			System.out.println(s1);
	
		}
		
	}
	
}
