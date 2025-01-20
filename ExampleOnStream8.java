package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ExampleOnStream8 {
	public static void main(String[] args) {
    
	  List<String> al= new ArrayList();
	  
	  al.add("smith");
	  al.add("rakesh");
	  al.add("allen");
	  al.add("banu");
	  al.add("jack");
	  
	  System.out.println("No of elements : "+al.size());
	  System.out.println(al); //smith rakesh allen banu jack
	  
	  Stream<String> s1 = al.stream();
	  Optional<String> firstEle = s1.findFirst();
	  System.out.println(firstEle.get());
	  
	  Stream<String> s2 = al.stream();
	  Optional<String> anyEle =s2.findAny();
	  System.out.println(anyEle.get());
	  
	}
}
