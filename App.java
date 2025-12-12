package com.garima.SpringHibernateDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.module.Product;
import com.module.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
        //Student st1=(Student) ctx.getBean("s1");
        
        Product p1=(Product) ctx.getBean("p1");
        
        
        try {
        	Configuration cfg=new Configuration().configure();
    		SessionFactory sf=cfg.buildSessionFactory();
    		Session session=sf.openSession();
    		session.beginTransaction();
    		//session.save(st1);
    		session.save(p1);
    		session.getTransaction().commit();
    		System.out.println("data added successfully!");
    		session.close();
    		
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}
