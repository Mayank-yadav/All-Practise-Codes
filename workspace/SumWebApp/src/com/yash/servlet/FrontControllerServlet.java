package com.yash.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

/**
 * Servlet implementation class FrontControllerServlet
 */
@WebServlet("/FrontControllerServlet")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print(" <html><head><meta charset=ISO-8859-1><title>Insert title here</title></head><body>");
		/*ServletContext servletcontext=getServletContext();
		RequestDispatcher requestdispatcher=servletcontext.getRequestDispatcher("/SumServlet");
		requestdispatcher.include(request, response);*/
		out.print("<form method=get action=LoopServlet>");
		out.print("<table><tr><td> Number3</td>	<td><input type=text name=number3></td> ");
		//out.print(" </tr><tr><td> Number2</td><td><input type=text name=number2></td>");
		out.print("	</tr><tr><td><button type=submit value=submit >Submit</button></td></tr></table></form> ");
		out.print(" </body></html>");
		
		
	}

}
