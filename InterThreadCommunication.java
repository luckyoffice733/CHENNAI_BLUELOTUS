package com.training.cg.multithreading;

public class InterThreadCommunication {
	
	public static void main(String[] args) {
		
	  Bank b = new Bank();
	  
	  WIthdrawThread wt = new WIthdrawThread(b,30000);
	  wt.start(); 
	  
	  DepositThread dpst = new DepositThread(b,10000);
	  dpst.start();
		
		
		
	}

}
