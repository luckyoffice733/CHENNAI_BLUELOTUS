package com.training.abstraction;

public interface Shape {

	public static final String msg="shape";
	//implicitly compiler will add static and final
	double cost=4000;
	
	public abstract void draw();//method delcaration
	//implicitly compiler will add public abstract
    double getArea();//abstract method
	
	
}
