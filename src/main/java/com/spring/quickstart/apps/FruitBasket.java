package com.spring.quickstart.apps;

import java.util.List;

public class FruitBasket {

	private String owner;
	private List<Fruit> basket;
	
	public FruitBasket(){
		System.out.println("FruitBasket no-arg constructor..");
	}
	
	public FruitBasket(String owner){
		System.out.println("FruitBasket 1-parameterized constructor..");
		this.owner = owner;
	}
	
	public FruitBasket(String owner, List<Fruit> basket) {
		super();
		System.out.println("FruitBasket 2-Parameterized constructor..");
		this.owner = owner;
		this.basket = basket;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public List<Fruit> getBasket() {
		return basket;
	}
	public void setBasket(List<Fruit> basket) {
		this.basket = basket;
	}
	@Override
	public String toString() {
		return "FruitBasket [owner=" + owner + ", basket=" + basket + "]";
	}
	
}
