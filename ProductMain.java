package com.demo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.module.Product;

public class ProductMain {
	public static void main(String[] args) {
		
        ApplicationContext ctx=new ClassPathXmlApplicationContext("productBean.xml");
        
        
        Product p1=(Product)ctx.getBean("p1");
        
        Product p2=(Product)ctx.getBean("p2");

        System.out.println(p1);

        System.out.println(p2);


	}

}
