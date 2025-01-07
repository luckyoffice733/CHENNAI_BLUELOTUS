package com.training.ds.sorting;

public class ExampleOnArrayBubbleSort {
	public static void main(String[] args) {

		int a[] = {6,5,2,8,9,4};
		int temp=0;
		
		System.out.println("before sort");
		for(int n:a) {
			System.out.print(n+" ");
		}
		
		System.out.println("");
		for(int i=0;i<a.length-1;i++) {  //time-complexity --> O(n2)
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;		
				}
			}
			System.out.println("");//each iteration which element is swapped we can check
			for(int n:a) {
				System.out.print(n+" ");
			}
		}
		
		System.out.println(" ");
		System.out.println("after sort");
		for(int n:a) {
			System.out.print(n+" ");
		}
		
		
	}
}
