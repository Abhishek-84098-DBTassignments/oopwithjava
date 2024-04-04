package com.sunbeam.Q2;

import java.util.Scanner;

public class Car {
	
	
	private double kmPerDay;
	private double costPerKmPetrol;
	private double avgKmPerLit;
	private int parkingFeesAday;
	private int tollPerDay;
	
	Scanner sc = new Scanner(System.in);

	public Car() {
		super();
	}

	public Car(double kmPerDay, double costPerKmPetrol, double avgKmPerLit, int parkingFeesAday, int tollPerDay) {
		super();
		this.kmPerDay = kmPerDay;
		this.costPerKmPetrol = costPerKmPetrol;
		this.avgKmPerLit = avgKmPerLit;
		this.parkingFeesAday = parkingFeesAday;
		this.tollPerDay = tollPerDay;
	}

	public double getKmPerDay() {
		return kmPerDay;
	}

	public void setKmPerDay(double kmPerDay) {
		this.kmPerDay = kmPerDay;
	}

	public double getCostPerKmPetrol() {
		return costPerKmPetrol;
	}

	public void setCostPerKmPetrol(double costPerKmPetrol) {
		this.costPerKmPetrol = costPerKmPetrol;
	}

	public double getAvgKmPerLit() {
		return avgKmPerLit;
	}

	public void setAvgKmPerLit(double avgKmPerLit) {
		this.avgKmPerLit = avgKmPerLit;
	}

	public int getParkingFeesAday() {
		return parkingFeesAday;
	}

	public void setParkingFeesAday(int parkingFeesAday) {
		this.parkingFeesAday = parkingFeesAday;
	}

	public int getTollPerDay() {
		return tollPerDay;
	}

	public void setTollPerDay(int tollPerDay) {
		this.tollPerDay = tollPerDay;
	}
	
	public void acceptData() 
	{
		
		System.out.println("How much your car travels a day in km: ");
		kmPerDay = sc.nextDouble();
		System.out.println("What is the cost of petrol per liter in Rs.: ");
		costPerKmPetrol = sc.nextDouble();
		System.out.println("What is milage of your car in km per liter: ");
		avgKmPerLit = sc.nextDouble();
		System.out.println("How much do you pay for parking in day as parking fee in Rs.: ");
		parkingFeesAday = sc.nextInt();
		System.out.println("How much toll do you pay per day in Rs.: ");
		tollPerDay = sc.nextInt();
		
	}
	
	public void displayData()
	{
		System.out.println("------------**------------***----------");
		System.out.println("Car runs in day in km - "+kmPerDay+"km");
		System.out.println("Average Petrol price per day in a day in Rs. - "+"Rs."+costPerKmPetrol);
		System.out.println("Milage of car in km per liter - "+avgKmPerLit+"per liter");
		System.out.println("Average Parking fees per day in Rs. - "+"Rs."+"Rs."+parkingFeesAday);
		System.out.println("Total toll tax to be paid per day in Rs. - "+"Rs."+tollPerDay);
	}
}
