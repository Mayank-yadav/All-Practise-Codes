package com.yash.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.domain.Enquiry;
import com.yash.domain.Person;
import com.yash.domain.User;
import com.yash.service.EnquiryServiceImpl;

/**
 * Servlet implementation class EnquiryActionServlet
 */
@WebServlet("/EnquiryActionServlet")
public class EnquiryActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnquiryActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name,email,contact;
		int userId;
		String courses=request.getParameter("courses");
		name=request.getParameter("name");
		email=request.getParameter("email");
		contact=request.getParameter("contact");
		HttpSession session=request.getSession();
		userId=(int) session.getAttribute("userId");
		Enquiry newenquiry=new Enquiry();
		
		System.out.println(userId);
		newenquiry.setEmail(email);
		newenquiry.setName(name);
		newenquiry.setContact(contact);
		newenquiry.setCourses(courses);
		EnquiryServiceImpl esi=new EnquiryServiceImpl();
		esi.addEnquiry( newenquiry, userId);
		
		if(esi.getEnquiryDetails(userId)!=null){
		ArrayList<Enquiry> list=esi.getEnquiryDetails(userId);
		
		System.out.println(list);
		
		
		
		request.setAttribute("lists", list);
		}
		request.getRequestDispatcher("/UserPage.jsp").forward(request, response);
		//esi.getEnquiryDetails(userid);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
