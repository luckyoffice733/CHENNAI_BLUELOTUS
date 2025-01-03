package com.training.mapinterface;

import java.util.LinkedHashMap;

public class ExampleOnLinkedHashMap2 {
	public static void main(String[] args) {

		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
		
		//adding pairs into  Map
		lhm.put("pavanKalyan",50);
		lhm.put("balakrishna",65);
		lhm.put("rajinkanth",75);
		lhm.put("Ajith",50);
		lhm.put("vijay",50);
		lhm.put("pavanKalyan",55);//key not duplicate but its override the existing value.
		System.out.println("No of pairs  is : "+lhm.size());
		
		System.out.println("Insertion Order Preserved Based on keys ");
		System.out.println(lhm);
		
		
	}
}
