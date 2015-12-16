package com.yash.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTag extends TagSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String customerform;
	

	public String getCustomerform() {
		return customerform;
	}

	public void setCustomerform(String customerform) {
		this.customerform = customerform;
	}

	
	public int doStartTag() throws JspException {
		try {
			
			
			JspWriter out = pageContext.getOut();
			out.println("  <style>body{ background-image:url(http://blog.parhammajd.co.uk/wp-content/uploads/2013/05/Intro1.jpg) }</style><form name='form' method='get' action='FrontControllerServlet'>");
			out.println("<table border=1 cellpadding=3 >");
			out.println("<tr><td>Enter Name:</td><td><input type='text' name='name' </td></tr>");
			out.println("<tr><td>Enter Id:</td><td><input type='text' name='id' </td></tr>");
			out.println("<tr><td>Enter Address:</td><td><input type='text' name='address' </td></tr>");
			out.println("</tr><td><input type='submit' name='submit' value='Submit'></td></tr>");
			out.println("</table>");
			out.println("</form>");
		//	out.println("<Font color=" + color + ">" + text + "</Font>");
		} catch (Exception ioException) {
			System.err.println("IO Exception");
			System.err.println("ioException.toString()");
		}
		return SKIP_BODY;
	}

}
