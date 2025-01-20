package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOnStream1 {
	
	public static void main(String[] args) {
	List<String> al = new ArrayList<>();
	al.add("smith");
	al.add("martin");
	al.add("allen");
	al.add("ford");
	al.add("allen");
    al.add("scott");
    
    System.out.println("No of elements is : "+al.size());
		
    Stream<String> st=al.stream(); //converting collection object into stream
    System.out.println("Displaying the elements using java8 forEach "); 
    st.forEach(a -> {System.out.println(a);});//terminal operation
    
    System.out.println("Displaying the elements using forEach method reference");
    Stream<String> st1=al.stream();////converting collection object into stream
    
    st1.forEach(System.out::println);//terminal operation	
    
   
	
	}

}
