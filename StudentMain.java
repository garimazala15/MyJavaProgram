package com.demo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.module.Student1;

public class StudentMain {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("studentBean.xml");
		
		Student1 st1=(Student1) ctx.getBean("stu1");
		
		System.out.println(st1);
	}

}
