package com.training.text;

public class ExampleOnBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");
		StringBuffer sb1 = new StringBuffer("hello");
		
		System.out.println(sb==sb1);//false
		
		System.out.println(sb.equals(sb1));//false
		
		System.out.println(sb.compareTo(sb1));
		
		String s = new String(sb);
		String s1 = new String(sb1);
		System.out.println(s.equals(s1));//true
		
	}   

}
