package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOnRetriveAllTheRecords {
	
	public static void main(String[] args) {
		
		try {//load or register the driver
			/*
			 * Class.forName("com.mysql.cj.jdbc.Driver");
			 * 
			 * //establish the connection String
			 * url="jdbc:mysql://localhost:3306/bluelotus"; Connection con
			 * =DriverManager.getConnection(url,"root","root");
			 */
		
		Connection con = DBUtil.getMySqlConnection();
			
			  
		String query="select * from dept";
		//statement object
		
		
		Statement stmt =con.createStatement();
		ResultSet rs =stmt.executeQuery(query);
		System.out.println("Department Details are :");
		while(rs.next()) {
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			System.out.println(rs.getInt("deptno")+" "+rs.getString("dname")+" "+rs.getString("loc"));
		}
		
		
		
		
	    rs.close();
	    stmt.close();
		//con.close();
		DBUtil.closeMySqlConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
