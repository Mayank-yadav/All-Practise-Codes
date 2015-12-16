package com.yash.domain;

public class Customer {

	@Override
	public String toString() {
		return "Customer [cnum=" + cnum + ", cname=" + cname + ", city=" + city
				+ ", snum=" + snum + ", rating=" + rating + "]";
	}

	String cnum,cname,city,snum,rating;

	public String getCnum() {
		return cnum;
	}

	public void setCnum(String cnum) {
		this.cnum = cnum;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
}
