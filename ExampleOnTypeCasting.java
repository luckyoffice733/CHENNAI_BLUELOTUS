package com.training;

public class ExampleOnTypeCasting {
	//byte->short->int->long->float->double  --> implicit casting
	
	//char->int->long->float->double  --> implicit casting

	public static void main(String[] args) {
		//implicit casting
		int a=10;
		
		System.out.println("int value of variable a is : "+a);
		
		float b=a;
		System.out.println("float value of variable a is : "+b);
		
		 char ch='d';
		 System.out.println("char value of variable ch is :"+ch);
		 
		 double dch=ch;
		 System.out.println("double value of variable dch is :"+dch);
		
		 //Explicit casting 
		 int d =67;
		 //convert the int to char using type cast operation (which type convert) 
		 
		 char ch2=(char) d;
		 System.out.println("converted int type into char type : "+ch2);
		 
		 double sal = 3000.00;
		//convert the double to int using type cast operation (which type convert) 
		 int sl =(int) sal;
		System.out.println("Converted from double to int : "+sl);
		
		
		Object o ="raju";
		//converting Object o into String st
		String st=(String)o;
		System.out.println(st);
		
	}
	
}
