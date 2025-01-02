package com.training.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExampleOnList3 {
	
	public static void main(String[] args) {
		
		ArrayList<Product> al = new ArrayList<>();
		
		Product p = new Product();
		p.setProductId(105);
		p.setProductName("mouse");
		p.setPrice(600);
		
		Product p2 = new Product(31,"monitor",8000);
		Product p3 = new Product(131,"mobile",18000);
		
		//adding /creating/inserting into ArrayList
		al.add(p);
		al.add(p3);
		al.add(p2);
		
	   System.out.println("No of element: "+al.size());
	   System.out.println("insertion order is preserved");
	   System.out.println(al);
	   //get() -> the specific object based on index at 2
	   Product pt= al.get(2);
	   pt.setProductName("RAM"); //udpating the productName monitor to ram
	   pt.setPrice(10000);
	   al.set(2,pt);
	   
	   System.out.println("Updated or modified productName in index Position : 2");
	   System.out.println(al);
	   
	   //adding an new Object at specific index position: 1
       Product p4 = new Product(121,"keyboard",1200);
       al.add(1,p4);
       
       System.out.println("Adding new element at index position :1");
       System.out.println(al);
	   
	   //it will remove the record and return the removed record
	   Product delProduct=al.remove(2);
	   System.out.println("Record deleted successfully : "+delProduct.getProductId());
	   
	   System.out.println("After delete all the records");
	   System.out.println(al);
	   
	   System.out.println("Displaying the elements using enchanced for loop");
	   
	   for(Product pts:al) {
		   System.out.println(pts);//toString
		   System.out.println(pts.getProductId()+" "+pts.getProductName()+" "+pts.getPrice());
	   }
	   
	   System.out.println("Displaying the elements using iterator");
	    Iterator<Product> iobj=  al.iterator();
	    while(iobj.hasNext()) {
	    	//System.out.println(iobj.next()); //toString
	    	Product pit=iobj.next();
	    	System.out.println(pit.getProductId()+" "+pit.getProductName()+" "+pit.getPrice());
	    }
	    
	    System.out.println("Displaying the elements using Java8 Foreach");
	    al.forEach(e -> System.out.println(e));//toString();
	    al.forEach(e -> System.out.println(e.getProductId()+" "+e.getProductName()));
	     
	    MyComparator mycmpt = new MyComparator();
	    Collections.sort(al,mycmpt);
	    
	    System.out.println();
	    System.out.println("After sortin the elements using Java8 Foreach");
	    al.forEach(e -> System.out.println(e.getProductId()+" "+e.getProductName()+" "+e.getPrice()));
	   
		
	   al.sort(mycmpt);
	   System.out.println();
	    System.out.println("After sortin the elements using Java8 Foreach");
	    al.forEach(e -> System.out.println(e.getProductId()+" "+e.getProductName()+" "+e.getPrice()));
	   
	   
		
		
		
	}

}
