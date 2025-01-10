package com.training.ds.arrays;

import java.util.Arrays;

public class ExampleOnArrayExercise {
	
	public static int[] rearrange(int new_arr[],int n) {
		
		
		int temp[]=new int[n];
		int small=0,large=n-1;
		boolean flag=true;
		
		for(int i=0;i<n;i++) {
			
			if(flag) {
				temp[i]=new_arr[large--];
			}else 
			{
				temp[i]=new_arr[small++];
			}
			flag=!flag;
			
		}
		
		return temp;
	}

	public static void main(String[] args) {
		int nums[]= {10,20,30,40,50,60,70,80,90,100};
		int res[];
		res=rearrange(nums,nums.length);
		System.out.println(Arrays.toString(res));
		
		
	}
	
	
}
