package com.yash.jsfassignment.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class UserBean {
private String username;
private String name;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

private String salary;
public String getName() {
	return username;
}
public void setName(String username) {
	this.username = username;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}

public String save(){
	Connection connection;
	 String url="jdbc:mysql://localhost:3306/users";
	 String user="root";
	 String password="root";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			connection=DriverManager.getConnection(url,user,password);
			String sql="Insert Into user values (?,?)";
			System.out.println(username+""+name+""+salary);
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setString(1,username);
			preparedstatement.setString(2, salary);
			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
}

}
