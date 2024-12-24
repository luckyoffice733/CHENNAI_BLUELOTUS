package com.training;

public class ExampleOnMethod {

	//accessmodifier returnType methodName(parameters if any..)
	
	public void methodOne() {
		System.out.println("we are in method one of zero arguments ");
	}
	//method with two arguments
	public int  getSum(int x,int y) {
		int z=x+y;	
		return z;
	}
	
	public static String sayHello() {//called
		String msg="welcome to methods";
		return msg;
	}
	
	public static void main(String[] args) {
		String m=ExampleOnMethod.sayHello();//calling
		System.out.println(m);
		
		
		ExampleOnMethod eom = new ExampleOnMethod();
		int res=eom.getSum(30, 40);
		System.out.println("Sum of two numbers is : "+res);
		
		
	}
	
	
	
	
	
}
