package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleOnProductStream7 {
	public static void main(String[] args) {

		List<Product> al = new ArrayList<>();
		//creating Product objects
		Product p1 = new Product(12,"mouse",500);
		Product p2 = new Product(2121,"keyboard",8000);
		Product p3 = new Product(3212,"laptop",50000);
		Product p4 = new Product(3111,"mobile",10000);

		al.add(p4);
		al.add(p2);
		al.add(p1);
		al.add(p3);

		System.out.println(al);
		//UseCase1 : convert arraylist to stream and display the product details
		System.out.println("Product Details are :");
		Stream<Product> st=   al.stream();
		st.forEach( e -> System.out.println(e.getProductId()+" "+e.getProductName()+" "+e.getPrice()));

		System.out.println("");
		//UseCase : from the stream  get the ProductNames and convert into new List<String> 
		//using Collectors -- terminal operation
		Stream<Product> st1=   al.stream();
		List<String> listProdNames=st1.map(e -> e.getProductName()).collect(Collectors.toList());
		System.out.println("Enchanced for loop");
		for(String pn : listProdNames) {
			System.out.println(pn);
		}

		//UseCase : from the stream  get the ProductNames and convert into new Set<String> 
		//using Collectors -- terminal operation
		Stream<Product> st2=   al.stream();
		Set<String> setProdNames=st2.map(e -> e.getProductName()).collect(Collectors.toSet());
		System.out.println("Enchanced for loop from Set");
		for(String pn : setProdNames) {
			System.out.println(pn);
		}

		//UseCase : from the stream  get the ProdutId,ProductNames and 
		//convert into new Map<Integer,String>  --here productId as Key and productName as value
		//using Collectors -- terminal operation 
		System.out.println("Enchaced forloop from Map");
		Stream<Product> st3=   al.stream();                 // K                //v
		Map<Integer,String>	mobj= st3.collect(Collectors.toMap(e->e.getProductId(), e->e.getProductName()));

		Set<Entry<Integer,String>> et= mobj.entrySet();

		for(Entry<Integer,String> entry:et) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		//UseCase : find the maximum product price record //50000 ->Laptop ->3212
		System.out.println("Max price product record :"); 
		Stream<Product> st4 = al.stream();
		Comparator<Product> cpt =(o1,o2)->o1.getPrice()>o2.getPrice()?1:o1.getPrice()<o2.getPrice()?-1:0;

		Product p= st4.max(cpt).get();
		System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getPrice());


		//UseCase : find the maximum product price record //50000 ->Laptop ->3212
		System.out.println("Max price product record Using Comparing method reference:"); 
		Stream<Product> st5 = al.stream();
		Optional<Product> pt= st5.max(Comparator.comparing(Product::getPrice));
		Product pobj=    pt.get();
		//or
		//Product pobj= st5.max(Comparator.comparing(Product::getPrice)).get();
		System.out.println(pobj.getProductId()+" "+pobj.getProductName()+" "+pobj.getPrice());




	}
}
