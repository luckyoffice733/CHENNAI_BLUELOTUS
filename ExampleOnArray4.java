package com.training.usecases;

public class ExampleOnArray4 {
	public static void main(String[] args) {
		
		//Declaring and initializing an array.
		int ar[][]= {{2,12,1},{10,59,30}};
		
		System.out.println("No of elements in an row: "+ar[0].length);
		System.out.println("No of elements in an colum: "+ar[1].length);
	   int   [][]arr3; // valid declaration
	    int arr[][];
	   
	    //declaring an array with size
	    //syntax:
	    // dataType arrayName = new dataType[size];    
	    int[][] arr2=new int[2][2];  //declaring an array with size 5 elements
	   //initilaize
	   arr2[0][0]=40;
	   arr2[0][1]=50;
	   arr2[1][0]=90;
	   arr2[1][1]=50;
	 
	  // arr2[5]=10;
	   
	   System.out.println("elements from array");
	   for(int i=0;i<arr2[0].length;i++) {
		   for(int j=0;j<arr2[1].length;j++) {
		   System.out.print(arr2[i][j]+" ");
	   }
		   System.out.println(" ");
	   }
	   
		
	}

}
