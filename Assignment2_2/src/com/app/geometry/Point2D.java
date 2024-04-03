package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	Scanner sc = new Scanner(System.in);
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	

	public String getDetails()
	{
		
		String result,a,b;
		a=Integer.toString(x);
		b=Integer.toString(y);
		result ="("+a+","+b+")";
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
