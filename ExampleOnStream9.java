package com.cg.training.exonstreams;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleOnStream9 {
	public static void main(String[] args) {
    
	  Stream<Integer> s = Stream.of(40,50,70,90,10);
	  
	Integer res=  s.mapToInt(Integer::valueOf).sum();
	  System.out.println("sum is : "+res);
	  
	  Stream<Integer> s1 = Stream.of(40,50,70,90,10);
	 Integer res1= s1.reduce(0,(a,b)->a+b);
	 System.out.println("sum is : "+res1);
	  
	 Stream<Integer> s2 = Stream.of(40,50,70,90,10);
	 
     IntSummaryStatistics iss  =s2.collect(Collectors.summarizingInt(Integer::valueOf));
     System.out.println("Total summary : "+iss);
	 System.out.println("sum is : "+iss.getSum());
	 
	 Stream<Integer> s3 = Stream.of(40,50,70,90,10);
	 Integer res4 =s3.collect(Collectors.summingInt(Integer::valueOf));
	 System.out.println("only sum is : "+res4);
	 
	 
	 
	 	  
	}
}
