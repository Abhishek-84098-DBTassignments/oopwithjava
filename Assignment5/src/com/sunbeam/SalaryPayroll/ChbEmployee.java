package com.sunbeam.SalaryPayroll;

public class ChbEmployee extends Employee{
	private double wage;
	private double hrs;
	
	public ChbEmployee(String firstname, String lastname, String ssn, double wage, double hrs) {
		super(firstname, lastname, ssn);
		this.wage = wage;
		this.hrs = hrs;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	@Override
	public double Earnigs() {
		if(getHrs() <= 40)
		return getHrs() * getWage();
		else
		return 40 * getWage() + (getHrs() - 40) * getWage() * 1.5;	
	}

	@Override
	public String toString() {
		return "Hourly Employee's earnings =" + getWage() + " for working hrs=" + hrs ;
	}

}
