package com.training.abstraction;

public class Circle implements Shape {
    double radius=9;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a circle");
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	public static void main(String[] args) {
		//First way 
		Circle cobj = new Circle();
		cobj.draw();
		double res= cobj.getArea();
		System.out.println("area of circle is : "+res);
		
		//2nd way of createing the object
		//Interface referenceVariable  holding its implementation class Object
		//is called polymorphism.
		
		Shape sobj = new Circle();
		sobj.draw();
		System.out.println(sobj.getArea());
		
	}
	
}
