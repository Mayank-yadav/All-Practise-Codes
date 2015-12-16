package com.yash.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import com.yash.domain.Enquiry;
import com.yash.domain.Person;
import com.yash.domain.User;
import com.yash.service.EnquiryServiceImpl;
import com.yash.service.UserServiceImpl;

/**
 * Servlet implementation class LoginActionServlet
 */
@WebServlet("/LoginActionServlet")
public class LoginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		UserServiceImpl us=new UserServiceImpl();
		if(us.userAuthentication(username, password)==true){
			System.out.println("authenticated");
			int userid=us.getUserId(username);
			System.out.println(us.getUserId(username));
			session.setAttribute("userId", userid);
			request.setAttribute("userid",userid);
			session.setAttribute("username", username);
			
			EnquiryServiceImpl esi=new EnquiryServiceImpl();
			if(esi.getEnquiryDetails(userid)!=null){
			ArrayList<Enquiry> list=esi.getEnquiryDetails(userid);
			
			System.out.println(list);
			
			
			
			request.setAttribute("lists", list);
			/*
			for(int i=0;i<list.size();i++){
				Object obj=list.get(i);
				if(obj instanceof Enquiry){
					Enquiry enquiry=(Enquiry)obj;
					
					request.setAttribute("enquiries", enquiry);
				}
				else if(obj instanceof Person){
					Person person=(Person)obj;
					request.setAttribute("persons", person);
				}
				else if(obj instanceof User){
					User users=(User)obj;
					request.setAttribute("users",users);
				}
				}*/
			}
			System.out.println("loginservlet end");
			request.getRequestDispatcher("/UserPage.jsp").forward(request, response);
		}
		else{
			request.getRequestDispatcher("/Registration.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
