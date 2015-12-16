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


import yash.com.domain.Complaint;
import yash.com.domain.Details;

import com.yash.dao.ServiceDao;

/**
 * Servlet implementation class TechSupportServlet
 */
@WebServlet("/TechSupportServlet")
public class TechSupportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TechSupportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
				PrintWriter out=response.getWriter();
				String email=request.getParameter("userEmail");
				String software=request.getParameter("software");
				String os=request.getParameter("operatingSystem");
				String description=request.getParameter("description");
				
				out.print("Email:-"+email+"Software:"+software+"Os:-"+os+"Description:-"+description);
				Complaint complaint=new Complaint();
				Details details=new Details();
				ServiceDao sd=new ServiceDao();
				ServletContext servletcontext=getServletContext();
				servletcontext.setAttribute("emailid", email);
			//	System.out.println("value is"+sd.CompareEmail(email));
				if(sd.CompareEmail(email)==true){
					System.out.println("It Exists");
					sd.InsertComplaint(email, software, os, description);
					RequestDispatcher requestdispatcher=servletcontext.getRequestDispatcher("/ResponseServlet");
					System.out.println("going to ResponseServlet");
					requestdispatcher.forward(request, response);
				}
				else{
					details.setEmail(email);
					complaint.setOs(os);
					complaint.setSoftware(software);
					complaint.setDescription(description);
					System.out.println("else loop");
					RequestDispatcher dispatcher=servletcontext.getRequestDispatcher("/RegisterServlet");
					dispatcher.forward(request, response);
				}
				
				
				
	}

}
