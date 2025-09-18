package com.garima.AccessSpecifier.college;

import com.garima.AccessSpecifier.office.*;

public class Demo {
	public static void main(String[] args) {
		Person p2=new Person();
		//p2.name="Leena";  //default not accessible outside package
		//p2.age=13;  //private not accessible outside class
		//p2.address="Bhopal";  //protected not accessible outside package
		p2.income=50000;
	}

}
