package com.training.mapinterface;

import java.util.HashMap;

public class ExampleOnHashMap {
	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<>();
		
		//adding pairs into  Map
		hm.put("pavanKalyan",50);
		hm.put("balakrishna",65);
		hm.put("rajinkanth",75);
		hm.put("Ajith",50);
		hm.put("vijay",50);
		hm.put("pavanKalyan",55);//key not duplicate but its override the existing value.
		System.out.println("No of pairs  is : "+hm.size());
		
		System.out.println("Random Order Based on keys ");
		System.out.println(hm);
		
		
	}
}
