package com.garima.Interface;

//functional interface
interface Welcome{
	void sayHello(String name); //it can have one abstract method
}
public class LambdaImpl {
	public static void main(String[] args) {
		Welcome w1=(name)->System.out.println("Welcome to India "+name);
		w1.sayHello("Garima");
	}

}
