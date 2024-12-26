package com.training;


class Calculation{
	
	int x,y;
	
	public Calculation() {
		System.out.println("we are in default constructor");
	}
	public Calculation(Calculation c) {
		this.x=c.x;
		this.y=c.y;
		System.out.println(this.x+" "+this.y);
	}
	public int addition(int x, int y) {
	  return x+y;
	}
}
public class Test {
   public static void main(String[] args) { 
	Calculation cal = new Calculation();
	int res=cal.addition(40, 50);
	 System.out.println(res);  
	 
    Calculation cal2 = new Calculation(cal);
    System.out.println("sum is : "+cal2.addition(80,50));
}
}
