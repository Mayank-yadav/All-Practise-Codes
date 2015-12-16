package com.yash.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.yash.jsf.services.CustomerServiceImpl;



@ManagedBean(name="customerBean")
@SessionScoped
public class CustomerBean {

@Inject
CustomerServiceImpl customerserviceimpl;
	private String password,username,name,contact,email;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String LoginAction(){
		if((customerserviceimpl.customerAuthentication(this.username, this.password))==true){	
		return "welcome";
		}
		else{
			return "registration";
		}
		
	}
	

}
