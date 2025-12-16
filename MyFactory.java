package com.module;

public class MyFactory {
	
	public static MyInf1 getObject() {
		
		MyClass1 c1=new MyClass1();
		MyClass2 c2=new MyClass2();
		
		return c1;
	}

}
