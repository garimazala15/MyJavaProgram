package com.garima.AccessSpecifier.office;

public class Person {
	String name;
	private int age;
	protected String address;
	public double income;
	
	public void display() {
		System.out.println(name+"-"+age+"-"+address+"-"+income);
	}

}
