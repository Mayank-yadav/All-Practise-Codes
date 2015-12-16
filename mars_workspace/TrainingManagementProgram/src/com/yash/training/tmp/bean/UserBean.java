package com.yash.training.tmp.bean;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import com.yash.cc.beans.UserServiceBeanLocal;

@ManagedBean
@RequestScoped
public class UserBean {
	
	@EJB
	UserServiceBeanLocal userservicebean;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
