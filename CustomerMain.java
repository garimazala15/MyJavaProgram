package com.demo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.module.Customer;
import com.module.Product;

public class CustomerMain {
	
public static void main(String[] args) {
		
        ApplicationContext ctx=new ClassPathXmlApplicationContext("customerBean.xml");
        
        
        Customer c1=(Customer)ctx.getBean("c1");
        
        System.out.println(c1);


	}


}
