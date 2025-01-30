package com.training;

import java.util.List;
import java.util.Scanner;

import com.training.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

/**
 * Hello world!
 *
 */
public class JPQLSelectWithWhereUsingPositionalParameter 
{
    public static void main( String[] args )
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the productName to search");
       String pn=sc.nextLine();
    	
   EntityManagerFactory emfty=Persistence.createEntityManagerFactory("productUnit");
    EntityManager eManger=emfty.createEntityManager(); //establish the connection 
     //?labeled
    //?1 ,?2.... positional parameters
    String query="Select p FROM Product p where p.productName=?1 and p.price=?2";
    
    Query qt =eManger.createQuery(query);
    qt.setParameter(1,pn);
    qt.setParameter(2,80000);
    
    List<Product> al=     qt.getResultList();
    System.out.println("Product With Where clause:");
    
    al.forEach(System.out::println);
    
 
 
   eManger.close();
    	
    }
}
