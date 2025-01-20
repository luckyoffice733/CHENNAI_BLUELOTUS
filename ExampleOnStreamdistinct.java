package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOnStreamdistinct {
	public static void main(String[] args) {
		List<Integer>  al = new ArrayList<>();
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(5);
		al.add(40);	
		System.out.println("No of elements : "+al.size());
	//distinct() -> will remove the duplicates
		System.out.println("After remove  duplicates :");
		Stream<Integer> st = al.stream();
		st.distinct().forEach(System.out::println);
		
		System.out.println("First four elements :");
		//limit(int)  -> it will display no of elements
		al.stream().limit(4).forEach(System.out::println);
		
		System.out.println("skip four elements :");
		//skip(int)  -> it will skip no of elements
		al.stream().skip(4).forEach(System.out::println);
		
		
	}
}
