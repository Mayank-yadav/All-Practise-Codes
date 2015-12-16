package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		PrintWriter out = response.getWriter();
		Properties properties = (Properties) context.getAttribute("properties");
		response.setContentType("text/html");

		// Connection connection = (Connection)
		// context.getAttribute("connection");

		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println(properties.getProperty("title"));
		out.println("<form action='/web/ViewServlet.do' method='get'>");
		out.println("" + properties.getProperty("customerId") + "");
		out.println("<input type ='text' name='custId'><br/>");
		out.println("" + properties.getProperty("customerPassword") + "");
		out.println("<input type ='text' name='custPassword'><br/>");
		out.println("<input type ='submit' value='submit'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
