package com.training.ds.sorting;

public class ExampleOnInsertionSort {
	public static void main(String[] args) {

		int arr[] = {5,4,6,8,2,10};
		int size = arr.length;
        System.out.println("Before sorting");
        for(int n: arr) {
			System.out.print(n+" ");
		}
		System.out.println("");
		
		for (int i = 1; i < size; i++) {
			int key = arr[i];
			int j = i - 1;
			// Compare key with each element on the left of it until an element smaller than
			// it is found.
			// // For descending order, change key<array[j] to key>array[j].
			while (j >= 0 &&  key > arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			// Place key at after the element just smaller than it.
			arr[j + 1] = key;
			
			
			System.out.println("Each Iteration");
			for(int n: arr) {
				System.out.print(n+" ");
			}
			System.out.println("");
			
			
		}
		
		System.out.println("After Sorting");
		for(int n: arr) {
			System.out.print(n+" ");
		}
	}
}
