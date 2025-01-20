package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOnStream2 {
	public static void main(String[] args) {
		List<Integer>  al = new ArrayList<>();
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(5);
		
		System.out.println("No of elements : "+al.size());
		System.out.println("WithOut streams");
	   //without stream we are finding even numbers in the list
	   for(int i:al) {
			if(i%2==0) {
				System.out.println("even number is : "+i);
			}
		}
		
		System.out.println("With streams");
		//converting list into stream
	  Stream<Integer> st=	al.stream();
		
	 Stream<Integer> filterOut= st.filter(s ->s%2==0); //filter intermediate operation
		//filterOut.forEach(s -> System.out.println(s));//terminal operation
		filterOut.forEach(System.out::println);  //terminal operation
		
		
		
	}

}
