package com.spring.quickstart.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String...args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/quickstart/hello/beans/beans.xml");
		
		Person person = (Person)context.getBean("person");
		person.setAge(1234);
		System.out.println(person);
		
		Address address = (Address)context.getBean("address2");
		System.out.println(address);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
