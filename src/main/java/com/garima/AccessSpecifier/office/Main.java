package com.garima.AccessSpecifier.office;

public class Main {
	public static void main(String[] args) {
		Person p=new Person();
		p.name="ajay";
		//p.age=21;  private not accessible outside the class
		p.address="Indore";
		p.income=25000;
		
	}

}
