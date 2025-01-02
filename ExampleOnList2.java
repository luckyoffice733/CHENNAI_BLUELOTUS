package com.training.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ExampleOnList2 {
	public static void main(String[] args) {
	   List<Integer> al = new ArrayList<>();	
		
      // ArrayList<Integer>  al = new ArrayList<>();
       //adding the elements
       al.add(2121);
       al.add(40);
       al.add(79);
       al.add(40);
       al.add(20);
       al.add(85);
       //al.add(null);
       
       System.out.println("No of elements in al is : "+al.size());
       System.out.println("insertion order is preserved : "+al);
       
       //insert any element at specific index position using add(int pos,element)
       al.add(1,90);
       System.out.println("After adding element at index position 1 "+al);
       
       //to update/modifiy/change the element at index position using set(int pos,element)
       //update 79 to 59  at index position 3
       al.set(3,59);
       System.out.println("After updating element at index position 3 "+al);
       
      //delete the element based on the index position using remove() ///overloads methods
      Integer removedElement= al.remove(2);
       System.out.println("removed an element at specific index position 2: "+removedElement);
       System.out.println(al);
       
       //search an element exist in the collection Object using contains
       boolean b=al.contains(100);
       System.out.println("element exist or not?: "+b);
       
       boolean b1=al.contains(40);
       System.out.println("element exist or not?: "+b1);
       
     //1st way
     		System.out.println("display the elements element by element,enhanced for loop");
     		for(Integer io:al) {
     			System.out.println(io);
     		}
     	
     		//Using iterator object
     		//convert collectionObject into iterator Object
     		//check the condition whether elements exists or not in iterator Object
     		//if exists then print the elements
     		System.out.println("Displaying the elements using iterator Object");
     		Iterator<Integer>  iobj=al.iterator();
     		while(iobj.hasNext()) {
     			System.out.println(iobj.next());
     		}
     		
     		//using java8 forEach loop with lamda expression
     		System.out.println("Using java8 Stream displaying the elements element by elements");
     		al.forEach(e -> System.out.println(e));
     	    
     		
     		Collections.sort(al);
     		System.out.println("Ascending order L");
     		Iterator<Integer>  iobj1=al.iterator();
     		while(iobj1.hasNext()) {
     			System.out.println(iobj1.next());
     		}
     	
     		Collections.reverse(al);
     		System.out.println("Descending Order :");
     		Iterator<Integer>  iobj2=al.iterator();
     		while(iobj2.hasNext()) {
     			System.out.println(iobj2.next());
     		}
     		
     		
       
	}
}
