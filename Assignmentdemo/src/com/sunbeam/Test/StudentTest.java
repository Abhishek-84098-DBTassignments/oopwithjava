package com.sunbeam.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.entity.Student;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> studentList = new ArrayList<>();
		System.out.print("Enter class strength - ");
		int n = sc.nextInt();
		Student s;
		for (int i = 0; i < n; i++) {
			s = new Student();
			s.accept();
			studentList.add(s);
		}
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("----------------------------");
		Collections.sort(studentList);	
		System.out.println("Students after sorting...");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("-----------------------------");
		class sortmark implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				
				return Double.compare(o2.getMarks(),o1.getMarks());
			}
			
		}
		Comparator<Student> sortmark = new sortmark();
		Collections.sort(studentList, sortmark);
		System.out.println("Merit list");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("--------------------");
		class namesort implements Comparator<Student>{

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		}
		Comparator<Student> namesort = new namesort();
		Collections.sort(studentList, namesort);
		for (Student student : studentList) {
			System.out.println(student);
		}
		Student s1 = new Student();
//		s1.setRollno(3);;
//		if(studentList.contains(s1))
//			System.out.println("Student with roll no 3 present");
//		else
//			System.out.println("Student absent");
		s1.setName("ram");
		if(studentList.contains(s1))
			System.out.println("Student ram present");
		else
			System.out.println("ram absent");
		
sc.close();
	}

}
