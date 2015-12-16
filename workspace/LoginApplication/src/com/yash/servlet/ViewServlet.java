package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/web/ViewServlet.do")
public class ViewServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException {

PrintWriter out = response.getWriter();
ServletContext context = getServletContext();
Connection connection = (Connection) context.getAttribute("connection");
String customerId = request.getParameter("custId");
String password = request.getParameter("custPassword");

String query = "SELECT * FROM CUSTOMER WHERE cust_id=?";

try {
PreparedStatement preparedStatement = connection.prepareStatement(query);
preparedStatement.setString(1, customerId);

ResultSet resultSet = preparedStatement.executeQuery();

	if (resultSet.next()) {
		String id = resultSet.getString("cust_id");
		String pass=resultSet.getString("cust_pass");

		if(id.equals(customerId) && pass.equals(password)) {
			String name=resultSet.getString("cust_name");
			out.println("<html><body><h1>You successfully logged in : " +name+"</h1></body></html>");
			System.out.println("Login successful");
		} else {

			out.println("<html><body><h1>REGISTER FIRST</h1></body></html>");
			// save(customerName);

		}

	}
	else {

		out.println("<html><body><h1>REGISTER FIRST</h1></body></html>");
		// save(customerName);

	}

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}

}
}