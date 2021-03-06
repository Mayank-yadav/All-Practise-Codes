package com.yash.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.domain.Employee;
import com.yash.util.ConnectDB;

public class EmployeeServiceDao {
	public List<Employee> Select(String query){
		Connection connection= ConnectDB.getConnection();
		PreparedStatement preparedstatement ;
	
		List<Employee> employees=new ArrayList<>();
		try {
			preparedstatement=connection.prepareStatement(query);
			 ResultSet resultset=preparedstatement.executeQuery();
			 while(resultset.next()){
				 Employee employee=new Employee();
				 employee.setId(resultset.getInt("id"));
				 employee.setEmployeeName(resultset.getString("name"));
				 employee.setSalary(resultset.getInt("salary"));
				 employees.add(employee);
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
		return employees;
		
	}
	
	public void Update(String query){
		Connection connection= ConnectDB.getConnection();
		PreparedStatement preparedstatement = null ;
		try {
			System.out.println("inside dao"+query);
			preparedstatement=connection.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			preparedstatement.executeUpdate();
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
	}
	
}
