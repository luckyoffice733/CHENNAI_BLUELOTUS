package com.training.listinterface;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {
	// custom sorting logic using Comparator using field productId
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
    ///sorting for productId
		if (o1.getProductId() > o2.getProductId()) {
			return -1;
		} else if (o1.getProductId() < o2.getProductId()) {
			return 1;
		} else {
			return 0;
		}

		/*  //sorting Code using ProductName();
		 * String pn =o1.getProductName(); String pn1 = o2.getProductName(); return
		 * pn.compareTo(pn1);
		 */
	}

}
