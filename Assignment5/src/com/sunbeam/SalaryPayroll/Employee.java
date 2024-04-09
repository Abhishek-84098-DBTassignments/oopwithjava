package com.sunbeam.SalaryPayroll;

public abstract class Employee {
	private String firstname;
	private String lastname;
	private String ssn;
	
	public Employee() {
		super();
	}

	public Employee(String firstname, String lastname, String ssn) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.ssn = ssn;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", Social Security Number=" + ssn + "]";
	}
	
	public abstract double Earnigs();
	
}
