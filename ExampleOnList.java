package com.training.listinterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOnList {

	public static void main(String[] args) {
		
		//creating object for the ArrayList  class
		
		ArrayList<Object> al = new ArrayList<>();
		
		//adding elements into arraylist using add()
		al.add("10");
		al.add(true);
		al.add(60);
		al.add(null);
		al.add(20l);
		al.add(30.0f);
		al.add(40.0);
		al.add('c');
		al.add(60);
		
		//display no of elements in the ArrayList using size
		System.out.println("no of elements : "+al.size());
		
		al.add("laxmi");
		al.add('a');  //
		
		System.out.println("no of elements : "+al.size());
		
		System.out.println("insertion is preserved :");
		System.out.println(al);
		
		//1st way
		System.out.println("display the elements element by element,enhanced for loop");
		for(Object o:al) {
			System.out.println(o);
		}
	
		//Using iterator object
		//convert collectionObject into iterator Object
		//check the condition whether elements exists or not in iterator Object
		//if exists then print the elements
		System.out.println("Displaying the elements using iterator Object");
		Iterator<Object>  iobj=al.iterator();
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
		
		//using java8 forEach loop with lamda expression
		System.out.println("Using java8 Stream displaying the elements element by elements");
		al.forEach(e -> System.out.println(e));
		
		
		
	}
	
	
}
