package com.yash.jsfadvanceform.beans;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@ManagedBean
@RequestScoped
@Named
public class EmployeeBean {
	private String name;
	private int contact;
	private String gender;
	private String email;
	private String address;
	private String dob;
	private String experience;
	private String[] technologies;
	private boolean accept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experince) {
		this.experience = experince;
	}

	public String[] getTechnologies() {
		return technologies;
	}

	public boolean isAccept() {
		return accept;
	}

	public void setAccept(boolean accept) {
		this.accept = accept;
	}

	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}

	public void saveEmployee() throws Exception {
		Connection connection;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/employee";
		String user = "root";
		String password = "root";
		Class.forName(driver);
		connection = DriverManager.getConnection(url, user, password);
		String techno = String.join(" , " , this.technologies);
		String query = "INSERT INTO employee VALUES('" + this.name + "','"
				+ this.contact + "','" + this.gender + "','" + this.email
				+ "','" + this.address + "','" + this.dob + "','"
				+ this.experience + "','" + techno + "','"
				+ this.accept + "')";
		System.out.println(query);
		PreparedStatement preparedStatement = connection
				.prepareStatement(query);
		preparedStatement.executeUpdate();
		connection.close();
	}

	public void resetEmployee() {
		this.name=null;
		this.accept=false;
		this.address=null;
		this.dob=null;
		this.contact=0;
		this.gender=null;
		this.email=null;
		this.experience=null;
		this.technologies=null;
		
	}

}
