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
public class UpdateRecord 
{
    public static void main( String[] args )
    {
       
   EntityManagerFactory emfty=Persistence.createEntityManagerFactory("productUnit");
    EntityManager eManger=emfty.createEntityManager(); //establish the connection 
    EntityTransaction tx= eManger.getTransaction(); 
    tx.begin();
    
     Product pfound=  eManger.find(Product.class,3121);
     if(pfound!=null) {
    	 pfound.setProductName("oppoMobile");
    	 pfound.setPrice(18000);
    	 eManger.merge(pfound);
    	 System.out.println("Record is updated");
     }else {
    	 System.out.println("Record not found ..!");
     }
    
    
    tx.commit();
    
    
      eManger.close();
    	
    }
}
