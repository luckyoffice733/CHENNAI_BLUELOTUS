package com.training.cg.multithreading;

public class DepositThread extends Thread{
	
	
	Bank b;
	int amount;
	
    public DepositThread (Bank b,int amount){
		this.b = b;
		this.amount=amount;
	}

	@Override
	public void run(){
		
		b.deposit(amount);
	}


}
