package com.yash.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;
import yash.com.domain.Details;

import com.yash.dao.ServiceDao;

/**
 * Servlet implementation class ResponseServlet
 */
@WebServlet("/ResponseServlet")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServiceDao sd=new ServiceDao();
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String mobileno=request.getParameter("mobileno");
		ServletContext context=getServletContext();  
		String email=(String)context.getAttribute("emailid");  
		sd.NewUserRegister(firstname, lastname, mobileno, email);
		out.print("<!DOCTYPE html>");
		out.print("<html><head><meta charset=ISO-8859-1><title>Registration form</title></head><body>");
		out.print("<header><h1>YASH TECHNOLOGIES</h1></header>");
		out.print("<h1>"+firstname+" &nbsp;"+lastname+"</h1>");
		out.println("<h1>You are Complaint is Successfully Registered</h1></body>");
		ServletContext servletcontext=getServletContext();
		RequestDispatcher requestdispatcher=servletcontext.getRequestDispatcher("/FooterServlet");
		requestdispatcher.include(request, response);
	}

}
