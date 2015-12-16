package com.yash.ajaxassignment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.ajaxassignment.domain.User;
import com.yash.ajaxassignment.util.ConnectDB;


public class ServiceDao {

	public User userDetails(int userId){
		Connection connection=ConnectDB.getConnection();
		User user=new User();
		String query="Select * from user where userId=(?)";
		PreparedStatement preparedstatement;
		try {
			preparedstatement =connection.prepareStatement(query);
			preparedstatement.setInt(1,userId);
		
			ResultSet result=preparedstatement.executeQuery();
			while(result.next()){
				
				user.setUserId(userId);
				user.setEmail(result.getString("email"));
				user.setName(result.getString("name"));
				user.setPassword(result.getString("password"));
				user.setStatus(result.getString("status"));
				user.setUsername(result.getString("username"));
				user.setType(result.getString("type"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return user;
		
	}
	
}
