package com.yash.sms.services;

import java.util.List;

import com.yash.sms.model.Student;

public interface StudentServiceIntf {

	public List<Object> sortByCity();
	public List<Object> sortByCandidate();
	public List<Object> sortBystandard();
	public List<Student> getAllData();
}
