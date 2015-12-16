package com.yash.beans;

import java.sql.Date;

public class CustomerBean {

private String name,department;
private int salary;
private Date joiningDate;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Date getJoiningDate() {
	return joiningDate;
}
public void setJoiningDate(Date joiningDate) {
	this.joiningDate = joiningDate;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}


}
