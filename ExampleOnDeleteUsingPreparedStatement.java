package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExampleOnDeleteUsingPreparedStatement {
	
	public static void main(String[] args) {
		
		try {//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish the connection
			String url="jdbc:mysql://localhost:3306/bluelotus";
		Connection con =DriverManager.getConnection(url,"root","root");
			
			  
		String query="delete from employee where empno=? ";
		//statement object
		
	    PreparedStatement pstmt =con.prepareStatement(query);
	    pstmt.setInt(1,13121);
	    
	    
		 int iobj=  pstmt.executeUpdate();
		if(iobj>0) {
			System.out.println("Record Deleted ....");
		}else {
			System.out.println("Record not Deleted");
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
