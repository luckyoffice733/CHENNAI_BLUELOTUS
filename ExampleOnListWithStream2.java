package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleOnListWithStream2 {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
	    //List<Integer> al2 = new ArrayList<>(); 
		al.add("chennai");
		al.add("mumbai");
		al.add("bangalore");
		al.add("hyderabad");
		al.add("pune");
		al.add("kolkata");
		
		System.out.println("No of elements : "+al.size());
		System.out.println("with out streams");
		for(String s: al) {
			//System.out.println(s.length());
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}

		//find the elements based on the length if its length is even number
		//convert the collection object into stream
		System.out.println("Even length elements from the list using filter");
		Stream<String> st=al.stream();
		st.filter(e -> e.length()%2==0).forEach(System.out::println);
		
		//find the length of each element in the list then store this length of element
		//in another list.
		/*
		 * System.out.println("with out streams"); for(String s: al) {
		 * al2.add(s.length()); }
		 */
		
		System.out.println("With Streams to list");
	   List<Integer> lenList =al.stream().map(e -> e.length()).toList();
		lenList.forEach(System.out::println);
		
		System.out.println("With Streams without duplicates -- toSet");
		Set<Integer> lenSet= al.stream().map(e->e.length()).collect(Collectors.toSet()); 
		lenSet.forEach(System.out::println);
		
		System.out.println("With Streams key,value -- toMap");
	   Map<String,Integer> hm=	al.stream().collect(Collectors.toMap((t->t),(t1->t1.length())));
		Set<Entry<String,Integer>> s1=hm.entrySet();
		System.out.println("element and its length");
		for(Entry<String,Integer> et :s1) {
			System.out.println(et.getKey()+" "+et.getValue());
		}
		
		
	}

}
