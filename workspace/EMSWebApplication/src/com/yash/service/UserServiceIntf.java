package com.yash.service;

import com.yash.domain.User;

public interface UserServiceIntf {

	public boolean userAuthentication(String username,String password);
	public void userRegister(User user);
	public void delUser(String  user);
	public void UpdateUser(String user);
	public int getUserId(String username);
}
