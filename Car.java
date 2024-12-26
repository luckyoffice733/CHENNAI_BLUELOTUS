package com.training;

public class Car {

	String brandName;
	double cost;
	
	//default constructor
	public Car() {
		System.out.println("we are in default constructor");
		System.out.println("Car details");
		System.out.println(brandName+" "+cost);
	}
	//parameterized constructor
	public Car(String brandName,double cost) {
		System.out.println("we are in parameterized constructor");
		System.out.println("car information is : ");
		this.brandName=brandName;  //initializing in the instance varibales
		this.cost=cost;
		System.out.println(this.brandName+" "+this.cost);
	}
	
	public static void main(String[] args) {
		
		Car  car = new Car(); //creating object for a class using default constructor.
		
		Car car1 = new Car("maruthi",500000);//creating a object for a class using parameterized construcgtor
	
	}
	
	
	
}
