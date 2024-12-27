package com.training;

class Parent{
	
	void show(String msg) {
		System.out.println("FROM PARENT CLASS BY : "+msg);
	}
	
	public void methodTwo() {
		System.out.println("we are in the methodTwo of Parent class");
	}
	
}
class Child extends Parent{
	
	public void methodOne() {
		System.out.println("we are in the methodOne of child class");
	}
	
    @Override
	void show(String msg) {
		System.out.println("FROM Child CLASS BY : "+msg);
	}	
}
public class MethodOverridingExample1 {
     public static void main(String[] args) {
		Child chobj = new Child();
		chobj.show("welcome to methodOverriding..."); //show(String)
		
		chobj.methodTwo(); //methodTwo()
		chobj.methodOne();// methodOne()
	}
}
