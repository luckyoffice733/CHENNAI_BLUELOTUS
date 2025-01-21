package com.training.threads;
//extending Thread class
public class ExampleOnMultiThreadDemo extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello");
		}
	}
	

}
