package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.dao.ServiceDao;
import com.yash.domain.Customer;

/**
 * Servlet implementation class CustomerServlet
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	PrintWriter out=response.getWriter();
		String cnum=request.getParameter("custnum");
		
		ServiceDao sd=new ServiceDao();
		//request.setAttribute("cnum", cnum);
		System.out.println("in doget()");
		if(cnum==""){
			ArrayList<Customer> list=sd.getAllEntries();
			request.setAttribute("customer", list);
			request.getRequestDispatcher("/CusomerJstl.jsp").forward(request, response);
			
			
		}
		else{
			ArrayList<Customer> list=sd.SearchCustomerNum(cnum);
			request.setAttribute("customer", list);
			request.getRequestDispatcher("/CustomerView.jsp").forward(request, response);
		}
		
	}

	

}
