package com.yash.rest.domain;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class Customer {
	@GET
	@Path("/plain")
	  @Produces(MediaType.TEXT_PLAIN)
	  public String plainTextHello() {
		System.out.println("plain Text method is called");
	    return "Hello mayank";
	  }
	
	@GET
	@Path("/xml")
	@Produces(MediaType.APPLICATION_XML)
	public String xmlHello(){
		return "<?xml version=\"1.0\"?>" + "<hello> Hello World" + "</hello>";
	}
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)  
	public String message(){
		System.out.println("inside message");
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list);
		return list.toString();
		
	}
	
}
