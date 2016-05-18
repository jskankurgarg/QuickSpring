package com.spring.quickstart.hello;

public class PersonFactory {
	
	public Person createPerson(int age, String name){
		System.out.println("PersonFactory creating instance..");
		return new Person(age, name);
	}
}
