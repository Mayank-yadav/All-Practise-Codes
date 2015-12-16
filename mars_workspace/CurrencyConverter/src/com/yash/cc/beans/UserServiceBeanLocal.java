package com.yash.cc.beans;

import javax.ejb.Local;

@Local
public interface UserServiceBeanLocal {
	 public double convert(String currType, String currValue);
}
