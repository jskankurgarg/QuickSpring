package com.spring.quickstart.apps;

import java.util.Map;

public class Food {

	private java.util.Map<String, Fruit> diet;
	
	public Food(){
		System.out.println("Food no-arg constructor");
	}

	public Food(Map<String, Fruit> diet) {
		super();
		System.out.println("Food 1-paramtereized constructor..");
		this.diet = diet;
	}

	public java.util.Map<String, Fruit> getDiet() {
		return diet;
	}

	public void setDiet(java.util.Map<String, Fruit> diet) {
		this.diet = diet;
	}

	@Override
	public String toString() {
		return "Food [diet=" + diet + "]";
	}
}
