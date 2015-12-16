package com.yash.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ers")
public class EmployeeReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
    	
		PrintWriter out=response.getWriter();
		try{
			Class c=Class.forName("com.mysql.jdbc.Driver");
			System.out.println(c);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","root");
			System.out.println(con);
			String query="select * from employee";
			PreparedStatement pst= con.prepareStatement(query);
			ResultSet rs=pst.executeQuery();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Employee Report Servlet</title>");
			out.println("</head>");
			out.println("<body>");
			
			out.println("<h1>Employee Report</h1>");
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<th>ID</th><th>Name</th><th>Salary</th>");
			out.println("</tr>");
			while(rs.next()){
				
				out.println("<tr>");
				out.println("<th>"+rs.getInt(1)+"</th><th>"+rs.getString(2)+"</th><th>"+rs.getInt(3)+"</th>");
				out.println("</tr>");
				
			}
			out.println("</table>");
			out.println("<a href='employeeform.html'>Add New Employee</a>");
			out.println("</body>");
			out.println("</html>");
		}
		catch(Exception ex){
			ex.printStackTrace();
			out.println("error is  : "+ex.getMessage());
		}
		
	}

}
