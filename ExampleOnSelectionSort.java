package com.training.ds.sorting;

public class ExampleOnSelectionSort {
	public static void main(String[] args) {
        int arr[]= {6,5,2,8,9,4};
        
        System.out.println("after sort");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		System.out.println(" ");
		
		for(int i=0;i<arr.length-1;i++) {
			int minVal=i;
			for(int j=i+1;j<arr.length;j++) {
				// To sort in descending order, change > to < in this line.
		        // Select the minimum element in each loop.
				if(arr[j]<arr[minVal]) {
					minVal=j;
				}
			}
			
			int temp=arr[i];
		    arr[i]=arr[minVal];
		    arr[minVal]=temp;
		    
		    System.out.println("");
		    System.out.println("Each Iteration Sort");
			for(int n:arr) {
				System.out.print(n+" ");
			}    
		}
		
		System.out.println();
		System.out.println("after sort");
		for(int n:arr) {
			System.out.print(n+" ");
		}
		
	}
}
