package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOnStream6 {
	public static void main(String[] args) {
    
	  List<String> al= new ArrayList();
	  
	  al.add("smith");
	  al.add("rakesh");
	  al.add("allen");
	  al.add("banu");
	  al.add("jack");
	  
	  System.out.println("No of elements : "+al.size());
	  System.out.println(al);  
	  
	  //sorting in ascending order(alphebeting order) or lexographically using stream
      // allen,banu,jack,rakesh,smith
	  System.out.println("ascending order /Alphabet order");
	  Stream<String> st = al.stream();
	  st.sorted().forEach(e-> System.out.println(e));
	  
	  System.out.println("desceding order /reverse of Alphabet order");
	  Stream<String> st2 = al.stream();
	  Comparator<String> cpt2 =(a,b)->b.compareTo(a);
	  st2.sorted(cpt2).forEach(e-> System.out.println(e));
	  
	  //UseCase: using stream
	  //filter() the stream if length > 4 :-> smith,rakesh,allen  and 
	  //sorted() in ascending and display allen,rakesh,smith
	  System.out.println("ascending order /Alphabet order using filter");
	  Stream<String> st3 = al.stream();
	  st3.filter(e -> e.length() > 4).sorted().forEach(System.out::println);
	  
	  
	  
	  
	  
	  
	  
	  
	  
 
	}
}
