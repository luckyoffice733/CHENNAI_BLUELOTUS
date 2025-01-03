package com.training.setinterface;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleOnUserDefinedObjectTreeSet3 {
	
	
	public static void main(String[] args) {
		
		TreeSet<Employee> ts = new TreeSet<>();
		
		Employee e1 = new Employee();
		e1.setEmpId(1212);
		e1.setEmpName("smith");
		e1.setEmpSalary(6000);
		
		Employee e2 = new Employee(1021,"martin",4000);
		Employee e3 = new Employee(3211,"allen",8000);
		Employee e4 = new Employee(1021,"martin",4000);
		
		ts.add(e4);
		ts.add(e3);
		ts.add(e1);
		ts.add(e2);
		
		System.out.println("No of Objects in HashSet: "+ts.size());
		System.out.println(ts);
		
		System.out.println("Displaying elements using Iterator");
		Iterator<Employee> iobj= ts.iterator();
		while(iobj.hasNext()) {
			Employee eobj = iobj.next();
			System.out.println(eobj.getEmpId()+" "+eobj.getEmpName()+" "+eobj.getEmpSalary());
		}
		
		
		
		
		
	}

}
