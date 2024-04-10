package com.sunbeam.exceptionhandling;

import java.util.Scanner;

public class Program {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter your input string - ");
			String input = sc.nextLine();
			System.out.println("The input string length - "+input.length());
			
			if(input.length() > 80)
			{
				throw new ExceptionLineTooLong("*The String is too Long*");
			}
			System.out.println("The input String - "+input.toString());
			System.out.println("String length - "+input.length());
		} catch (ExceptionLineTooLong e) {
			
			e.printStackTrace();
		}
		//finally
		{
			sc.close();
		}
	}

}
