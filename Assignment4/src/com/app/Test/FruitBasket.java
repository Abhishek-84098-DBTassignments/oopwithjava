package com.app.Test;
import java.util.Scanner;

import com.app.fruit.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int basketSize;
		
		System.out.println("Enter Basket size - ");
		basketSize = sc.nextInt();
		
		Fruit []basket = new Fruit[basketSize];
		Fruit fruit;
		int counter = 0;
		
		int choice;
		do
		{
			System.out.println("0.Exit");
			System.out.println("1.Add apple");
			System.out.println("2.Add mango");
			System.out.println("3.Add orange");
			System.out.println("4.Display all the fruits in the basket");
			System.out.println("5.Display all the information about fruits in the basket");
			System.out.println("6.Display taste of all the stale fruits");
			System.out.println("7.Mark fruit as stale");
			System.out.println("Enter your choice::");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Thank you");
			break;	
			case 1:
				if(counter < basketSize) {
					fruit = new Apple();
					fruit.acceptData();
					basket[counter] = fruit;
					counter++;
				}
				else
					System.out.println("Basket is full*");
			break;
			case 2:
				if(counter < basketSize) {
					 fruit = new Mango();
					 fruit.acceptData();
					 basket[counter] = fruit;
					 counter++;
                } else {
                    System.out.println("Basket is full!");
                
				}
			break;
			case 3:
				if(counter < basketSize) {
					fruit = new Orange();
					fruit.acceptData();
					basket[counter] = fruit;
					counter++;
               } else {
                   System.out.println("Basket is full!");
               
			   }
			break;
			case 4:
				System.out.println("All fruits in basket ::");
				for(Fruit f:basket){
					if(fruit != null)
					{
						System.out.println("Fruit at "+counter+fruit.getName());
					}
				}
				
			break;
			case 5:
				System.out.println("All information about fruits ::");
				for(Fruit f:basket) {
					if(fruit != null && fruit.isFresh()==true)
					{
						System.out.println(fruit.toString()+", Taste :"+fruit.Taste());
					}else 
						System.out.println("Basket is empty");
				}
			break;
			case 6:
				System.out.println("Taste of all stale fruits ::");
				for(Fruit f:basket)
					if(fruit != null && !fruit.setFresh(true)))
					{
						System.out.println(fruit.Taste());
					}
			break;
			case 7:
				System.out.println("Enter the index of stale fruit:");
				int index = sc.nextInt();
				if(index>= 0 && index < counter)
				{
					basket[index].setFresh(false);
					System.out.println("Fruit is stale*");
				}
				else
				{
					System.out.println("Invalid index");
				}
			break;
			default:
				System.out.println("Enter valid choice");
			break;
			
			}
			
		}while(choice != 0);
		
sc.close();
	}

}
