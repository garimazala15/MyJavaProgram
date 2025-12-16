package com.demo.SpringHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.module.Employee;
import com.module.MyInf1;
import com.module.mySingletone;

public class App3 {
	
	public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans2.xml");
        
        // mySingletone s1=(mySingletone) ctx.getBean("st1");
        // s1.display();
        
        //MyInf1 ob=(MyInf1)ctx.getBean("i1");
        //ob.display();

        MyInf1 ob=(MyInf1)ctx.getBean("i2");
        ob.display();

	}

}
