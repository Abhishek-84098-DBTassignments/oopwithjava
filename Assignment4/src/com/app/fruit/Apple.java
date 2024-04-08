package com.app.fruit;

public class Apple extends Fruit{

	public Apple() {
		super();
	}

	public Apple(String name, String colour, boolean isFresh) {
		super("Apple", "green", true);
	}

	@Override
	public String Taste() {
		
		return "Sweet n sour";
	}

	@Override
	public void acceptData() {
		
		super.acceptData();
	}
	
	
}
