package com.garima.AccessSpecifier;

public class WrapperClassImpl {
	public static void main(String[] args) {
		
    // Boxing (primitive -> object)
	int a=10;
	Integer obj=Integer.valueOf(20);
	System.out.println("Boxing: "+obj);
	
    // UnBoxing (object ->  primitive)
	Integer b=new Integer(20);
	int val=b.intValue();
	System.out.println("UnBoxing: "+val);
	
    // Autoboxing (automatic primitive -> object)
	int x=30;
	Integer autoobj=x;
	System.out.println("AutoBoxing: "+autoobj);
	
    // Auto-unboxing (automatic object -> primitive)
	Integer y=40;
	int autoval=y;
	System.out.println("Auto UnBoxing: "+autoval);
	
	int num=100;
	//convert to string
	String str=Integer.toString(num);
	System.out.println("String value: "+str);
			
	//convert string to num
	int val2=Integer.parseInt("200");
	System.out.println("Parsed Int: "+ val2);
	
	//constants
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	}

}
