package com.yash.employeemanagementsystem.services;


import java.util.List;

import javax.inject.Inject;

import com.yash.employeemanagementsystem.dao.EmployeeServiceDAO;
import com.yash.employeemanagementsystem.domain.Employee;
import com.yash.employeenmanagementsystem.util.DBUtil;

public class EmployeeServiceImpl implements EmployeeServiceIntf{

	@Inject
	DBUtil dbutil;
	
	@Inject
	EmployeeServiceDAO employeeservice;
	
	@Inject
	Employee employee;
	
	

	/*@Override
	public Employee getEmployeeDetails(int id) {
		// TODO Auto-generated method stub
		String query="Select * from employeedb where id= "+id;
		//Employee employee=new Employee();
	
		ResultSet result=dbutil.select(query);
		
		try {
			while(result.next()){
				employee.setId(result.getString("id"));
				employee.setName(result.getString("name"));
				employee.setEmail(result.getString("email"));
				employee.setContact(result.getString("contact"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}
*/
	public List<Employee> getEmployeeDetails(int id) {
		String query="Select * from employeedb where id= "+id;
		List<Employee> list=employeeservice.select(query);
		return list;
		
		
		
	}

	@Override
	public void registerEmployee(String id, String name, String email,
			String contact) {
		// TODO Auto-generated method stub
		String query="Insert Into employeedb (id,name,email,contact)values=("+id+","+name+","+email+","+contact+")";
		employeeservice.Update(query);
	}
}
