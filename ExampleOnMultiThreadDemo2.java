package com.training.threads;

public class ExampleOnMultiThreadDemo2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread");
		}
		
	}

}
