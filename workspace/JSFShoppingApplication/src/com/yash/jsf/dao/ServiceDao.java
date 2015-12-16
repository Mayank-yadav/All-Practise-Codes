package com.yash.jsf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.jsf.util.ConnectDB;

public class ServiceDao {

	public String Select(String query){
		Connection connection= ConnectDB.getConnection();
		PreparedStatement preparedstatement ;
		String result=null;
		try {
			preparedstatement=connection.prepareStatement(query);
			 ResultSet resultset=preparedstatement.executeQuery();
			 while(resultset.next()){
				 result=resultset.getString("password");
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	
	public void Update(String query){
		
	}
}
