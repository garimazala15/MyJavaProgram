package com.garima.Abstraction;

abstract class Animal{
	public Animal() {}
	
	public Animal(String name) {
		this.name=name;
		
	}
	String name;
	void show() {
		System.out.println("I am "+name);
	}
	abstract void saySomething();
}

class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	void eat() {
		System.out.println("Eats biscuits......");
	}
	
	void saySomething() {
		System.out.println("Bho Bho........");
	}
}

class Cat extends Animal{
	
	public Cat(String name) {
		super(name);
	}
	void eat() {
		System.out.println("Drinking milk......");
	}
	
	void saySomething() {
		System.out.println("Meow Meow........");
	}
}


public class AbstractionImpl {
	public static void main(String[] args) {
		Dog d=new Dog("Brownie");
		//d.name="brownie";
		d.show();
		d.eat();
		d.saySomething();
		
		Cat c=new Cat("Tusky");
		//c.name="Tusky";
		c.show();
		c.eat();
		c.saySomething();
	}

}
