package com.training;

import com.training.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class SearchRecord 
{
    public static void main( String[] args )
    {
       
   EntityManagerFactory emfty=Persistence.createEntityManagerFactory("productUnit");
    EntityManager eManger=emfty.createEntityManager(); //establish the connection 
     
    
     Product searchRecord=  eManger.find(Product.class,13211);
     
     if(searchRecord!=null) {
    	 System.out.println(searchRecord.getPid()+" "+searchRecord.getProductName()+" "+searchRecord.getPrice());
     }else {
    	 System.out.println("REcord not found based on id");
     }
    
    
      eManger.close();
    	
    }
}
