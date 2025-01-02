package com.training.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExampleOnLinkedList2 {
	public static void main(String[] args) {
	   LinkedList<Integer> ll = new LinkedList<>();	
		
      // ArrayList<Integer>  al = new ArrayList<>();
       //adding the elements
       ll.add(2121);
       ll.add(40);
       ll.add(79);
       ll.add(40);
       ll.add(20);
       ll.add(85);
       //al.add(null);
       
       System.out.println("No of elements in al is : "+ll.size());
       System.out.println("insertion order is preserved : "+ll);
       
       //insert any element at specific index position using add(int pos,element)
       ll.add(1,90);
       System.out.println("After adding element at index position 1 "+ll);
       
       //to update/modifiy/change the element at index position using set(int pos,element)
       //update 79 to 59  at index position 3
       ll.set(3,59);
       System.out.println("After updating element at index position 3 "+ll);
       
      //delete the element based on the index position using remove() ///overloads methods
      Integer removedElement= ll.remove(2);
       System.out.println("removed an element at specific index position 2: "+removedElement);
       System.out.println(ll);
       
       //search an element exist in the collection Object using contains
       boolean b=ll.contains(100);
       System.out.println("element exist or not?: "+b);
       
       boolean b1=ll.contains(40);
       System.out.println("element exist or not?: "+b1);
       
     //1st way
     		System.out.println("display the elements element by element,enhanced for loop");
     		for(Integer io:ll) {
     			System.out.println(io);
     		}
     	
     		//Using iterator object
     		//convert collectionObject into iterator Object
     		//check the condition whether elements exists or not in iterator Object
     		//if exists then print the elements
     		System.out.println("Displaying the elements using iterator Object");
     		Iterator<Integer>  iobj=ll.iterator();
     		while(iobj.hasNext()) {
     			System.out.println(iobj.next());
     		}
     		
     		//using java8 forEach loop with lamda expression
     		System.out.println("Using java8 Stream displaying the elements element by elements");
     		ll.forEach(e -> System.out.println(e));
     	    
     		
     		Collections.sort(ll);
     		System.out.println("Ascending order L");
     		Iterator<Integer>  iobj1=ll.iterator();
     		while(iobj1.hasNext()) {
     			System.out.println(iobj1.next());
     		}
     	
     		Collections.reverse(ll);
     		System.out.println("Descending Order :");
     		Iterator<Integer>  iobj2=ll.iterator();
     		while(iobj2.hasNext()) {
     			System.out.println(iobj2.next());
     		}
     		
     		
       
	}
}
