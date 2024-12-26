package com.training;

public class ExampleOnMethodOverloading {
	
	public int addition(int x,int y) {
		System.out.println("addition two parameters of int type");
		return x+y;
	}
	
	public int addition(int x, int y,int z) {
		System.out.println("addition three parameters of int type");
		return x+y+z;
	}
	
	public double addition(int x,float y) {
		System.out.println("addition two parameters of int and float type");
		return x+y;
	}
	
	public double addition(float x,int y) {
		System.out.println("addition two parameters of float and int type");
		return x+y;
	}

	
	public static void main(String[] args) {
		ExampleOnMethodOverloading eomovld= new ExampleOnMethodOverloading();
		
		System.out.println(eomovld.addition(10,10));//addition(int,int) 
		double res =eomovld.addition(10f,40);//addition(float,int)//
		System.out.println(res);
		
		int sum=eomovld.addition(30,40,50);
		System.out.println(sum);
	}
	
	
}
