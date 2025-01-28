package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnUpdateUsingStatement {
	
	public static void main(String[] args) {
		
		try {//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			String url="jdbc:mysql://localhost:3306/bluelotus";
		Connection con =DriverManager.getConnection(url,"root","root");
			
			  
		String query="update employee set job='SALEMAN' where empno=2121 ";
		//statement object
		
		Statement stmt =con.createStatement();
		 int iobj=  stmt.executeUpdate(query);
		if(iobj>0) {
			System.out.println("Record Updated ....");
		}else {
			System.out.println("Record not updated");
		}
		
		//close the connection
		stmt.close();
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
