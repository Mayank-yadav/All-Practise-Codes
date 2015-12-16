package com.yash.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.domain.Person;
import com.yash.domain.User;
import com.yash.service.UserServiceImpl;

/**
 * Servlet implementation class RegistrationActionServlet
 */
@WebServlet("/RegistrationActionServlet")
public class RegistrationActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String username=request.getParameter("username");
		String password=request.getParameter("setpassword");
		String type=request.getParameter("settype");
		String status=request.getParameter("setstatus");
		User user=new User();
		
		user.setPassword(password);
		user.setUsername(username);
		user.setEmail(email);
		user.setName(name);
		user.setStatus(status);
		user.setType(type);
		UserServiceImpl usi=new UserServiceImpl();
		usi.userRegister(user);
		request.setAttribute("username", username);
		request.getRequestDispatcher("/UserPage.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
