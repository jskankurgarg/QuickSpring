package com.spring.quickstart.apps;

public class FruitFactory {

	public Fruit createFruit(String name){
		System.out.println("Inside FruitFactory.createFruit....");
		return new Fruit(name);
	}
	
}
