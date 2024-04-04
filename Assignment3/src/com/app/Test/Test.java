package com.app.Test;

import java.util.Scanner;
import com.app.geometry.*;
public class Test {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int x,y;
		
		System.out.println("Enter first point - ");
		System.out.println("enter x - ");
		x=sc.nextInt();
		System.out.println("enter y -");
		y=sc.nextInt();
		Point2D p1 = new Point2D(x,y);
		
		System.out.println("Enter second point - ");
		System.out.println("enter x - ");
		x=sc.nextInt();
		System.out.println("enter y - ");
		y=sc.nextInt();
		Point2D p2 = new Point2D(x,y);
		
		System.out.println("First point - "+p1.getDetails());
		System.out.println("Second point - "+p2.getDetails());
		
		if(p1.isEqual(p2))
		{
			System.out.println("Points are same ");
		}
		else
		{
			System.out.println("Points are not same");
			p1.calculateDistance(p2);
		}
	}

	
	
	
}
