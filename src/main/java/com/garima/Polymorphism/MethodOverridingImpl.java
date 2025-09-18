package com.garima.Polymorphism;

import java.util.Scanner;

class OneBHK{
	float room,hall,kitchen,area;
	String address;
	
	public OneBHK() {
		System.out.println("One BHK");
	}
	
	 void findArea() {
		area=hall+kitchen+room;
		System.out.println("One bhk size= "+area);
	}
}

class TwoBHK extends OneBHK{
	float secondRoom;
	public TwoBHK() {
		System.out.println("Two BHK");
	}
	
	void findArea() {
		area=hall+room+secondRoom+kitchen;
		System.out.println("Two bhk size= "+area);
	}
	
}

public class MethodOverridingImpl {
	public static void main(String[] args) {
		OneBHK o1=new OneBHK();
		o1.address="Palasia";
		o1.hall=150;
		o1.room=300;
		o1.kitchen=200;
		o1.findArea();
		
		TwoBHK t1=new TwoBHK();
		t1.address="vijay nagar";
		t1.hall=200;
		t1.kitchen=150;
		t1.room=300;
		t1.secondRoom=300;
		t1.findArea();
		
		//TwoBHK flat=new OneBHK();  //cannot convert twobhk into onebhk
		
		//OneBHK flat=new TwoBHK();   //assign child object to parent reference upcasting
		
		//dynamic polymorphsim
		OneBHK flat=null;  //reference
		
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Enter your choice:");
		System.out.println("1.OneBHK");
		System.out.println("2.TwoBHK");
		
		ch=sc.nextInt();
		
		if(ch==1)
			flat=o1;
		if(ch==2)
			flat=t1;
		/*
		 * flat.hall=200; flat.room=150; flat.kitchen=300;
		 */
		flat.findArea();
		
	}

}
