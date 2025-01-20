package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOnListWithStream {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		al.add(43);
		al.add(50);
		al.add(10);
		al.add(15);
		al.add(60);
		al.add(10);
		
	   System.out.println("No of elemebts are : "+al.size());
	   System.out.println("using if condition...");
		for(int iobj :al) {
			if(iobj%2==0) {
				System.out.println("even number: "+iobj);
			}
		}
		System.out.println("Using streams filter");
		//convert the Collection object into stream by using stream()
		Stream<Integer> st=al.stream();
		
		//st.filter(e -> e%2==0).forEach(System.out::println);
	  Stream<Integer> ftSt=	st.filter(e -> e%2==0);
		ftSt.forEach(System.out::println);
		
		System.out.println("Map intermediate operations");
		Stream<Integer> st1=al.stream();
		//map --> intermediate operation
		Stream<Integer> mapSt=st1.map(e -> e+2);
		//forEach (terminal operation)
		mapSt.forEach(System.out::println);//with method reference
		//mapSt.forEach(e -> System.out.println(e)); //without method reference
		
		//Stream<T> sorted()  ===> Intermediate operation the elements
		Stream<Integer>  st3 = al.stream();
		Stream<Integer> st4 =st3.sorted();
		System.out.println("After sorting");
		st4.forEach(System.out::println);
		
		Comparator<Integer> cmpt = (i1,i2)->i1>i2?-1:i1<i2?1:0;
		Stream<Integer>  st5= al.stream();
		System.out.println("After descending sorting");
		 st5.sorted(cmpt).forEach(System.out::println);//terminate operation
	}

}
