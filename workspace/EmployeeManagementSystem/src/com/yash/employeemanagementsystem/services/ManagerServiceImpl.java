package com.yash.employeemanagementsystem.services;

import java.util.List;

import javax.inject.Inject;

import com.yash.employeemanagementsystem.dao.ManagerServiceDAO;
import com.yash.employeemanagementsystem.domain.Employee;

public class ManagerServiceImpl implements ManagerServiceIntf{
	@Inject
	ManagerServiceDAO managerservice;
	
	@Override
	public void updateEmployeeDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeRecord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEnquiryDetails() {
		String query="Select * from employeedb ";
		List<Employee> list=managerservice.select(query);
		return list;
		
		
		
		// TODO Auto-generated method stub
		
		
	}

}
