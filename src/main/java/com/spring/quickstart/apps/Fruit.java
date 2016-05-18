package com.spring.quickstart.apps;

public class Fruit {

	private String name;

	public void init(){
		System.out.println("Init Fruit");
	}
	
	public void destroy(){
		System.out.println("Destory Fruit");
	}
	
	public Fruit(){
		System.out.println("Fruit default or no-arg constructor");
	}
	
	public Fruit(String name) {
		super();
		System.out.println("Fruit Parameterized Constructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
}
