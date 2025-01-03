package com.training.setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnHashSet1 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();

		hs.add(121);
		hs.add(50);
		hs.add(40);
		hs.add(50);
		hs.add(10);
		hs.add(5);

		System.out.println("No of elements : " + hs.size());
		System.out.println("Order :");
		System.out.println(hs);

		hs.remove(10);
		System.out.println("After remove the elements are :");
		System.out.println(hs);
		
		//1st way
				System.out.println("display the elements element by element,enhanced for loop");
				for(Integer o:hs) {
					System.out.println(o);
				}
			
				//Using iterator object
				//convert collectionObject into iterator Object
				//check the condition whether elements exists or not in iterator Object
				//if exists then print the elements
				System.out.println("Displaying the elements using iterator Object");
				Iterator<Integer>  iobj=hs.iterator();
				while(iobj.hasNext()) {
					System.out.println(iobj.next());
				}
				
				//using java8 forEach loop with lamda expression
				System.out.println("Using java8 Stream displaying the elements element by elements");
				hs.forEach(e -> System.out.println(e));
				
				
		
		
		
		

	}

}
