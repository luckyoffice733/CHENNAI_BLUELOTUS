package com.cg.training.enumration;
enum Colors{
	RED,BLUE,GREEN  //group of constants
}

public class ExampleOnColors {

	public static void main(String[] args) {

		Colors cs =Colors.BLUE;//it will the BLUE Constant

		switch (cs) {
		case RED :System.out.println("The color is red ");
		break;
		case GREEN:System.out.println("The color is green");
		break;    

		case BLUE:System.out.println("The color is  blue ");
		break; 
		}
		
		int index=cs.ordinal();
		switch (index) {
		case 0:System.out.println("The color is red ");
		break;
		case 1:System.out.println("The color is blue");
		break;    

		case 2:System.out.println("The color is  green");
		break; 
		}
		
		
		
		

	}


}
