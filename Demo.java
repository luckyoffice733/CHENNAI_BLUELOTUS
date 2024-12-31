package com.training.text;

public class Demo {
	public static void main(String[] args) {
		
		String s = new String("hello");
		String s1 ="hello";  //String literal
		
		String s2= new String("hello");
		String s3 = "hello";//String literal
		
		System.out.println(s==s1);//false
		
		System.out.println("hashcode for s1 is : "+s.hashCode());
		System.out.println("hashcode for s1 is : "+s1.hashCode());
		System.out.println("hashcode for s3 is : '"+s3.hashCode());
		System.out.println(s1==s3);//true //it will compare the references
		
		System.out.println(s.equals(s1));//it will compare the content
		
		System.out.println("before update s2 object : "+s2+" HashCode:  "+s2.hashCode());
		//it will not update or modified in the existing memory location ,it will create
		//or allocate the new memory on heap and reference variable will point to it.
		s2=s1.concat(" world");
		System.out.println("After modified object : "+s2 +" HashCode:  "+s2.hashCode());
		
		
		
	}
	
}
