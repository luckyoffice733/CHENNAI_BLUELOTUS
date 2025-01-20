package com.cg.training.exonstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOnStream5 {
  public static void main(String[] args) {
	
  List<Integer> al = Arrays.asList(40,10,5,30,20);
  
  System.out.println("Insertion order :"+al);//40 10 5 30 20
	Stream<Integer> st1 =al.stream();
	
	System.out.println("ascending order"); // sort is intermediate operation
	st1.sorted().forEach(e->System.out.print(e+" ")); //5 10 20 30 40
 
	//syntax: ternary operator
	// typeOfVariable = condition? statement1:statement2
	//if condition true it will return statement1
	//if condition false it will return statement2
	int a=10,b=20;
	int res =a>b?a:b;
	System.out.println(" \n result is: ");
	System.out.println(res);
	
	Stream<Integer> st2 =al.stream();
	Comparator<Integer> ctobj =(x,y)->(x<y)?1:(x>y)?-1:0;  //descending order
	System.out.println("Desceding order using comparator"); // sort is intermediate operation
	st2.sorted(ctobj).forEach(e->System.out.print(e+" "));
	
	
	
	
	
}
}
