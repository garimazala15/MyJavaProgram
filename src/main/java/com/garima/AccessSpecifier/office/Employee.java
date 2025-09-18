package com.garima.AccessSpecifier.office;

public class Employee extends Person {
	
	int emp_id;
	String dob;
	
	public void show() {
		System.out.println(name+"-"+"-"+address+"-"+income); 
		// System.out.println(age);      //age not accessible
		System.out.println(emp_id+"-"+dob);
	}

}
