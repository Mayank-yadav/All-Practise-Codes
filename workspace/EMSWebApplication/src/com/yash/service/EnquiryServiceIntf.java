package com.yash.service;

import java.util.ArrayList;

import com.yash.domain.Enquiry;
import com.yash.domain.User;

public interface EnquiryServiceIntf {

	public void addEnquiry(Enquiry enquiry,int userid);
	public void deleteEnquiry(User user);
	public ArrayList<Enquiry> getEnquiryDetails(int userid);
	public void getAllEnquiryDetails(String userid);
	public void updateEnquiry(String userid);
}
