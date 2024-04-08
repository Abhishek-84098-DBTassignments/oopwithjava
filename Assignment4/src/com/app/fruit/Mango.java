package com.app.fruit;

public class Mango extends Fruit{

	public Mango() {
		super();
	}

	public Mango(String name, String colour, boolean isFresh) {
		super("mango","yellow", true);
	}

	@Override
	public String Taste() {
		
		return "sweet";
	}

	@Override
	public void acceptData() {
		
		super.acceptData();
	}

	
	



	
}
