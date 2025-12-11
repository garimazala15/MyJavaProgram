package com.module;

import java.util.List;

public class Student1 {
	
	private int rollno;
	private String name;
	private List<String> subject;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int rollno, String name, List<String> subject) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.subject = subject;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	

}
