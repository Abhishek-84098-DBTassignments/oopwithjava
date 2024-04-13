package com.sunbeam.entity;

import java.util.Scanner;

public class Employee {
	
	private int empid;
	private String name;
	private double salary;
	Scanner sc = new Scanner(System.in);
	public Employee() {
		super();
	}

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public void accept() {
		System.out.print("Enter employee id - ");
		empid = sc.nextInt();
		System.out.print("Enter employee name - ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter salary - ");
		salary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	}
	

