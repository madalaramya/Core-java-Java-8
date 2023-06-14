package com.weekend;
import java.util.*;
import java.math.BigDecimal;

public class ArrayExample {

	public static void main(String[] args) {
		
		

		
		int expression = 1 - 1 * 1/3 + 2/3 + 4/3 - 1 * 1/2;

		if (expression == Math.PI/4)
		{
		    System.out.println("The expression equals pi/4");
		}
		else {
			System.out.println("The expression does not equal pi/4");
		}

		ArrayExample.incrementArray();
		
	}
	public static void incrementArray(){
		
		int arr[]= {1,2,3};
		int array[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			array[i]=arr[i]+1;
			System.out.println(array[i]);
		}

	}
}
