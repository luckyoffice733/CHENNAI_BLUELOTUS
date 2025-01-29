package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection con=null;
	
	public static Connection getMySqlConnection() {
		
		//load or register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish Connection
			String url ="jdbc:mysql://localhost:3306/bluelotus";
		con = DriverManager.getConnection(url,"root","root");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void closeMySqlConnection(Connection con) {
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
