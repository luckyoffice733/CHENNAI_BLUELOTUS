package com.training;

public class ExampleOnVariables {
	
	//declaring variables in java 
	//syntax:
	//accessmodifier  datatype variableName;
	
	long  empId;   //instance variables
	String empName;
	double empSal;
	static String compyName="CG"; //static variable
	
	//syntax for the method declaration
	//accessmodifier returnType methodName(parameters if any...){}
	
	public void methodOne() {//instance method
		int a=10;  //localvariable
		System.out.println("local variable value is : "+a);
	}
	
	public static void methodTwo() {// static method
		System.out.println("we are in method Two");
	}
	
	
	public static void main(String[] args) {
		
		//creating object for a class using new operator
		//syntax:   ClassName referenceVariable = new ClassName();
		ExampleOnVariables  eVariables = new ExampleOnVariables();
		System.out.println("Employee Id :"+eVariables.empId);
		System.out.println("Employee Name :"+eVariables.empName);
		System.out.println("Employee Salary: "+eVariables.empSal);
		
		System.out.println("companyName is : "+ExampleOnVariables.compyName);
		
		//calling a method
		eVariables.methodOne();
		
	   ExampleOnVariables.methodTwo();
	}
	 
	 

}
