package com.sunbeam.entity;

import java.util.Scanner;

public class Student implements Comparable<Student> {
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	Scanner sc = new Scanner(System.in);
	public Student() {
		super();
	}
	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void acceptData() {
		System.out.println("--------");
		System.out.print("Enter rollno - ");
		roll = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name - ");
		name = sc.nextLine();
		System.out.print("Enter city - ");
		city = sc.nextLine();
		System.out.print("Enter marks - ");
		marks = sc.nextDouble();
		System.out.println("--------");
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return this.getRoll() - o.getRoll();
	}
	
	

}
