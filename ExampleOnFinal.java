package com.training.usecases;

public final class ExampleOnFinal {

	public final String collegeName = "PEC";
	public static final String companyName = "CG";
	public final double pi;

	{// try to reassign the final variable instance block.
		// collegeName="NRI";
		pi = 3.142;
	}

	public void dispay() {
		System.out.println("collegeName : " + this.collegeName);
		System.out.println("companyName: " + ExampleOnFinal.companyName);
		System.out.println("pi value is  : " + this.pi);
	}

	public void methodOne() {
		System.out.println("we are in methodOne");
	}

	public final void methodTwo() {
		System.out.println("we are in methodTwo");
	}

	public static void main(String[] args) {
		ExampleOnFinal eof = new ExampleOnFinal();
		eof.dispay();
		eof.methodTwo();

	}

}
