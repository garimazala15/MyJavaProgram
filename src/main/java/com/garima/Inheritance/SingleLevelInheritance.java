package com.garima.Inheritance;

class Area{
	
	protected int l,b;
	
	public Area(){
		super();
	}
	
	public Area(int l,int b) {
		super();
		this.l=l;
		this.b=b;
	}
	
	public int area() {
		return this.l*this.b;
	}
}

class Volume extends Area{
	
	private int h;
	
	public Volume() {}
	
	public Volume(int l,int b,int h) {
		super(l,b);
		this.h=h;
	}
	
	public int volume() {
		return this.area()*this.h;
	}
}


public class SingleLevelInheritance {

	public static void main(String[] args) {
		//Area a=new Area(5,4);
		Volume v=new Volume(5,4,6);
		System.out.println("Area of rectangle is :" + v.area());
		System.out.println("Volume of rectangle is :" + v.volume());

	}
}
