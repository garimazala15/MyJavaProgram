package com.garima.AccessSpecifier.college;

import com.garima.AccessSpecifier.office.Person;

public class Student extends Person {
	int rollNo;
	
	
	public void init() {
		rollNo=5;
		//name="Amit";    private not accessible outside the class
		//age=17;         default not accessible outside the package
		address="Gwalior"; //protected accessible outside package in inherited classes
		income=75000;
	}

}
