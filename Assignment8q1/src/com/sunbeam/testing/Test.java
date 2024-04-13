package com.sunbeam.testing;
import java.util.Comparator;
import java.util.Scanner;

import com.sunbeam.entity.Employee;
import com.sunbeam.genericSort.selectionSort;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of employee you want to recruit - ");
		int n = sc.nextInt();
		
		Employee[] arr = new Employee[n];
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = new Employee();
			arr[i].accept();
		}
	
		class compEmpid implements Comparator<Employee>
		{

			@Override
			public int compare(Employee o1, Employee o2)
			{
				return o1.getEmpid()-o2.getEmpid();
				
			}
			
		}
		
		System.out.println("before sort :");
		for (Employee employee : arr) {
			System.out.println(employee.toString());
		}
		
		selectionSort.SelectionSort(arr, new compEmpid());
		
		System.out.println("after sort :");
		for (Employee employee : arr) {
			System.out.println(employee.toString());
		}
		sc.close();
	}

}
