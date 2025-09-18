package com.garima.Polymorphism;

class Student{
	int rollno;
	String name;
	
	//overriding Object (parent) class method
	public String toString() {
		String str=name+"-"+rollno;
		return str;
	}
	
	//overriding Object (parent) class method
	public boolean equals(Object obj) {
		Student stu=(Student)obj;
		if(this.rollno==stu.rollno)
			return true;
		else
			return false;
	}
	
}

public class MethodOverridingImpl2 {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="Garima";
		s1.rollno=101;
		System.out.println(s1);
		
		Student s2=new Student();
		s2.name="Abhay";
		s2.rollno=101;
		System.out.println(s2);
		boolean result=s1.equals(s2);
		System.out.println(result);
	}

}
