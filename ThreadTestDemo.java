package com.training.threads;

public class ThreadTestDemo {

public static void main(String[] args) {
		
		
		
		ExampleOnMultiThreadDemo t1 = new ExampleOnMultiThreadDemo();
		t1.start();
		
		for(int i=1;i<=10;i++) {
			System.out.println("Hi");
		}
		
		
		ExampleOnMultiThreadDemo t2 = new ExampleOnMultiThreadDemo();
		t2.start();
		//t2.start();
		
		
	}
	
}
