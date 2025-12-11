package com.module;

public class Employee {
	
	private int id;
	private String empName;
	private double salary;
	private String designation;
	private Address ref;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(int id, String empName, double salary, String designation, Address ref) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
		this.ref = ref;
	}


	


	public Address getRef() {
		return ref;
	}


	public void setRef(Address ref) {
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


	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + ", designation=" + designation
				+ ", ref=" + ref + "]";
	}


	
	
	
	
	
	
	

}
