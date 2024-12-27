package com.training;

class Plane{
	
   String planeId="6E917";
   String  msg="hi";
   
	public void fly() {
		System.out.println("Plane is flying in the sky");
	}
}

class Cargo extends Plane{
	
	String planeId="6CE3019";
	
	public Cargo() {
		msg="hello";
	}
	
	public void shippingItems() {
		System.out.println("Cargo plane shipped the items");
	}
	
	@Override
	public void fly() {
		System.out.println("cargo plane carrying items and flying in the sky");
	}
}
public class ExampleOnMethodOverriding2 {

	public static void main(String[] args) {
		Cargo cobj = new Cargo();
		cobj.fly();//
		cobj.shippingItems();
		System.out.println("Plane Id is : "+cobj.planeId);//6CE3019
		System.out.println("msg is : "+cobj.msg);
	System.out.println("----------------------");
	System.out.println("-------------------");
	//A Super Class Reference Variable holding its child/sub class object 
		//is called polymorphism.
		
		Plane  planeObj = new Cargo();
		planeObj.fly();
		//planeObj.shippingItems();
		System.out.println("----variable out is ----");
		System.out.println("plane Id is : "+planeObj.planeId);//6E917
	    System.out.println("Variable value is : "+ planeObj.msg);//
		
		
	}
	
	
}
