package com.yash.jsf.services;

import javax.inject.Inject;

import com.yash.jsf.beans.CustomerBean;
import com.yash.jsf.dao.ServiceDao;

public class CustomerServiceImpl implements CustomerServiceIntf {
	
	@Inject
	ServiceDao servicedao;
	
	
	
	@Override
	public boolean customerAuthentication(String username, String password) {
		System.out.println("inside service"+username);
		String query="Select password From users where username=('"+username+"')";
		System.out.println(query);
		String pass=servicedao.Select(query);
		if(password.equals(pass)){
			return true;
		}
		else{
			return false;
		}
	}
	
	@Override
	public void addCustomer(CustomerBean customer) {

		String query="Insert into users(name,contact,email,address,username,password) values (' "
				+customer.getName()
				+"','"
				+ customer.getContact()
				+"','"
				+ customer.getEmail()
				+"','"
				+customer.getAddress()
				+"','"
				+ customer.getUsername()
				+"','"
				+ customer.getPassword()+"')";
		System.out.println(query);
		servicedao.Update(query);
	}

	
}
