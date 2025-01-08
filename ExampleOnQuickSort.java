package com.training.ds.sorting;

public class ExampleOnQuickSort {

	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pivot = partition(arr, low, high);

			quickSort(arr, low, pivot - 1); // recurison
			quickSort(arr, pivot + 1, high); // recurison
		}

	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = high;
		int i = low-1;

		for (int j = low; j < high; j++) {
			if (arr[j] < arr[pivot]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	
	public static void main(String[] args) {
		
		int arr[]={8,2,5,3,4,7,6};

		quickSort(arr,0,arr.length-1);
 
		 System.out.println("After quickSort");
		 for(int n:arr) {
            System.out.print(n+" ");
		 }
	}
	
}
