package com.cg.training.exonstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOnStream3 {
  public static void main(String[] args) {
	
  List<String> al = Arrays.asList("mango","apple","kiwi","papaya","banana");
	  
   //print the elements whose length greater 5
  
  Stream<String> st = al.stream(); 
	  st.filter(e -> e.length() > 5).forEach(e -> System.out.println(e));//papaya,banana
  System.out.println("length of the each element by using map() ");	  
  //map() -> it apply the function on x element and it generate new y element
  //for each element
  Stream<String> st1 = al.stream();
  Stream<Object> mapOutput =st1.map(s -> s.length()); //intermediate operation
      mapOutput.forEach(System.out::println);
      
      
}
}
