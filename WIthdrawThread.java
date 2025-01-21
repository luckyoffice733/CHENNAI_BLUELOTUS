package com.training.cg.multithreading;

public class WIthdrawThread extends Thread{
	
	Bank b;
	int amount;
	
	WIthdrawThread(Bank b,int amount){
		this.b = b;
		this.amount=amount;
	}

	@Override
	public void run() {
		
		b.withDrawal(amount);
	}

	
	
	

}
