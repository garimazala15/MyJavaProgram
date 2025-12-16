package com.module;

import java.lang.reflect.Constructor;

public class mySingletone {
	
	private static final mySingletone obj=new mySingletone();  //object reference
	
	private mySingletone() {
		System.out.println("deafult constructor.........");
	}
	
	//static method to return object reference
	public static mySingletone getObj() {
		System.out.println("Factory method............");
		return obj;
	}
	
	public void display() {
		System.out.println("hello this is mySingletone display");
	}
	
	

}
