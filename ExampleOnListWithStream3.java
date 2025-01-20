package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExampleOnListWithStream3 {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		al.add(43);
		al.add(50);
		al.add(10);
		al.add(15);
		al.add(60);
		al.add(10);
		
	   System.out.println("No of elemebts are : "+al.size());
	   Comparator<Integer> cmpt = (i1,i2)->i1>i2?1:i1<i2?-1:0;
	  Optional<Integer> opt= al.stream().max(cmpt);
	  System.out.println("Maximum value is : "+opt.get());
	  
	  Optional<Integer> opt1= al.stream().min(cmpt);
	  System.out.println("Minimum value is : "+opt1.get());
	   
	 int sumOfelements=  al.stream().mapToInt(Integer::valueOf).sum();
	  System.out.println("sum is : "+sumOfelements); 
	int sumOfElements1= al.stream().collect(Collectors.summingInt(Integer::valueOf));
	System.out.println("sum is : "+sumOfElements1); 
	

	
	
	
	
	
	  
	}

}
