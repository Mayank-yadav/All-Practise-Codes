package com.yash.employeemanagementsystem.services;

import java.util.List;

import com.yash.employeemanagementsystem.domain.Employee;

public interface ManagerServiceIntf {

	public void updateEmployeeDetails();
	public void deleteEmployeeRecord();
	public List<Employee> getAllEnquiryDetails();
}
