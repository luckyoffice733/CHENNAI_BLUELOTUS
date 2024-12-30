package com.training.usecases;

public class ExampleOnArray6 {

	public void addFruits(String ft[][]) {
		System.out.println("Fruits are :");
		for(int i=0;i<ft[0].length;i++) {
			for(int j=0;j<ft[1].length;j++) {
			System.out.print(ft[i][j]+" ");
	
		}
			System.out.println("");
		}
	}
	public static int[] getPersonAge() {
		int[] age = { 50, 26, 18, 16 };
		return age;
	}

	public static void main(String[] args) {
		ExampleOnArray6 eoa3 = new ExampleOnArray6();

		String st[][] = {{"orange", "mango"}, {"apple", "banana" }};
		eoa3.addFruits(st);

		int ag[] = ExampleOnArray6.getPersonAge();
		for (int a : ag) {
			System.out.println(a);
		}
	}

}
