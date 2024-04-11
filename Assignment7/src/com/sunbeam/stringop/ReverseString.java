package com.sunbeam.stringop;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your string - ");
		
		String input = sc.nextLine();
		
		StringBuilder S1 = new StringBuilder(input);
		
		S1.reverse();
		
		System.out.println("String reversed - "+S1);
	
		sc.close();
	}

}
