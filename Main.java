package com.training.generic;

class Test <T>{
   
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}

public class Main{
	public static void main(String[] args) {
	
		 Test<Integer> t1 = new Test();
		 t1.setObj(100);
		 System.out.println(t1.getObj());
		 
	
		 Test<Double> t2 = new Test();
		 t2.setObj(121221.00);
		 System.out.println(t2.getObj());
		 
		
		
	}
	
	
}
