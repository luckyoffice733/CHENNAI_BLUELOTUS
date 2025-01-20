package com.cg.training.enumration;
///enum is to represent group of constants 
//these constants are static and final constants
 //enum does not extends from any other classes and it supports implements

enum Day {  
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class ExampleOnDays {
	
  public static void main(String[] args) {
	//accessing the constants from enum using enumname.constantname
	Day d=  Day.SUNDAY;  //it will return enum object which contain the constant
	System.out.println(d);  
	
	 int position= d.ordinal(); //constants index also start index position a
	System.out.println("Position of constant is : "+position);//6
	
	String enumName=d.name();
	System.out.println("Enum name is : "+enumName);//SUNDAY
	
	//to list all the enums from the Enum class using Enum[] values()
	  Day[] listEnums=   Day.values();
	  System.out.println("Enums are :");
	  for(Day de :listEnums) {
		 System.out.println(de); 
	  }
	  
	  System.out.println("using for loop");
	  for(int i=0;i<listEnums.length;i++) {
		  System.out.println(listEnums[i]);
	  }
	  
	  
}
}
