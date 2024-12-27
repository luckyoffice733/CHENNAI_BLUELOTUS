package com.training;

class ParentSuper{
	 
  int id;	
  String name;	
	public ParentSuper() {
		System.out.println("we are in default Constructor of Parent class");
	}
	public ParentSuper(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void methodTwo() {
		System.out.println("we are in the methodTwo of Parent class");
		System.out.println("variable names are : "+this.id+" "+this.name);
	}
	public Object sayHello() {
		return "welcome to java";
	}
}
class ChildSub extends ParentSuper{
	
	public ChildSub() {
		//super(); //calling a super class default constructor
		super(1011,"ramesh");//ParentSuper(int,String)//
		System.out.println("we are default constructor of Child class");
	}
	
	public void methodOne() {
		System.out.println("we are in the methodOne of child class");
		super.methodTwo();//calling methodTwo from parent class
	}
	@Override
	public void methodTwo() {
		System.out.println("we are in the methodTwo of child class");
	}
   
}
public class ExampleOnSuper {
     public static void main(String[] args) {
		ChildSub  chsobj = new ChildSub();
		
		chsobj.methodOne();
		chsobj.methodTwo();
		
	}
}
