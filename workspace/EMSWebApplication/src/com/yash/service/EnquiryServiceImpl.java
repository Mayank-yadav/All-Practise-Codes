package com.yash.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.domain.Enquiry;
import com.yash.domain.User;
import com.yash.util.ConnectDB;

public class EnquiryServiceImpl implements EnquiryServiceIntf {

	@Override
	public void addEnquiry(Enquiry enquiry,int userid) {
		// TODO Auto-generated method stub
		Connection connection=ConnectDB.getConnection();
		String query="Insert into enquiry(name,userid,email,contact,courses) values(?,?,?,?,?) ";
		PreparedStatement preparedstatement;
		try {
			preparedstatement=connection.prepareStatement(query);
			System.out.println(""+enquiry.getName());
			System.out.println(""+userid);
			preparedstatement.setString(1,enquiry.getName());
			preparedstatement.setInt(2,userid);
			preparedstatement.setString(3, enquiry.getEmail());
			preparedstatement.setString(4, enquiry.getContact());
			preparedstatement.setString(5, enquiry.getCourses());
			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEnquiry(User user) {
		
		
	}

	@Override
	public ArrayList<Enquiry> getEnquiryDetails(int userid) {
		// TODO Auto-generated method stub
		List<Enquiry> list=new ArrayList<Enquiry>();
		Connection connection=ConnectDB.getConnection();
		String query="Select * from enquiry where userid=?";
		PreparedStatement preparedstatement;
		
		try {
			 preparedstatement=connection.prepareStatement(query);
			 preparedstatement.setInt(1, userid);
			 ResultSet rs=preparedstatement.executeQuery();
			 User user=new User();
			 
			 while(rs.next()){
				 int count=0;
				 System.out.println(" count : " + count++);
				 Enquiry enquiry=new Enquiry();
				 enquiry.setEnquiryId(rs.getInt("enquiryid"));
				 enquiry.setContact(rs.getString("contact"));
				 enquiry.setCourses(rs.getString("courses"));
				 enquiry.setEmail(rs.getString("email"));
				 enquiry.setName(rs.getString("name"));
				 user.setUserId(userid);
				 list.add(enquiry);
				 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (ArrayList<Enquiry>) list;
				
	}

	@Override
	public void updateEnquiry(String userid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEnquiryDetails(String userid) {
		// TODO Auto-generated method stub
		
	}





}
