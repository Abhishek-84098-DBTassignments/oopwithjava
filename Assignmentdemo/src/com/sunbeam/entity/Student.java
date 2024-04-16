package com.sunbeam.entity;

import java.util.Objects;
import java.util.Scanner;

public class Student implements Comparable<Student> {
	Scanner sc = new Scanner(System.in);
	private int rollno;
	private String name;
	private double marks;

	public Student() {
		super();
	}

	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void accept() {
		System.out.print("Enter rollno - ");
		rollno = sc.nextInt();
		System.out.print("Enter name - ");
		name = sc.next();
		System.out.print("Enter marks - ");
		marks = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (this == obj)
			return true;
		else if (obj instanceof Student) {
			Student e = (Student) obj;
			return ((Student) obj).name.equals(this.name);
		}
		return false;
	}
	
	

}
