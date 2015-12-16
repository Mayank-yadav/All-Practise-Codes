package com.yash.service;

import java.util.List;

import com.yash.dao.EmployeeServiceDao;
import com.yash.domain.Employee;

public class EmployeeService implements EmployeeServiceIntf {

	
	
	@Override
	public void addEmployee(Employee employee) {
		EmployeeServiceDao employeeservicedao=new EmployeeServiceDao();
		String query="Insert into employee(name,salary) values('"+employee.getEmployeeName()+"','"+employee.getSalary()+"'  )";
		System.out.println(query);
		employeeservicedao.Update(query);
		System.out.println("------------added----------------");
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		EmployeeServiceDao employeeservicedao=new EmployeeServiceDao();
		String query="Delete * from employee where id='"+employeeId+"'";
		employeeservicedao.Update(query);
		System.out.println("--------deleted-----------");
		}

	@Override
	public int getEmployeeId(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public List<Employee> getAllDetails() {
		EmployeeServiceDao employeeservicedao=new EmployeeServiceDao();
		String query="Select * from employee";
		List<Employee> list=employeeservicedao.Select(query);
		
		return list;
	}

	@Override
	public List<Employee> getEmployeedetails(int id) {
		EmployeeServiceDao employeeservicedao=new EmployeeServiceDao();

		String query="Select * from employee where id='"+id+"'";
		System.out.println(query);
		List<Employee> list=employeeservicedao.Select(query);
		return list;
	}

	@Override
	public void updateEmployee(Employee employee) {
		EmployeeServiceDao employeeservicedao=new EmployeeServiceDao();
		String query="Update employee SET name='"+employee.getEmployeeName()+"',salary='"+employee.getSalary()+"' where id="+employee.getId();
		employeeservicedao.Update(query);
		System.out.println("-------------Updated--------------");
		
	}

	
	
}
