package com.sunbeam.SalaryPayroll;

public class CommEmp extends Employee {
	
	private double grossSal;
	private double commRate;
	
	
	public CommEmp(String firstname, String lastname, String ssn, double grossSal, double commRate) {
		super(firstname, lastname, ssn);
		this.grossSal = grossSal;
		this.commRate = commRate;
	}


	public double getGrossSal() {
		return grossSal;
	}


	public void setGrossSal(double grossSal) {
		this.grossSal = grossSal;
	}


	public double getCommRate() {
		return commRate;
	}


	public void setCommRate(double commRate) {
		this.commRate = commRate;
	}


	@Override
	public double Earnigs() {
		
		return getGrossSal() + (getCommRate() * getGrossSal());
	}


	@Override
	public String toString() {
		return "Salary of employee on commission basis is " + getGrossSal() + "with commission Rate=" + commRate;
	}
	
	
}
