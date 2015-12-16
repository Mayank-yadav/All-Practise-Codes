package com.yash.employeemanagementsystem.services;


import java.util.List;

import com.yash.employeemanagementsystem.domain.Employee;

public interface EmployeeServiceIntf {
	public void registerEmployee(String id,String name,String email,String contact);
	public List<Employee> getEmployeeDetails(int id);

}
