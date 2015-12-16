package com.yash.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewsPersonalizeServlet
 */
@WebServlet("/NewsPersonalizeServlet")
public class NewsPersonalizeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsPersonalizeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String newsToPersonalize=request.getParameter("news");
		Cookie c1=new Cookie("cNews",newsToPersonalize);
		c1.setMaxAge(60); //60 seconds
		response.addCookie(c1);
		
		out.print("-------Cookie is generated-----");
		response.sendRedirect("/NewsPersonalizationProject/NewsServletController");
	}

}
