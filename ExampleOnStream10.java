package com.cg.training.exonstreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleOnStream10 {
	public static void main(String[] args) {
    
	  Stream<String> s = Stream.of("smith","clerk","allen","martin");
	    //there is no difference between list -(contains) and Stream (anyMatch)
	    boolean  b= s.anyMatch( e -> e.equals("smith"));
	    System.out.println("element is found : ? "+b);
	  
	    Stream<String> s2 = Stream.of("smith","smith");
	   boolean b2 = s2.allMatch(e -> e.equals("smith"));
	   System.out.println("element is found : ? "+b2); 
	   
	   Product p1= new Product(1021,"mouse",400);
	   Product p2 = new Product(1212,"laptop",50000);
	   
	   Stream<Product> s3 = Stream.of(p1,p2,new Product(2121,"mobile",10000));
	   //UseCase find the max product price from Stream s3 using summarizingDouble
	  double maxPrice= s3.collect(Collectors.summarizingDouble(Product::getPrice)).getMax();
	   System.out.println("Max price in :"+maxPrice);
	   
	   Stream<Product> s4 = Stream.of(p1,p2,new Product(2121,"mobile",10000));
	   //UseCase find the sum of all product price from Stream s4 using summingDouble .map
	  double sumPrice= s4.collect(Collectors.summingDouble(Product::getPrice));
	   System.out.println("sum of all pricees in :"+sumPrice);
	   
	   
	   
	   
	}
}
