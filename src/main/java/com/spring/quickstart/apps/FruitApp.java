package com.spring.quickstart.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FruitApp {

	public static void main(String...args){
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/com/spring/quickstart/hello/beans/fruit_beans.xml");
		
		Fruit apple = (Fruit)context.getBean("apple");
//		System.out.println(apple);
		/*
		Fruit banana = (Fruit)context.getBean("banana");
		System.out.println(banana);
		
		Fruit mango = (Fruit)context.getBean("mango");
		System.out.println(mango);
		*/
		FruitBasket fb = (FruitBasket)context.getBean("fruitBasket1");
		System.out.println(fb);
		
		System.out.println(context.getBean("fruitBasket2"));
		System.out.println(context.getBean("fruitBasket3"));
		System.out.println(context.getBean("food"));
		((FileSystemXmlApplicationContext)context).close();
		
	}
}
