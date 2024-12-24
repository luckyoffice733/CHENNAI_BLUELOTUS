package com.training;

public class ExampleOnInstance {

   int studentId=1001; //instance variable
   
   {//instance block
	System.out.println("we are in instance block ");   
   }
   
   
   public void methodOne() {//instance method
	   System.out.println("we are in instance method");
   }
   
   public static void main(String[] args) {
	
	    ExampleOnInstance eoi = new ExampleOnInstance();
}
   
   
	
}
