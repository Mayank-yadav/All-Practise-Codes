package com.yash.training.tmp.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private static Connection connection;
	static String url="jdbc:mysql://localhost:3306/officemanagementsystem";
	static String user="root";
	static String password="root";
	static Connection connect;
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
	
	public static ResultSet select(String query){
		System.out.println(""+query);
		return null;
		
	}

	public static ResultSet update(String query){
		
		return null;
		
	}
}
