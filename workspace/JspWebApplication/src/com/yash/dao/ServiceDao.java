package com.yash.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.yash.domain.Customer;
import com.yash.util.MyConnection;

public class ServiceDao {
	private static Connection connection=null;
	
	public ArrayList<Customer> SearchCustomerNum(String cnum){
		Connection connection=MyConnection.getConnection();
		String sql="Select * From customer where cnum=?";
		PreparedStatement preparedstatement;

		try {
			preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setString(1, cnum);
			ResultSet rs=preparedstatement.executeQuery();
			ArrayList<Customer> arraylist=new ArrayList<Customer>();
			while(rs.next()){
				Customer customer=new Customer();
				System.out.println("in SearchNum()");
				String cname=rs.getString("cname");
				String city=rs.getString("city");
				String snum=rs.getString("snum");
				String rating=rs.getString("rating");
				customer.setCnum(cnum);
				customer.setCity(city);
				customer.setCname(cname);
				customer.setRating(rating);
				customer.setSnum(snum);
				arraylist.add(customer);
			}
			return arraylist;
		} catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

	public ArrayList<Customer> getAllEntries() {
		// TODO Auto-generated method stub
		Connection connection=MyConnection.getConnection();
		String sql="Select * From customer ";
		PreparedStatement preparedstatement;
		ArrayList<Customer> arraylist=new ArrayList<Customer>();
		try {
			System.out.println("in getAllEntries()");
			preparedstatement = connection.prepareStatement(sql);
			ResultSet rs=preparedstatement.executeQuery();
			
			
			while(rs.next()){
			Customer customer=new Customer();
			String cnum=rs.getString("cnum");
			String cname=rs.getString("cname");
			String city=rs.getString("city");
			String snum=rs.getString("snum");
			String rating=rs.getString("rating");
			customer.setCnum(cnum);
			customer.setCity(city);
			customer.setCname(cname);
			customer.setRating(rating);
			customer.setSnum(snum);
			arraylist.add(customer);
			
			}
			return arraylist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
