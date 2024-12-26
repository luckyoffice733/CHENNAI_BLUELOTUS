package com.training;

public class TestProduct {

	public static void main(String[] args) {
		Product product = new Product();
		//private variables  directly access with the same class.
		/*
		 * product.productId=1011; product.productName="mouse"; product.price=600;
		 */
		
		//to inititlaize the private instance variable 
		//using setter methods
		product.setProductId(1001);
		product.setProductName("Laptop");
		product.setPrice(70000);
		
		System.out.println("Product Detail are :");
		System.out.println(product.getProductId()+
				" "+product.getProductName()+" "
				+product.getPrice());
		
	}

}
