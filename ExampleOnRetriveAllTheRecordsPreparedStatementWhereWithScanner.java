package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExampleOnRetriveAllTheRecordsPreparedStatementWhereWithScanner {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the deptno");
		int dno=sc.nextInt();
		
		
		try {//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			String url="jdbc:mysql://localhost:3306/bluelotus";
		Connection con =DriverManager.getConnection(url,"root","root");
			
			  
		String query="select * from emp where deptno=?";
		//statement object
		
		
		PreparedStatement pstmt =con.prepareStatement(query);
		pstmt.setInt(1, dno);
		ResultSet rs =pstmt.executeQuery();
		System.out.println("Employee Details are :");
		while(rs.next()) {
			
		 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(6)+" "+rs.getString(8));
		
		}
		
		
		
		
	    rs.close();
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
