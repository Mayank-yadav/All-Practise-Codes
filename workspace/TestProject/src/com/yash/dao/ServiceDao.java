package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import yash.com.domain.Details;

import com.yash.util.MyConnection;

public class ServiceDao {
	private static Connection connection=null;
	public  void Update(String sql){
	//	Connection connection=MyConnection.getConnection();
		
	}
	public  void InsertComplaint(String email,String software,String os,String description){
		Connection connection=MyConnection.getConnection();
		String sql="Insert Into Complaint values (?,?,?,?)";
		try{
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setString(1,email );
			preparedstatement.setString(2, software);
			preparedstatement.setString(3, os);
			preparedstatement.setString(4, description);
			preparedstatement.executeUpdate();
			System.out.println("Complaint is Registered");
		}catch(Exception e){
			System.out.println(""+e.getMessage());
		}
		
	}
	
	public  boolean CompareEmail(String email){
		Connection connection=MyConnection.getConnection();
		String sql="Select * From employeedetails";
		try {
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			ResultSet rs=preparedstatement.executeQuery();
	
			while(rs.next())
			{
				String emailid=rs.getString("Email");
				System.out.println(""+emailid);
				if(email.equalsIgnoreCase(emailid))
				{
				System.out.println("success");
				return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("unsuccess");
		return false;
	}
	
	public void NewUserRegister(String firstname,String lastname,String mobileno,String email){
			
			Connection connection=MyConnection.getConnection();
			String sql="Insert Into employeedetails values (?,?,?,?)";
			PreparedStatement preparedstatement;
			try {
				preparedstatement = connection.prepareStatement(sql);
				preparedstatement.setString(1, firstname);
				preparedstatement.setString(2, lastname);
				preparedstatement.setString(3, email);
				preparedstatement.setString(4, mobileno);
				preparedstatement.executeUpdate();
				System.out.println("User Registered Succesfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

	
}
