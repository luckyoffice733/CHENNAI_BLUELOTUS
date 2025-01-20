package com.cg.training.exonstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOnStream4 {
  public static void main(String[] args) {
	
  List<Integer> al = Arrays.asList(10,30,40,50,60);
  
  // 10 ->10*2 = 20
  //apply the function logic for each element in list multiply with 2.
  
  Stream<Integer> st = al.stream();
  st.map(e -> e*2).forEach(System.out::println);
  
	  

}
}
