package com.training.mapinterface;

import java.util.TreeMap;

public class ExampleOnTreeMap3 {
	public static void main(String[] args) {

		TreeMap<String,Integer> tm = new TreeMap<>();
		
		//adding pairs into  Map
		tm.put("pavanKalyan",50);
		tm.put("balakrishna",65);
		tm.put("rajinkanth",75);
		tm.put("Ajith",50);
		tm.put("vijay",50);
		tm.put("pavanKalyan",55);//key not duplicate but its override the existing value.
		System.out.println("No of pairs  is : "+tm.size());
		
		System.out.println("Ascending Order Preserved Based on keys ");
		System.out.println(tm);
		
		
	}
}
