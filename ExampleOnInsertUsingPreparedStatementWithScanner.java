package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExampleOnInsertUsingPreparedStatementWithScanner {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the empno: ");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the ename: ");
		String en = sc.nextLine();
		
		System.out.println("Enter the Job: ");
		String jb = sc.nextLine();
		
		System.out.println("Enter the sal: ");
		float sal = sc.nextFloat();
		
		
		
		try {//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			String url="jdbc:mysql://localhost:3306/bluelotus";
		Connection con =DriverManager.getConnection(url,"root","root");
			
			
		String query="insert into employee values(?,?,?,?)";
       ///prepared statement Object
		PreparedStatement pstmt  =con.prepareStatement(query);
		pstmt.setInt(1,eid);
		pstmt.setString(2,en);
		pstmt.setString(3,jb);
		pstmt.setFloat(4,sal);
		
		 int iobj=  pstmt.executeUpdate();
		if(iobj>0) {
			System.out.println("Record Inserted using preparedStatment....");
		}else {
			System.out.println("Record not inserted");
		}
		
		//close the connection
		pstmt.close();
		con.close();
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
