package com.cg.training.exonstreams;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class ExampleOnStream11 {
	public static void main(String[] args) {
    
	  Map<Integer,String> hm = new  HashMap<>();
	  hm.put(20,"raju");
	  hm.put(34,"smith");
	  hm.put(21,"martin");
	  hm.put(35, "allen");
	  hm.put(24,"scott");
	  
	  System.out.println("No of elements : "+hm.size());
	 
	  Set<Entry<Integer,String>> st=hm.entrySet();
	  for(Entry<Integer,String> et:st) {
		 System.out.println(et.getKey()+" "+et.getValue()); 
	  }
	  System.out.println("Displaying the elements from HashMap");
	   //convert Set<Entry> into Stream object
	   Stream<Entry<Integer,String>> sm = st.stream();
	  sm.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	  
	  System.out.println("filtering the elements using filter stream");
	  //convert Set<Entry> into Stream object
	   Stream<Entry<Integer,String>> sm1 = st.stream();
	  sm1.filter(e -> e.getKey().equals(20)).forEach(System.out::println);
	   
	 	  
	}
}
