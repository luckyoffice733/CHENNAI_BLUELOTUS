package com.training.usecases;

public class ExampleOnArray1 {
	
	
	public static void main(String[] args) {
		
		//Declaring and initializing an array.
		
		int ar[]= {90,10,50,30,10};
		
		System.out.println("No of elements in an ar1: "+ar.length);
		
		// //   int   []arr2; //not valid declaration
		
	    int arr[];
	    
	    //declaring an array with size
	    //syntax:
	    // dataType arrayName = new dataType[size];
	    
	    int[] arr2=new int[5];  //declaring an array with size 5 elements
	    
	    //initilaize
	  
	   arr2[0]=40;
	   arr2[1]=50;
	   arr2[2]=90;
	   arr2[3]=50;
	   arr2[4]=70;
	  // arr2[5]=10;
	   
	   System.out.println("elements from array");
	   for(int i=0;i<arr2.length;i++) {
		   System.out.println("elements from array: "+arr2[i]);
	   }
	
	   System.out.println("Elements from array using enchanced for loop");
	   for(int a:arr2) {
		   System.out.println(a);
	   }
		
	}

}
