package com.training.mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleOnMapCrudOperations {

	public static void main(String[] args) {
		//item name and price
		HashMap<String,Double> hm = new HashMap<>();
		
		hm.put("Birayni",300.00);
		hm.put("shawarma",100.00);
		hm.put("PaneerTikka",350.00);
		hm.put("gulabjamun", 80.00);
		hm.put("icecream",150.00);
		
		System.out.println("No of pairs is : "+hm.size());
		System.out.println("Order is :");
		System.out.println(hm);
		//search
		boolean b1 =hm.containsKey("Birayni");
		System.out.println("key is found or not ?: "+b1);
		boolean b2 =hm.containsKey("Paneer Birayni");
		System.out.println("key is found or not ?: "+b2);
		
		double bp =hm.get("Birayni");
		System.out.println("Based on key value is : "+bp);
		
		double retVal=hm.remove("Birayni");
		System.out.println("After remove an key corresponding value return : "+retVal);
		System.out.println(hm);
		
		hm.replace("gulabjamun", 100.00);
		System.out.println("After replace");
		System.out.println(hm);
		
		//get the only keys from the pair(key,value);
		Set<String> itemKeys =hm.keySet();
		System.out.println("Only keys are :");
		for(String its:itemKeys) {
			System.out.println(its);
		}

		//get the only values from the pair(key,value);
	  Collection<Double>  itemValues =hm.values();
	  System.out.println("Only Values are :");
	  for(Double vts:itemValues) {
			System.out.println(vts);
		}
		
		//collecting the key,values and displaying the key,value 
	   Set<Entry<String,Double>> entrySt=hm.entrySet();
	   
	   System.out.println("Displaying the entry sets using enhanced forloop");
	   System.out.println("Key      values  are :");
	   for(Entry<String,Double> et :entrySt) {
		   System.out.println(et.getKey()+" "+et.getValue());
	   }
	   
	   System.out.println("Displaying the entry sets using iterator of Set interface");
	   Iterator<Entry<String,Double>> iobj =entrySt.iterator();   
	   while(iobj.hasNext()) {
		   Entry<String,Double> ety=iobj.next();
		   System.out.println(ety.getKey()+"|"+ety.getValue());
	   }
	   System.out.println("Displaying the entry sets using java8 forEach loop using lamda");
	   entrySt.forEach(e ->System.out.println(e.getKey()+":"+e.getValue()));
	   
	  
	  
	  
	  
	  
	  
	  
		
		
	}

}
