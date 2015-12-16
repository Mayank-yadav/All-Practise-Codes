package com.yash.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.yash.employeemanagementsystem.domain.Employee;
import com.yash.employeenmanagementsystem.util.ConnectionProvider;
import com.yash.employeenmanagementsystem.util.DBUtil;

public class EmployeeServiceDAO {
	@Inject
	DBUtil dbutil;
	
	
	
	public List<Employee> select(String query){
		PreparedStatement preparedstatement;
		
		Connection connection=ConnectionProvider.getConnection();
		List<Employee> list=new ArrayList<Employee>();
		try {
			preparedstatement=connection.prepareStatement(query);
			ResultSet result=preparedstatement.executeQuery();
			while(result.next()){
				Employee employee=new Employee();
				employee.setId(result.getString("id"));
				employee.setName(result.getString("name"));
				employee.setEmail(result.getString("email"));
				employee.setContact(result.getString("contact"));
				list.add(employee);
				connection.close();
			} }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
		
	}
	
	public void Update(String query){
	PreparedStatement preparedstatement;
	Connection connection=ConnectionProvider.getConnection();
	try {
		preparedstatement=connection.prepareStatement(query);
		preparedstatement.executeUpdate();
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
	
	
}
