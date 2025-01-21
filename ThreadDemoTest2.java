package com.training.threads;

public class ThreadDemoTest2 {
	
	public static void main(String[] args) {
		
		ExampleOnMultiThreadDemo2 eomt2 =new ExampleOnMultiThreadDemo2();

		Thread t1 = new Thread(eomt2);
		t1.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Parent Thread");
		}	
		
		
		
	}

}
