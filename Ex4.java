package com.training;

public class Ex4 {
  public static void main(String[] args) {
	 
	
	  
	  System.out.println("For Loop----");
	 for(int j=1;j<11;j++) {
		 if(j==5 || j==6) {
			 continue;
		 }
		 System.out.println(j);
	 }
	 
	 System.out.println("while Loop----");
	 int i=1;
	 while(i<=10) {
		 if(i==5 || i==6) {
			 i++;
			 continue;
		 }else {
			 System.out.println(i);
		 }
		 i+=1;
	 }
	 
	
	 
}
}
