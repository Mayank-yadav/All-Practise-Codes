package com.yash.domain;

public class Enquiry extends Person{
	private String contact;
	int enquiryId;
	String courses;

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses2) {
		this.courses = courses2;
	}

	public int getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(int i) {
		this.enquiryId = i;
	}
}
