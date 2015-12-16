package com.yash.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.rest.domain.User;

@Path("/userservice")
public class UserService {

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(){
		User user=new User(1,12000,"mayank");
		System.out.println("getUser called");
		return user;
	}
	
	
	
}
