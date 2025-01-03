package com.training.setinterface;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleOnTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(121);
		ts.add(50);
		ts.add(40);
		ts.add(50);
		ts.add(10);
		ts.add(5);

		System.out.println("No of elements : " + ts.size());
		System.out.println("Natural Sorting Order is Preserved(ascending order) in TreeSet :");
		System.out.println(ts);
		
		
	 Iterator<Integer> desiob=	ts.descendingIterator();
	 System.out.println("Descending Order is :");
		
		while(desiob.hasNext()) {
			System.out.println(desiob.next());
		}
		
		

		ts.remove(10);
		System.out.println("After remove the elements are :");
		System.out.println(ts);
		
		
		//1st way
				System.out.println("display the elements element by element,enhanced for loop");
				for(Integer o:ts) {
					System.out.println(o);
				}
			
				//Using iterator object
				//convert collectionObject into iterator Object
				//check the condition whether elements exists or not in iterator Object
				//if exists then print the elements
				System.out.println("Displaying the elements using iterator Object");
				Iterator<Integer>  iobj=ts.iterator();
				while(iobj.hasNext()) {
					System.out.println(iobj.next());
				}
				
				//using java8 forEach loop with lamda expression
				System.out.println("Using java8 Stream displaying the elements element by elements");
				ts.forEach(e -> System.out.println(e));
				
				
		
		
		
		

	}

}
