package com.training.abstraction;

public abstract class Test implements MyApp {

	@Override
	public int getSum(int x, int y) {
		return x+y;
	}

	@Override
	public String sayHello() {
		return "Working with interface";
	}
   
	//public abstract void methodOne();

}
