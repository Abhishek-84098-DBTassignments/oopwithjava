package com.sunbeam.SalaryPayroll;

public class SalariedEmp extends Employee {
	public double weeklySal;
	
	public SalariedEmp(String firstname, String lastname, String ssn, double weeklySal) {
		super(firstname, lastname, ssn);
		this.weeklySal = weeklySal;
	}
	
	

	public double getWeeklySal() {
		return weeklySal;
	}



	public void setWeeklySal(double weeklySal) {
		this.weeklySal = weeklySal;
	}


	@Override
	public double Earnigs() {
		
		return getWeeklySal();
	}

	@Override
	public String toString() {
		return "Salaried Employee's Earnings =" + weeklySal ;
	}



	
	

}
