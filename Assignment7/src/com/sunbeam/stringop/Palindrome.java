package com.sunbeam.stringop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter input string - ");
		
		String input = sc.nextLine();
		
		StringBuilder s1 = new StringBuilder(input);
		
		s1.reverse();
		
		if(input.equals(s1.toString()))
				
			System.out.println("*Entered string is palindrome*");
				
		else
		
			System.err.println("Entered string is not a palindrome");
		
		sc.close();
	}

}
