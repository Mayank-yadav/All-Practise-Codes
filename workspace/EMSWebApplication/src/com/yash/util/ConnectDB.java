package com.yash.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	private static Connection connection;
	static String url="jdbc:mysql://localhost:3306/emsdb";
	static String user="root";
	static String password="root";
	
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(url,user,password);
			
		}catch(Exception e ){
			System.out.println(""+e.getMessage());
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
