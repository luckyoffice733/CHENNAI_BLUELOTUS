package com.training.ds.arrays;

public class ExampleOnArrayBubbleSort {
	public static void main(String[] args) {

		int a[] = {6,5,2,8,3,7};
		int temp=0;
		
		System.out.println("before sort");
		for(int n:a) {
			System.out.print(n+" ");
		}
		
		System.out.println("");
		for(int i=0;i<a.length;i++) {  //time-complexity --> O(n2)
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;		
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
