package com.training;

public class Student {
	
	long studentId;
	String studentName;
	String  addrs;
	
	public Student() {
		System.out.println("we are in default constructor");
	}

	public Student(long studentId, String studentName, String addrs) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.addrs = addrs;
	}
	
	public void methodOne() {
		System.out.println("we are in methodOne");
		
		String msg=this.display(); //calling instance in another another instance method
		System.out.println(msg);
	}
	
	public String display() {
		return this.studentId+" "+this.studentName+" "+this.addrs;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(121,"Smith","Chennai");
	    s1.methodOne();
	    
	    //System.out.println(this.studentId);
	    
	}
	
	
	
	
	

}
