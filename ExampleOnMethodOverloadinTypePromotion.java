package com.training;

public class ExampleOnMethodOverloadinTypePromotion {
	
	public void addition(int x,int y) {
		System.out.println("sum of two numbers is : "+(x+y));
	}
	
	public double addition(double x,double y) {
		System.out.println("we are in double data type parameter method");
		return x+y;
	}
	
	public static void main(String[] args) {
		
		ExampleOnMethodOverloadinTypePromotion eomovrdtp= new ExampleOnMethodOverloadinTypePromotion();
		
		eomovrdtp.addition(10,10);//addition(int,int)
		
		eomovrdtp.addition('A','a');//addition(char,char)--->addition(int,int)
		//addition(long,long)-->addition(float,float)--->addition(double,double)
		System.out.println(eomovrdtp.addition(10L,30l)); 
		
		
		
		
	}
	

}
