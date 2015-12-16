package com.yash.jsf.services;

import com.yash.jsf.beans.CustomerBean;


public interface CustomerServiceIntf {
	public boolean customerAuthentication(String username,String password);
	public void addCustomer(CustomerBean customer);
}
