package com.garima.Abstraction;

class Book{
	int bookId;
	String title;
	float price;
	
	public void display() {
		System.out.println(bookId+"-"+title+"-"+price);
	}
}

class Student{
	int id;
	String name;
	Book favBook;
	
	public String toString() {
		String str=id+"-"+name+"-"+favBook.title;
		return str;
	}
}

public class HasARelationship {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.bookId=1;
		b1.title="wings of fire";
		b1.price=250;
		b1.display();
		
		Book b2=new Book();
		b2.bookId=2;
		b2.title="manifestAI";
		b2.price=50;
		b2.display();
		
		b1=null; 

		Student s1=new Student();
		s1.id=101;
		s1.name="Garima";
		s1.favBook=b1;   //null pointer exception
		s1.favBook.display();
		System.out.println(s1);
		

	}

}
