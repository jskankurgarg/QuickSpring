package com.spring.quickstart.hello;

public class Person {
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Person()
	{}
	
	private int age;
	private String name;
	private String interest;
	private Address address;


	public void speak() 
	{
		System.out.println("Hello Spring!");
	}
	
	public void onCreate(){
		System.out.println("Person OnCreate : " + this);
	}
	
	public void onDestroy(){
		System.out.println("Person deleted!");
	}
	
	public static Person getInstance(int age, String name){
		System.out.println("Factory Instance..");
		return new Person(age, name);
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", interest=" + interest + ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
}
