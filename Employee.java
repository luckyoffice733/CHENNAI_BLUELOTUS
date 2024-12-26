package com.training;

public class Employee {
	 
	long empId;    //instance variables
	String empName;
	double empSal;
	
	public Employee() {
		this(1002,"martin",5000); //Employee(long,String,double)
		System.out.println("we are in default Constructor");
	}
	public Employee(long empId,String empName,double empSal) {
		         //local chaining constructor
		//this();// ->Employee()  //calling a default constructor and this() should first line of statement
		this.empId=empId; //initializing the values into instance variables
		this.empName=empName;
		this.empSal=empSal;
		
		//this(); not valid
	}
	public void display() {
		System.out.println("Employee Details are :");
		System.out.println(this.empId+" "+this.empName+" "+this.empSal);
	}
	
	public static void main(String[] args) {
		//Employee employee = new Employee();//compile will not provide default constructor
		Employee employee = new Employee(1001,"smith",50000);
		
		employee.display();
		
		Employee employee2 = new Employee();
		employee2.display();
	}
	
	

}
