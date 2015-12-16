package com.yash.rest.Services;

import java.io.BufferedReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.rest.domain.User;


@Path("/userservice")
public class UserServices {

	
	User user=new User();
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public String getAllUsers(){
		return user.getUsers();
	}
	
	@GET
	@Path("/jsons")
	@Produces(MediaType.APPLICATION_JSON)  
	public String message(){
		System.out.println("inside message");
		List<User> list=new ArrayList<User>();
		User user=new User();
		user.setId(1);
		user.setName("mayank");
		user.setSalary(120000);
		list.add(user);
		System.out.println(list);
		return list.toString();
		
	}
}
