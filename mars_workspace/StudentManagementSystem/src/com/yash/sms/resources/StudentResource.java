package com.yash.sms.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.yash.sms.model.Marks;
import com.yash.sms.model.Student;
import com.yash.sms.services.StudentServiceImpl;

@Path("/resources")
public class StudentResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/all")
	public ArrayList<Student> getAllData(){
		StudentServiceImpl studentService=new StudentServiceImpl();
		System.out.println("inside getalldata");
		//return studentService.getAllData();
		return  new ArrayList<>(studentService.getAllData());
	}
	
	public List<Student> OrderByCity(){
		return null;
		
	}
	
	public List<Student> OrderByCandidate(){
		return null;
		
	}
	
	public List<Marks> OrderByStandard(){
		return null;
		
	}
}
