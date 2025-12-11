package com.module;

public class Address {
	
	private int hNo;
	private String colony;
	private String city;
	private String state;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int hNo, String colony, String city, String state) {
		super();
		this.hNo = hNo;
		this.colony = colony;
		this.city = city;
		this.state = state;
	}
	public int gethNo() {
		return hNo;
	}
	public void sethNo(int hNo) {
		this.hNo = hNo;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", colony=" + colony + ", city=" + city + ", state=" + state + "]";
	}
	
	
	

}
