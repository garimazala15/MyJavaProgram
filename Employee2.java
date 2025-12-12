package com.module;

import java.util.List;

public class Employee2 {
	
	private int id;
	private String empName;
	private double salary;
	private String designation;
	private List<Address> ref;
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee2(int id, String empName, double salary, String designation, List<Address> ref) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
		this.ref = ref;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<Address> getRef() {
		return ref;
	}
	public void setRef(List<Address> ref) {
		this.ref = ref;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", empName=" + empName + ", salary=" + salary + ", designation=" + designation
				+ ", ref=" + ref + "]";
	}
	
	

}
