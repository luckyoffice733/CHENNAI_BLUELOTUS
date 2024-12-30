package com.training.usecases;

public class ExampleOnArray7 {

	public static Product[] getProductDetails() {
		Product p1 = new Product(1021,"mouse",600);
		
		Product p2 = new Product();
		p2.setProductId(1023);
		p2.setProductName("monitor");
		p2.setPrice(10000);
		
		//Product pobj[] = new Product[3];
		Product pobj[] = {p1,p2};
		return pobj;
	}
	
	public static void main(String[] args) {
		Product p[]=ExampleOnArray7.getProductDetails();
		for(Product pt:p) {
			System.out.println(pt);
		}
		
		for(Product pt:p) {
			System.out.println(pt.getProductId()+" "+pt.getProductName()+" "+pt.getPrice());
		}
	}
	
}
