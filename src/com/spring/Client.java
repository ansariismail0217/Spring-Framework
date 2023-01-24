package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	
	public static void main(String[] args) {
		
		//Object construction tradidtional way | Done by developer
//		Employee eRef = new Employee();
//		eRef.setId(101);
//		eRef.setName("Abdullah");
//		eRef.setAddress("Bengaluru");
//		
//		System.out.println(eRef);
		
		//Spring way | Inversion of Control (IoC)
		//IoC : We don't create objects. Objects will be constructed by the spring core container
		//there are two APIs-
		//1. Bean Factory-
		//constructs the objects when you request for it using getBean method
//		Resource resource = new ClassPathResource("employeebean.xml");
		
		//spring container used to parse XML file and construct the object
//		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		//two ways of getting object details out of spring core container
//		Employee e1 = (Employee) factory.getBean("emp1");
//		Employee e2 = factory.getBean("emp2", Employee.class);
//		
//		System.out.println("Employee1 details: "+e1);
//		System.out.println("Employee2 details: "+e2);
		
		//2. ApplicationContext (built on top of bean factory)
		//constructs the object even when you don't request for them
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		//two ways of getting object details out of spring core container
		Employee e1 = (Employee) context.getBean("emp1");
//		Employee e2 = context.getBean("emp2", Employee.class);
		
		System.out.println("Employee1 details: "+e1);
//		System.out.println("Employee2 details: "+e2);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
		
	}

}
