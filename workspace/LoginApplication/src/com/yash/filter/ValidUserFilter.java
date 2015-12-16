package com.yash.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;






/**
 * Servlet Filter implementation class ValidUserFilter
 */
@WebFilter("/web/*")
public class ValidUserFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ValidUserFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		HttpServletRequest request=(HttpServletRequest)req;
		String UrlPath=request.getRequestURL().substring(request.getContextPath().length());
		java.util.regex.Pattern pattern=java.util.regex.Pattern.compile(".do");
		java.util.regex.Matcher match=pattern.matcher(UrlPath);
		boolean ok=match.find();
		if(ok){   
			System.out.println("valid user");    
			chain.doFilter(request, response);
		}
		// pass the request along the filter chain
		
		else{
			PrintWriter out=response.getWriter();
			out.print("<h1>Enter Valid URL</h1>");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
