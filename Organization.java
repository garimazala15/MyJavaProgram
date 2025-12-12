package com.module;

import java.util.Map;

public class Organization {
	
	private int id;
	private String name;
	private Map<Employee2,Branch>data;
	
	
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organization(int id, String name, Map<Employee2, Branch> data) {
		super();
		this.id = id;
		this.name = name;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Employee2, Branch> getData() {
		return data;
	}

	public void setData(Map<Employee2, Branch> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", data=" + data + "]";
	}
	
	

}
