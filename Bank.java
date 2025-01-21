package com.training.cg.multithreading;

public class Bank{
	int balance=25000;
	
	public synchronized void withDrawal(int wtamt) {
		if(this.balance < wtamt) {
			System.out.println("Going to wait for withdrawal........");
			try {
				wait();//it will wait for until amount is deposit
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		this.balance=this.balance-wtamt;
		System.out.println("after withdrawal remaining balance : "+this.balance);
	}
	
	public synchronized void deposit(int dpst) {
		System.out.println("Amount Deposited you can Withdraw");
		this.balance= this.balance+dpst;
		System.out.println("Affter Deposit current Balance : "+this.balance);
		notify();
	}
	
	
}





