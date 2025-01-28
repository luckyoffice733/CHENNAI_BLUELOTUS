package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExampleOnInsertUsingPreparedStatement {
	
	public static void main(String[] args) {
		
		try {//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			String url="jdbc:mysql://localhost:3306/bluelotus";
		Connection con =DriverManager.getConnection(url,"root","root");
			
			
		String query="insert into employee values(?,?,?,?)";
       ///prepared statement Object
		PreparedStatement pstmt  =con.prepareStatement(query);
		pstmt.setInt(1,2121);
		pstmt.setString(2,"Turner");
		pstmt.setString(3,"SoftWare");
		pstmt.setFloat(4,60000);
		
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
