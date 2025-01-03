package com.training.setinterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleOnLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

		lhs.add(121);
		lhs.add(50);
		lhs.add(40);
		lhs.add(50);
		lhs.add(10);
		lhs.add(5);

		System.out.println("No of elements : " + lhs.size());
		System.out.println("Insertion Order is Preserved in LinkedHashSet :");
		System.out.println(lhs);

		lhs.remove(10);
		System.out.println("After remove the elements are :");
		System.out.println(lhs);
		
	
		
		//1st way
				System.out.println("display the elements element by element,enhanced for loop");
				for(Integer o:lhs) {
					System.out.println(o);
				}
			
				//Using iterator object
				//convert collectionObject into iterator Object
				//check the condition whether elements exists or not in iterator Object
				//if exists then print the elements
				System.out.println("Displaying the elements using iterator Object");
				Iterator<Integer>  iobj=lhs.iterator();
				while(iobj.hasNext()) {
					System.out.println(iobj.next());
				}
				
				//using java8 forEach loop with lamda expression
				System.out.println("Using java8 Stream displaying the elements element by elements");
				lhs.forEach(e -> System.out.println(e));
				
				
		
		
		
		

	}

}
