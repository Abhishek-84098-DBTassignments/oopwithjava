package com.app.Test;

import java.util.Scanner;

import com.app.geometry.*;

public class TestPointArry1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many points you want to add - ");
		int n = sc.nextInt();

		Point2D[] pts = new Point2D[n];

		System.out.println("Enter points' co-ordinates - ");
		for(int i = 0; i < pts.length; i++) {
			pts[i] = new Point2D();
			pts[i].enterDetails();
		}
		

		for (Point2D point2d : pts) {
			System.out.println(point2d.getDetails());
		}
		int choice;
		do {
			System.out.println("Press 0 : To exit");
			System.out.println("Press 1 : To display specific point");
			System.out.println("Press 2 : To display All points");
			System.out.println("Press 3 : To calculate distance between points");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("0.Exit");
			}
				break;
			case 1: {
				System.out.println("Enter index for which you want to display point");
				int index = sc.nextInt();

				if (index < 0 || index > n) {
					System.out.println("Invalid index");

				}
				System.out.println(pts[index].getDetails());
			}
				break;
			case 2: {
				System.out.println("All points entered are: ");

				// for (Point2D point2d : pts)
				// {
				// System.out.println(point2d.getDetails());;
				// }
				int index = 0;
				for (Point2D point2d : pts) {
					System.out.println("Point at index  : " + point2d.getDetails());
				}
				// for(int i = 0 ;i<n;i++)
				// {
				// pts[i].getDetails();
				// }
			}
				break;
			case 3: {
				System.out.println("Enter the two indices");
				int srt = sc.nextInt();
				int end = sc.nextInt();

				if (srt < 0 || srt > n) {
					System.out.println("Invalid index");

				}
				if (end < 0 || end > n) {
					System.out.println("Invalid index");

				}

				if (pts[srt].isEqual(pts[end])) {
					System.out.println("Points are equal,hence distance is 0");

				} else {
					pts[srt].calculateDistance(pts[end]);
					System.out.println("Distance between two points: ");
				}
			}
				break;
			default: {
				System.out.println("Enter valid choice....");
			}
				break;
			}
		} while (choice != 0);
	}
}
