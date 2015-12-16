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

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html><head><meta charset=ISO-8859-1><title>Registration form</title></head><body>");
		
		out.print("<form method=post action=ResponseServlet>");
		out.print("<table border=1><tr><th>FirstName</th><td><input type=text name=firstname></td></tr>");
		out.print("<tr><th>LastName</th><td><input type=text name=lastname></td></tr>");
		out.print("<tr><th>Mobile No:</th><td><input type=text name=mobileno></td></tr>");
		out.print("<tr><td><Button type=submit value=submit>Submit</Button></td></tr>");
		out.print("</form></body></html>");
		
	}

}
