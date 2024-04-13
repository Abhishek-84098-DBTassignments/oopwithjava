package com.sunbeam.genericSort;

import java.util.Comparator;

public class selectionSort  {
	public static < T > void SelectionSort(T[] arr, Comparator <? super T> c) {
		for(int i = 0; i<arr.length - 1; i++) 
		{
			
			for(int j = i+1;j<arr.length;j++) 
			{
				if(c.compare(arr[i], arr[j])>0) 
				{
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		
		}
	}
}
