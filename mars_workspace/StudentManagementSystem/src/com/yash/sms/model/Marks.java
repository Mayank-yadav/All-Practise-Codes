package com.yash.sms.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Marks {

	private int Marks_id;
	private int standard;
	private String grade;
	public int getMarks_id() {
		return Marks_id;
	}
	public void setMarks_id(int marks_id) {
		Marks_id = marks_id;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
