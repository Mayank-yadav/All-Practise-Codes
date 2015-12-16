package com.yash.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.domain.Customer;

public class Helper {

	public void doProcess(HttpServletRequest request,HttpServletResponse response,Customer customer){
		System.out.println(request);
		System.out.println(response);
		System.out.println(customer.getAddress()+" "+customer.getId()+" "+customer.getName());
		request.setAttribute("customer", customer);
		try {
			request.getRequestDispatcher("/Display.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
