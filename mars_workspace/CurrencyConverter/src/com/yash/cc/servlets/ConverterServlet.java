package com.yash.cc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.cc.beans.UserServiceBeanLocal;

/**
 * Servlet implementation class ConverterServlet
 */
@WebServlet("/ConverterServlet")
public class ConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
   private UserServiceBeanLocal usbl;
    public ConverterServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		double result = 0.0;
		  String cType = request.getParameter("currType");
		  String cValue = request.getParameter("currValue");
		  response.setContentType("text/html;charset=UTF-8");
		  PrintWriter out = response.getWriter();
		  out.println("<html>");
		  out.println("<head>");
		  out.println("<title>Servlet convertEJB</title>");
		  out.println("</head>");
		  out.println("<body>");
		  out.println("<h1> The dollar is converted to " + cType);
		  result = usbl.convert(cType, cValue);
		  out.println("" + result);
		  out.println("<br><a href=index.html>Try again</a>");
		  out.println("</h1></body>");
		  out.println("</html>");
		  out.close();
		
		
	}

}
