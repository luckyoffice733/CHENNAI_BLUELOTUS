package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnUpdateUsingPreparedStatement2 {
	
	public static void main(String[] args) {
		
		try {//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			String url="jdbc:mysql://localhost:3306/bluelotus";
		Connection con =DriverManager.getConnection(url,"root","root");
			
			  
		String query="update employee set ename=?,job=?,sal=? where empno=? ";
		//Preparedstatement object
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1,"sunil");
		pstmt.setString(2,"Manager");
		pstmt.setFloat(3,50000);
		pstmt.setInt(4,13121);
		
		int iobj = pstmt.executeUpdate();
		
		
		if(iobj>0) {
			System.out.println("Record Updated ....");
		}else {
			System.out.println("Record not updated");
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
