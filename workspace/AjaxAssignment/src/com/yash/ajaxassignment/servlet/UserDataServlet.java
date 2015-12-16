package com.yash.ajaxassignment.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.ajaxassignment.dao.ServiceDao;
import com.yash.ajaxassignment.domain.User;

/**
 * Servlet implementation class UserDataServlet
 */
@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html"); 
		// TODO Auto-generated method stub
		/*response.setContentType("text/html");
		System.out.println(request.getParameter("userId"));
		int userId=Integer.parseInt(request.getParameter("userId"));
		ServiceDao service=new ServiceDao();
		System.out.println("success");
		User user=service.userDetails(userId);
		PrintWriter out=response.getWriter();
		out.print("User Object:"+user);*/
		 String name=null;
		  name = "UserID: "+request.getParameter("user");
		  System.out.println(name);
		  ServiceDao service=new ServiceDao();
		  int userId=Integer.parseInt(request.getParameter("user"));
		 
		  System.out.println(userId);
		  User users=service.userDetails(userId);
		  System.out.println(users);
		  if(request.getParameter("user").toString().equals("")){
		  name="Hello User";
		  }
		  response.setContentType("text/plain");  
		  response.setCharacterEncoding("UTF-8"); 
		  //response.getWriter().write(name); 
		 PrintWriter out=response.getWriter();
		 out.print("Welcome "+users.getUsername());
		 
		out.println("<html><body><br/>"
				+ "<table>"
				+ "<tr>"
				+ "<th>"
				+ "Id"
				+ "</th>"
				+ "<th>"
				+ "name"
				+ "</th>"
				+ "<th>"
				+ "email"
				+ "</th>"
				+ "<th>"
				+ "type"
				+ "</th>"
				+ "<th>"
				+ "status"
				+ "</th>"
				+ "<th>"
				+ "username"
				+ "</th>"
				+ "<th>"
				+ "password"
				+ "</th>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"+users.getUserId()
				+ "</td>"
				+ "<td>"+users.getName()
				+ "</td>"
				+ "<td>"+users.getEmail()
				+ "</td>"
				+ "<td>"+users.getType()
				+ "</td>"
				+ "<td>"+users.getStatus()
				+ "</td>"
				+ "<td>"+users.getUsername()
				+ "</td>"
				+ "<td>"
				+ "</td>"
				+ "<td>"+users.getPassword()
				+ "</td>"
				+ "</tr>"
				+ "</table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
