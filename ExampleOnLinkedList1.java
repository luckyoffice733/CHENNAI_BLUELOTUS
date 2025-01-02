package com.training.listinterface;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleOnLinkedList1 {

	public static void main(String[] args) {
		
		//creating object for the LinkedList  class
		
		LinkedList<Object> ll = new LinkedList<>();
		
		//adding elements into arraylist using add()
		ll.add("10");
		ll.add(true);
		ll.add(60);
		ll.add(null);
		ll.add(20l);
		ll.add(30.0f);
		ll.add(40.0);
		ll.add('c');
		ll.add(60);
		
		
		//display no of elements in the ArrayList using size
		System.out.println("no of elements : "+ll.size());
		
		ll.add("laxmi");
		ll.add('a');  //
		
		System.out.println("no of elements : "+ll.size());
		
		
		
		
		System.out.println("insertion is preserved :");
		System.out.println(ll);
		ll.removeFirstOccurrence(60);
		System.out.println("Remove first occurence :");
		System.out.println(ll);
		
		//1st way
		System.out.println("display the elements element by element,enhanced for loop");
		for(Object o:ll) {
			System.out.println(o);
		}
	
		//Using iterator object
		//convert collectionObject into iterator Object
		//check the condition whether elements exists or not in iterator Object
		//if exists then print the elements
		System.out.println("Displaying the elements using iterator Object");
		Iterator<Object>  iobj=ll.iterator();
		while(iobj.hasNext()) {
			System.out.println(iobj.next());
		}
		
		//using java8 forEach loop with lamda expression
		System.out.println("Using java8 Stream displaying the elements element by elements");
		ll.forEach(e -> System.out.println(e));
		
		//adding element at firstIndex
		ll.addFirst("apple");
		System.out.println(ll);
		
		ll.addLast("mango");
		System.out.println(ll);
		
		
	}
	
	
}
