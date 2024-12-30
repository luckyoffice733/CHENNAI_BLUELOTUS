package com.training.usecases;

public class ExampleOnArray3 {
	
	public void addFruits(String ft[]) {
		
		System.out.println("Fruits are :");
		for(String s:ft) {
			System.out.println(s);
		}
	}
	
	public static int[] getPersonAge() {
	   int[] age= {50,26,18,16};
	   return age;
	}
	
	
	
	public static void main(String[] args) {
        ExampleOnArray3 eoa3 = new ExampleOnArray3();
        
       String st[] = {"orange","mango","apple","banana"};
       
        eoa3.addFruits(st);
		
	 int ag[]=	ExampleOnArray3.getPersonAge();
	 
	   for(int a :ag) {
		System.out.println(a);
	   }
	}
	

}
