package com.training;

class Vehincle{
	String type;
    double cost;
    int noOfWheels;
    
    public void display() {
    	System.out.println(this.type+" "+this.cost+" "+this.noOfWheels);
    }
}
class Bike extends Vehincle{
	
	String modelName;
	String capacity;
	int  mileage;
	
	public void bikeDetails() {
	  System.out.println(this.modelName+" "+this.capacity+" "+this.mileage);
	}
	
}

class Bus extends Vehincle{
	
	String modelName;
	String capacity;
	int  mileage;
	
	public void busDetails() {
	  System.out.println(this.modelName+" "+this.capacity+" "+this.mileage);
	}
	
}

public class HierarichalIneritance {
	public static void main(String[] args) {
	
		Bike b = new Bike();
		b.modelName="KTM";
		b.mileage=14;
		b.capacity="250cc";
		b.type="Two wheeler";
		b.cost=2400000;
		b.noOfWheels=2;
		System.out.println("Bike Details :");
		b.bikeDetails();
		b.display();
		System.out.println("Bus Details :");
	
		Bus bus = new Bus();
		bus.modelName="Service Bus";
		bus.mileage=10;
		bus.capacity="550cc";
		bus.type="six wheeler";
		bus.cost=1400000;
		bus.noOfWheels=6;
		
		bus.busDetails();;
		bus.display();

	}

}
