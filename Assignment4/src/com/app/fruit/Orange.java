package com.app.fruit;

public class Orange extends Fruit {

	public Orange() {
		super();
	}

	public Orange(String name, String colour, boolean isFresh) {
		super("Orange", "Orange", true);
	}

	@Override
	public String Taste() {
		
		return "Sour";
	}

	@Override
	public void acceptData() {
		
		super.acceptData();
	}
	

}
