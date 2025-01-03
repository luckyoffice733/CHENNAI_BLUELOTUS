package com.training.setinterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleOnUserDefinedObjectInLinkedHashSet2 {
	
	
	public static void main(String[] args) {
		
		LinkedHashSet<Employee> lhs = new LinkedHashSet<>();
		
		Employee e1 = new Employee();
		e1.setEmpId(1212);
		e1.setEmpName("smith");
		e1.setEmpSalary(6000);
		
		Employee e2 = new Employee(1021,"martin",4000);
		Employee e3 = new Employee(3211,"allen",8000);
		Employee e4 = new Employee(1021,"martin",4000);
		
		lhs.add(e4);
		lhs.add(e3);
		lhs.add(e1);
		lhs.add(e2);
		
		System.out.println("No of Objects in HashSet: "+lhs.size());
		System.out.println(lhs);
		
		System.out.println("Displaying elements using Iterator");
		Iterator<Employee> iobj= lhs.iterator();
		while(iobj.hasNext()) {
			Employee eobj = iobj.next();
			System.out.println(eobj.getEmpId()+" "+eobj.getEmpName()+" "+eobj.getEmpSalary());
		}
		
		
		
		
		
	}

}
