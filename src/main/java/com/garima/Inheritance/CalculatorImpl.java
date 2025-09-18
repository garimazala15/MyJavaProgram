package com.garima.Inheritance;

class Calculation{
	protected double z;
	
	public Calculation() {
		super();
	}
	
	public Calculation(double z) {
		this.z=z;
	}
	
	public void add(int x,int y) {
		z=x+y;
		System.out.println("Additon="+z);
	}
	
	public void sub(int x,int y) {
		z=x-y;
		System.out.println("Subtraction="+z);
	}
	
	public void mul(int x,int y) {
		z=x*y;
		System.out.println("Multiplication="+z);
	}
	
	public void div(double x,double y) {
		z=x/y;
		System.out.println("Division="+z);
	}
	
	public void mod(double x,double y) {
		z=x%y;
		System.out.println("Modulus="+z);
	}
	
	public void pow(double x,double y) {
		z=Math.pow(x, y);
		System.out.println("Additon="+z);
	}
}

class My_Calculator extends Calculation{
	public My_Calculator() {}
	
	public My_Calculator(int z) {
		super(z);
	}
}

public class CalculatorImpl {
	public static void main(String[] args) {
		My_Calculator cal=new My_Calculator();
		cal.add(4,5);
		cal.div(70,10);
		cal.mul(8,9);
		cal.mod(77,3);
		cal.sub(80,67);
		cal.pow(5,10);
		
	}

}
