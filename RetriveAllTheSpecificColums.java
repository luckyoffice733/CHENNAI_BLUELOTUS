package com.training;

import java.util.List;

import com.training.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

/**
 * Hello world!
 *
 */
public class RetriveAllTheSpecificColums 
{
    public static void main( String[] args )
    {
       
   EntityManagerFactory emfty=Persistence.createEntityManagerFactory("productUnit");
    EntityManager eManger=emfty.createEntityManager(); //establish the connection 
     
      String query="Select p.pid,p.productName FROM Product p";
       Query qt =eManger.createQuery(query);
       List<Object[]> al=     qt.getResultList();
       System.out.println("Product Specific column are :");
       for(Object obj[]:al) {
    	   System.out.println(obj[0]+" "+obj[1]);
       }
       
      
       
    
    
      eManger.close();
    	
    }
}
