package com.training.usecases;

import java.util.Scanner;

public class ExampleOnArray5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size");
		int rz = sc.nextInt();
		
		
		System.out.println("Enter the col size");
		int cz = sc.nextInt();
				
				
		String s[][] = new String[rz][cz];
		sc.nextLine();
		
		System.out.println("Initialize an array using for loop");
		for(int i=0;i<rz;i++) {
			for(int j=0;j<cz;j++) {
			System.out.println("Enter the value/element at index position: s["+i+"]["+j+"]");
			s[i][j]=sc.nextLine();
		}
		}
		
		System.out.println("Element from array using for loop");
		for(int i=0;i<rz;i++) {
			for(int j=0;j<cz;j++) {
			System.out.print(s[i][j]+" ");
	
		}
			System.out.println("");
		}
		
		
		sc.close();
	}
	
}
