package com.yash.rest.services;

import java.util.List;

import com.yash.rest.domain.User;

public class UserService {

	User user=new User();
	
	public String getUsers(){
		return user.getAllUsers();
	}
	
}
