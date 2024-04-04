package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private  int x;
	private  int y;
	Scanner sc = new Scanner(System.in);
	
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point2D() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void enterDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X co-ordinate: ");
		x = sc.nextInt();
		
		System.out.println("Enter Y co-ordinate: ");
		y = sc.nextInt();
	}
	public  String getDetails()
	{
		
		String result;
		result ="("+x+","+y+")";
		return result;
	}
	
	public boolean isEqual(Point2D p2) {
		
		 if((this.x==p2.x) && (this.y==p2.y))
			 return true;
		 else 
			 return false;
		
	}
	
	public void calculateDistance(Point2D p2)
	   {
		
		   double distance=Math.sqrt(Math.pow(( p2.x-this.x),2)+Math.pow(( p2.y-this.y),2));
		   System.out.println("distance between points : "+"("+this.x+","+this.y+")"+"  and "+"("+p2.x+","+p2.y+")"+" = "+distance);
	    }

}
