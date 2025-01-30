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
public class DeleteRecord 
{
    public static void main( String[] args )
    {
       
   EntityManagerFactory emfty=Persistence.createEntityManagerFactory("productUnit");
    EntityManager eManger=emfty.createEntityManager(); //establish the connection 
    EntityTransaction tx= eManger.getTransaction(); 
    tx.begin();
    
     Product delfound=  eManger.find(Product.class,1321);
     if(delfound!=null) {
    	 eManger.remove(delfound);
    	 System.out.println("Record is Deleted");
     }else {
    	 System.out.println("Record not found ..!");
     }
    
    
    tx.commit();
    
    
      eManger.close();
    	
    }
}
