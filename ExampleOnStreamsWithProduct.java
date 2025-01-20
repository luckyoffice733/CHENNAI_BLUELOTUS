package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOnStreamsWithProduct {
  public static void main(String[] args) {
		List<Product> al = new ArrayList<>();
		//creating Product objects
		Product p1 = new Product(12,"mouse",500);
		Product p2 = new Product(2121,"keyboard",8000);
		Product p3 = new Product(3212,"laptop",50000);
		Product p4 = new Product(3111,"mobile",10000);
		
		al.add(p4);
		al.add(p2);
		al.add(p3);
		al.add(p1);
	  
		System.out.println("No of elements in : "+al.size());
		//from the list display all the productNames using streams-> map()
		System.out.println("Product Names are :");
		//Stream<String> ptName=al.stream().map(p -> p.getProductName());
		
		Stream<String> ptName=al.stream().map(Product::getProductName);
		ptName.forEach(System.out::println);
		
		
		
}
}
