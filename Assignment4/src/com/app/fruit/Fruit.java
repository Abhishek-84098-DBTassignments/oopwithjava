package com.app.fruit;

import java.util.Scanner;

public class Fruit {
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private String colour;
	private double weight;
	private boolean isFresh = true;
	public Fruit() {
		super();
	}
	public Fruit(String name, String colour, boolean isFresh) {
		super();
		this.name = name;
		this.colour = colour;
		this.isFresh = isFresh;
	}
	
	public String Taste()
	{
		return "no specific taste";
	}
	public void setFresh(boolean isFresh)
	{
		this.isFresh=isFresh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Fruit [" + (name != null ? "name=" + name + ", " : "")
				+ (colour != null ? "colour=" + colour + ", " : "") + "weight=" + weight + ", isFresh=" + isFresh + "]";
	}
	
	public void acceptData()
	{
		System.out.println("Enter weight of the fruit in kg - ");
		weight = sc.nextDouble();
		
	}
	
	
}	
	
		

	
	


