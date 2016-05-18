package com.spring.quickstart.hello;

public class Address {

	private String city;

	public Address(){}
	
	public Address(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	public void init(){
		System.out.println("Bean created: " + this);
	}
	public void destroy(){
		System.out.println("Bean deleted: " + this);
	}
	
}
