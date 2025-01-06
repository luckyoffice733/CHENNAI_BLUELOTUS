package com.training.ds.arrays;

public class ExampleOnArraysDS {
	public  static int methodLinearSearch(int a[],int target) {
	int step=0;	
	for(int i=0;i<a.length;i++) {
		step++;
		if(a[i]==target) {  ///time-complexity -> O(1)-constant
			                 ///              -> O(n) - linearArithmac
			System.out.println("no of steps to search an element: "+step);
			return i;
		}	
	}
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[] = {5,3,8,9,2};
		int target =5;
		int res =methodLinearSearch(arr, target);
		
		if(res>=0) {
			System.out.println("Search Element is found at index position : "+res);
		}else {
			System.out.println("Search Element is Not found at index position : "+res);
		}
		
	}

}
