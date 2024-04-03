package com.sunbeam.kdac;

import java.util.Scanner;

public class Invoice {

	String part_number;
	String part_description;
	int qty_of_item;
	double price_per_item;
	Scanner sc = new Scanner(System.in);
	

	public Invoice() {
		super();
	}

	public Invoice(String part_number, String part_description, int qty_of_item, double price_per_item) 
	{
		super();
		this.part_number = part_number;
		this.part_description = part_description;
		this.qty_of_item = qty_of_item;
		this.price_per_item = price_per_item;
	}

	public double calculatInvoice()
	{
		return qty_of_item * price_per_item;
	}
	
	public String getPart_number() {
		return part_number;
	}


	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}


	public String getPart_description() {
		return part_description;
	}


	public void setPart_description(String part_description) {
		this.part_description = part_description;
	}


	public int getQty_of_item() {
		return qty_of_item;
	}


	public void setQty_of_item(int qty_of_item) {
		if(qty_of_item < 0) {
			this.qty_of_item = 0;
		}
		else
			this.qty_of_item=qty_of_item;
	}


	public double getPrice_per_item() {
		return price_per_item;
	}


	public void setPrice_per_item(double price_per_item) {
		if(price_per_item < 0.0) {
			this.price_per_item = 0;
		}
		else
		  this.price_per_item = price_per_item;
	}
	
	public void acceptInvoice()
	{
		System.out.println("Enter Part number::");
		part_number = sc.next();
		System.out.println("Enter Part description::");
		sc.nextLine();
		part_description = sc.nextLine();
		System.out.println("Enter quantity to be purchased::");
		qty_of_item = sc.nextInt();
		System.out.println("Enter Price per item::");
		price_per_item = sc.nextDouble();
	}
	
	public void displayInvoice()
	{
		System.out.println("Part number"+part_number);
		System.out.println("Part description"+part_description);
		System.out.println("Quantity of item purchased"+qty_of_item);
		System.out.println("Item price"+price_per_item);
		System.out.println("Final bill::"+calculatInvoice());
	}
	
	
	
	
	
	
}
