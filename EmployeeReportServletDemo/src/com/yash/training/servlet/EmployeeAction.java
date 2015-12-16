package com.yash.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeAction
 */
@WebServlet("/EmployeeAction")
public class EmployeeAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("empName");
		String sal=request.getParameter("empSalary");
		int empSal=Integer.parseInt(sal);
		
			try{
				Class c=Class.forName("com.mysql.jdbc.Driver");
				System.out.println(c);
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","root");
				System.out.println(con);
				String query="insert into employee(name,salary) values ('"+name+"','"+empSal+"')";
				Statement stmt=con.createStatement();
				stmt.executeUpdate(query);
				out.println("Data saved successfully!");
				out.println("<a href='ers'>Show Report</a>");
				
		}
		catch(Exception ex){
			out.println("error is : "+ex.getMessage());
		}
	}
	

}
