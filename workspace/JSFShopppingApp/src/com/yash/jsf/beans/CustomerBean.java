package com.yash.jsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import com.yash.jsf.services.CustomerServiceImpl;
import com.yash.jsf.services.CustomerServiceIntf;



@ManagedBean
@SessionScoped
public class CustomerBean {

	@Inject
	CustomerServiceIntf customerserviceimpl;

	private String password=null,username=null,name=null,contact=null,email=null,address=null,userid=null;

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
		System.out.println(this.username);
		if((customerserviceimpl.customerAuthentication(this.username, this.password))==true){	
		return "shoppingpage";
		}
		else{
			return "index?err=invalid username or password faces-redirect=true";
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String add(){
		System.out.println("inside registration");
		System.out.println("object"+this.address);
		customerserviceimpl.addCustomer(this);
		System.out.println("----");
		return "shoppingpage";
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String endSession(){
		System.out.println("session ends");
		
		 HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
		            .getExternalContext().getSession(false);
		    session.invalidate();		 
		return "index";
	}
	public String reset() {
	    HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
	            .getExternalContext().getSession(false);
	    session.invalidate();
	    return "index";
	}
}
