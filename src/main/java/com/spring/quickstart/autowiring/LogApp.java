package com.spring.quickstart.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LogApp {

	public static void main(String...arg){
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/com/spring/quickstart/hello/beans/autowiring.xml"); 
		
		System.out.println("Type Logger : " + context.getBean("typeLogger"));
		System.out.println("Name Logger : " + context.getBean("nameLogger"));
		System.out.println("Constructor Logger : " + context.getBean("constructorLogger"));
		System.out.println("No Logger : " + context.getBean("noLogger"));
		System.out.println("Default Logger : " + context.getBean("defaultLogger"));
		
		((FileSystemXmlApplicationContext)context).close();
	}
}
