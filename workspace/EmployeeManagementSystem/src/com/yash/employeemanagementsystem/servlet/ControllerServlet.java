package com.yash.employeemanagementsystem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.employeemanagementsystem.domain.Employee;
import com.yash.employeemanagementsystem.services.EmployeeServiceImpl;
import com.yash.employeemanagementsystem.services.EmployeeServiceIntf;
import com.yash.employeemanagementsystem.services.ManagerServiceImpl;


@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	@Inject
	EmployeeServiceImpl employeeservice;
	@Inject
	ManagerServiceImpl managerservice;
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html");
		   PrintWriter out=response.getWriter();
		  
		   String buttonid1=request.getParameter("button1");
		   System.out.println(buttonid1);
		   String buttonid2=request.getParameter("button2");
		   System.out.println(buttonid2);
		   String buttonid3=request.getParameter("button3");
		   System.out.println(buttonid3);
		   if("submit".equals(buttonid1)){
			   System.out.println("inside submit");
			   String userid=request.getParameter("userid");
			   System.out.println(userid);
			   int id=Integer.parseInt(userid);
			   
			  List<Employee> list=employeeservice.getEmployeeDetails(id);
			  for(Employee employee: list){
			   out.print("<h1>hi"+employee.getName()+"<h1>"	   
			   		+ "<p>"+employee.getId()+"</p>"
			   		+ "<p>"+employee.getContact()+"</p>"
			   		+ "<p>"+employee.getName()+"</p>"
			   		+ "<p>"+employee.getEmail()+"</p>"
			   		);   
		   }}
		   else if( "GetAllEntries".equals(buttonid2)){
			   System.out.println("inside all entries");
			   out.print("<h1>Getting all entries</h1>");
			  
			   List<Employee> list=managerservice.getAllEnquiryDetails();
			   System.out.println(list);
				  for(Employee employee: list){
				   out.print("<h1>hi"+employee.getName()+"<h1>"	   
				   		+ "<p>"+employee.getId()+"</p>"
				   		+ "<p>"+employee.getContact()+"</p>"
				   		+ "<p>"+employee.getName()+"</p>"
				   		+ "<p>"+employee.getEmail()+"</p>"
				   		);  
				  }
		   }
		   else if( "Registration".equals(buttonid3)){
			   System.out.println("inside Registration");
			   out.print("<h1>Registration form</h1>");
		   }
		   
		  
		   
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
