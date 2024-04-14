package com.sunbeam.test;
import java.util.Arrays;
import java.util.Comparator;
import com.sunbeam.entity.Student;
import java.util.Scanner;

class Studentcity implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getCity().compareTo(o2.getCity());
	}
}

class Studentmarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return Double.compare(o2.getMarks(),o1.getMarks());
	}
}

class Studentname implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}


public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter class strength - ");
		int n = sc.nextInt();
		
		Student[]arr = new Student[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = new Student();
			arr[i].acceptData();
		}
		System.out.println("Students before sorting...");
		for (Student student : arr) {
			System.out.println(student.toString());
		}
		
		int choice;
		do {
			System.out.println("...................");
			System.out.println("0.Exit");
			System.out.println("1.Sort students on city names(asc)");
			System.out.println("2.Sort students on their marks(desc)");
			System.out.println("3.Sort students by name(asc)");
			System.out.println("4.Sort rollno wise ");
			System.out.println("--------------------");
			System.out.print("Enter your sort choice - ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Thank You...");
			break;
			case 1:
				
				Comparator<Student>citysort = new Studentcity();
				Arrays.sort(arr, citysort);
				System.out.println("Students after sorting by city names");
				System.out.println("********************************");
				for (Student student : arr) {
					System.out.println(student);
				}
			break;
			case 2:
//				System.out.println("Students before sorting...");
//				for (Student student : arr) {
//					System.out.println(student.toString());
//				}
				Comparator<Student>marksort = new Studentmarks();
				Arrays.sort(arr,marksort );
				System.out.println("Merit list");
				System.out.println("**********");
				for (Student student2 : arr) {
					System.out.println(student2);
					
				}
			break;
			case 3:
//				System.out.println("Students before sorting - ");
//				for (Student student : arr) {
//					System.out.println(student.toString());
//				}
				Comparator<Student>namesort = new Studentname();
				Arrays.sort(arr,namesort );
				System.out.println("STudents in alphabetical order");
				System.out.println("*******************************");
				for (Student student : arr) {
					System.out.println(student);
				}
			break;
			case 4:
				Arrays.sort(arr);
				System.out.println("Students sort on rollno");
				System.out.println("***********************");
				for (Student student : arr) {
					System.out.println(student);
				}
			break;	
			default:
				System.out.println("Enter valid choice");
			break;	
			
			}
			
		}while(choice !=0);
		
		sc.close();

	}

}
