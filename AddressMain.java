package com.demo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.module.Address;
import com.module.Employee;

public class AddressMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[] {"beans.xml","addressBean.xml"});/*we need to call both bean file if we have different bean file for both the objects*/
		
		Address add=(Address) ctx.getBean("add1");
		
		System.out.println(add);
		
		Employee e1=(Employee) ctx.getBean("emp3");
		
		System.out.println(e1);
	}

}
