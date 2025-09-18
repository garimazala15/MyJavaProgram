package com.garima.Interface;

interface Fan{
	void rotate();
	void start();
	void stop();
	int blades=3;
}

class Bajaj implements Fan{
	public void rotate() {
		System.out.println("Bajaj fan rotating");
	}
	public void start() {
		System.out.println("Fan with blades=3 started");
	}
	public void stop() {
		System.out.println("Fan stopped");
	}
}
public class InterfaceImpl {
	public static void main(String[] args) {
		Bajaj b=new Bajaj();
		b.start();
		b.rotate();
		b.stop();
	}

}
