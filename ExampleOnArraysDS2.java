package com.training.ds.arrays;

public class ExampleOnArraysDS2 {
	public  static int methodBinarySearch(int a[],int target) {
	
		int left=0;
		int right=a.length;
		int mid=0;
	    int step=0;
	   while(mid>=0) {
		   step++;
		   mid=(left+right)/2;
		   if(a[mid]==target) {
			   System.out.println("no of steps : "+step);
			   return mid;
		   }else if(a[mid]<target) {
				  left=mid+1;  //continuous searching at the right side
			  }else {
				  right=mid-1; ////continuous searching at the left side
			  }
	   }
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[] = {5,6,8,9,17};
		int target =9;  ///time-complexity -> O(1)<=O(logn)<=O(n);
		int res =methodBinarySearch(arr, target);
		
		if(res>=0) {
			System.out.println("Element search is found at index position: "+res);
		}else {
			System.out.println("Element search is Notfound "+res);
		}
		
	}

}
