package com.sunbeam.SalaryPayroll;

public class BaseCommEmp extends CommEmp {
	
	private double baseSal;

	public BaseCommEmp(String firstname, String lastname, String ssn, double grossSal, double commRate,
			double baseSal) {
		super(firstname, lastname, ssn, grossSal, commRate);
		this.baseSal = baseSal;
	}

	public double getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(double baseSal) {
		this.baseSal = baseSal;
	}

	@Override
	public double Earnigs() {
		
		return getBaseSal() + super.Earnigs();
	}

	@Override
	public String toString() {
		return "Salary of employee with base salary and commission " +(getBaseSal()+super.Earnigs());
	}
	

}
