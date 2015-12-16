package com.yash.jsf.services;

import javax.inject.Inject;

import com.yash.jsf.dao.ServiceDao;

public class CustomerServiceImpl {
	@Inject
	ServiceDao servicedao;
	public boolean customerAuthentication(String username, String password) {
		String query="Select password From users where username="+username;
		String pass=servicedao.Select(query);
		if(pass.equals(password)){
			return true;
		}
		return false;
	}

}
