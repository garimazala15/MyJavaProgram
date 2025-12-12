package com.demo.Spring.com.demo.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.module.Address;
import com.module.Employee;
import com.module.*;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[] {"beans.xml","addressBean.xml"});/*we need to call both bean file if we have different bean file for both the objects*/
	
		
		Organization o1=(Organization) ctx.getBean("org1");
		
		System.out.println(o1);
	}
	}


