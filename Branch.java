package com.module;

public class Branch {
	private int id;
	private String name;
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + "]";
	}
	
	

}
