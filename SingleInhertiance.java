package com.training;

class Animal {
	public void eating() {
		System.out.println("Animals is eating.....!");
	}
}
class Dog extends Animal {
	public void barking() {
		System.out.println("bow bow ......");
	}
}
public class SingleInhertiance {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eating();
		d.barking();

	}

}
