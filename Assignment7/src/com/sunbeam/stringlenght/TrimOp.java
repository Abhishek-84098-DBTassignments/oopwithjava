package com.sunbeam.stringlenght;

import java.util.Scanner;

public class TrimOp {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(s);
		
		//s.trim();
		
	//System.out.println(s.trim());
	
	String []arr = s.split(" ");
	for(String element:arr)
	{
		System.out.println(element);
	}
	
	for(int i = 0; i<arr.length; i++)
	{
		count++;
	}
	System.out.println("number of string elements - "+count);
	sc.close();
	}
	
}
