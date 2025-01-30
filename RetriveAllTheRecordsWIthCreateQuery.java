package com.training;

import java.util.List;

import com.training.entity.Product;
import com.training.entity.Product2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

/**
 * Hello world!
 *
 */
public class RetriveAllTheRecordsWIthCreateQuery 
{
    public static void main( String[] args )
    {
       
   EntityManagerFactory emfty=Persistence.createEntityManagerFactory("productUnit");
    EntityManager eManger=emfty.createEntityManager(); //establish the connection 
     
    String query="FROM Product";
    Query qt =eManger.createQuery(query);
    List<Product> al=     qt.getResultList();
    System.out.println("Product Details are :");
    
    al.forEach(System.out::println);
    
 
 
   eManger.close();
    	
    }
}
