package com.yash.sms.services;

import java.util.List;

import com.yash.sms.dao.StudentDAO;
import com.yash.sms.model.Student;

public class StudentServiceImpl implements StudentServiceIntf {

	StudentDAO student=new StudentDAO();
	
	@Override
	public List<Object> sortByCity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> sortByCandidate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> sortBystandard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllData() {
		// TODO Auto-generated method stub
		System.out.println("inside getAllData");
		return student.getAllData();
	}

}
