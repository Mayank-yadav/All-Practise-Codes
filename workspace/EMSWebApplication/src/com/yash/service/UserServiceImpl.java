package com.yash.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.domain.User;
import com.yash.util.ConnectDB;

public class UserServiceImpl implements UserServiceIntf{

	@Override
	public boolean userAuthentication(String username, String password) {
		Connection connection=ConnectDB.getConnection();
		String query="Select * from user where username=(?)";
		
		PreparedStatement preparedstatement;
		try {
			preparedstatement =connection.prepareStatement(query);
			preparedstatement.setString(1,username);
			ResultSet rs=preparedstatement.executeQuery();
			while(rs.next()){
				String pass=rs.getString("password");
					System.out.println("userImp"+pass);
				if(pass.equalsIgnoreCase(password)){
					System.out.println("successfully login");
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public void userRegister(User user) {
		// TODO Auto-generated method stub
		Connection connection=ConnectDB.getConnection();
		String query="Insert into user(name,email,type,status,username,password) values(?,?,?,?,?,?) ";
		PreparedStatement preparedstatement;
		try {
			preparedstatement=connection.prepareStatement(query);
			System.out.println(""+user.getName());
			preparedstatement.setString(1,user.getName());
			preparedstatement.setString(2, user.getEmail());
			preparedstatement.setString(3, user.getType());
			preparedstatement.setString(4, user.getStatus());
			preparedstatement.setString(5, user.getUsername() );
			preparedstatement.setString(6,user.getPassword());
			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	@Override
	public void delUser(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateUser(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getUserId(String username) {
		// TODO Auto-generated method stub
		Connection connection=ConnectDB.getConnection();
		String query="Select * from user where username=(?)";
		PreparedStatement preparedstatement;
		int userid = 0;
		try {
			preparedstatement=connection.prepareStatement(query);
			preparedstatement.setString(1,username);
			ResultSet rs=preparedstatement.executeQuery();
			while(rs.next()){
				userid=rs.getInt("userid");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userid;
	}

	

	

}
