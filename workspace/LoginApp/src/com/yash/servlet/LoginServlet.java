package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		 PrintWriter out=resp.getWriter();
		 Properties prop= (Properties) getServletContext().getAttribute("properties");
		 String id=prop.getProperty("customer.id");
		 System.out.println(id);
		 out.print("<html><body>");
		 out.print("<h1>Login Page</h1>");
		 out.print("<form method=post");
		 out.print("<table border=1><tr><th>Customer Name</th><td><input type=text name=custname></td></tr>");
			out.print("<tr><th>"+prop.getProperty("customer.id"));	
			out.print("</th><td><input type=text name=custid></td></tr>");
			out.print("<tr><th>"+prop.getProperty("customer.password"));
			out.print("</th><td><input type=text name=custpass></td></tr>");
			out.print("<tr><td><Button type=submit value=submit>Submit</Button></td></tr>");
			out.print("</form></body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
