package com.sunbeam.Test;
import com.sunbeam.Q2.*;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.acceptData();
		car.displayData();
		
		double price = 0;
		double avgpricePerKm = car.getKmPerDay()/car.getAvgKmPerLit();
		price = car.getTollPerDay()+car.getParkingFeesAday()+ car.getCostPerKmPetrol()*avgpricePerKm;
		System.out.println("-----------------****-----------****----------------------");
		System.out.println(" Daily total driving/car pooling cost in Rs.: "+price);
		System.out.println("----------------------------------------------------------");
		System.out.println("YOU CAN SAVE UPTO Rs. "+price+" A DAY IF YOU TRAVEL BY PUBLIC TRANSPORT.");
		System.out.println("-----------***********---------------********-------------");
		System.out.println("+++USE PUBLIC TRANSPORT---SAVE ENVIRONMENT+++");
	}

}
