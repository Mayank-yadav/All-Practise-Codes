package com.yash.jsf.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private static Connection connection;
	static String url="jdbc:mysql://localhost:3306/shoppingdb";
	static String user="root";
	static String password="root";
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				connection=DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
		
	}
	public static void close(){
		try{
			connection.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
