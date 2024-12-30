package com.training.usecases;

public class ExampleOnArray8 {

	public static void main(String[] args) {
		//Object type array can store heterogeneous type of data.
		
		Object obj[]= {10,10.0f,10.0,40l,true,"hello",'a',new Product(101,"mobile",10000)}; 
		
		for(Object o:obj) {
			System.out.println(o);
		}
		
		
		
		
	}
	
}
