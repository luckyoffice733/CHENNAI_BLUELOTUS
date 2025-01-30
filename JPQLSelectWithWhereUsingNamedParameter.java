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
public class JPQLSelectWithWhereUsingNamedParameter 
{
    public static void main( String[] args )
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the productName to search");
       String pn=sc.nextLine();
    	
   EntityManagerFactory emfty=Persistence.createEntityManagerFactory("productUnit");
    EntityManager eManger=emfty.createEntityManager(); //establish the connection 
     
    //:a ,:b.... NamedParamters parameters
    String query="Select p FROM Product p where p.productName=:a and p.price=:b";
    
    Query qt =eManger.createQuery(query);
    qt.setParameter("a",pn);
    qt.setParameter("b",80000);
    
    List<Product> al=     qt.getResultList();
    System.out.println("Product With Where clause:");
    
    al.forEach(System.out::println);
    
 
 
   eManger.close();
    	
    }
}
