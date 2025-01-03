package com.training.setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleOnUserDefinedObjectInHashSet {
	
	
	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<>();
		
		Employee e1 = new Employee();
		e1.setEmpId(1212);
		e1.setEmpName("smith");
		e1.setEmpSalary(6000);
		
		Employee e2 = new Employee(1021,"martin",4000);
		Employee e3 = new Employee(3211,"allen",8000);
		Employee e4 = new Employee(1021,"martin",4000);
		
		hs.add(e4);
		hs.add(e3);
		hs.add(e1);
		hs.add(e2);
		
		System.out.println("No of Objects in HashSet: "+hs.size());
		System.out.println(hs);
		
		System.out.println("Displaying elements using Iterator");
		Iterator<Employee> iobj= hs.iterator();
		while(iobj.hasNext()) {
			Employee eobj = iobj.next();
			System.out.println(eobj.getEmpId()+" "+eobj.getEmpName()+" "+eobj.getEmpSalary());
		}
		
		
		
		
		
	}

}
