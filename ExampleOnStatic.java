package com.training;

public class ExampleOnStatic {

	static final double pi=3.142; //static  variable
	
	
	static { //static block
		System.out.println("we are in static block");
	}
	
	public static void display() {//static  method
		System.out.println("we are in display method");
	}
	
	
	public static void main(String[] args) {
		System.out.println(ExampleOnStatic.pi);
		ExampleOnStatic.display();
		
		//2nd way
		System.out.println(pi);
		display();
		
	}
	
	
}
