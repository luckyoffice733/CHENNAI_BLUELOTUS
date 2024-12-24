package com.training;

public class Ex3 {
  public static void main(String[] args) {
	 int i=1,n=5;
	 
	 while(i<=10) {   
		 System.out.println(n+" X "+i+" = "+(n*i));
		 i=i+1; //i++  // i+=1
	 }
	  
	  System.out.println("For Loop----");
	 for(int j=1;j<11;j++) {
		 System.out.println(n+" X "+j+" = "+(n*j));
	 }
	 
	 System.out.println("do while Loop----");
	 
	 int k=1;
	 do {
		 System.out.println(n+" X "+k+" = "+(n*k));
		 k+=1;
	 }while(k<=10);
	 
}
}
