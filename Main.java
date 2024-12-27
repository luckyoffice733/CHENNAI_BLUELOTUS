package com.training.abstraction;

public class Main extends Test{

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("we are in methodOne");
	}

	public static void main(String[] args) {
		//FirstWay
		 Main mobj = new Main();
		 
		 mobj.methodOne();
		int sum= mobj.getSum(10,30);
		System.out.println("sum of two numbers is : "+sum);
   
		System.out.println(mobj.sayHello());
		
		
		//2ndWay 
		MyApp mapp = new Main();
		mapp.methodOne();
		int res =mapp.getSum(40,50);
		System.out.println("sum of two numbers is : "+res);
		System.out.println(mapp.sayHello());
		
	}
}
