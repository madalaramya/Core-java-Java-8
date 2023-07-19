package com.weekend;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortNumbers {
	
	public static void main(String[] args) {
         int number=32;
         isPrimeNumber(number);
	}

	private static void isPrimeNumber(int number) {

		boolean li=IntStream.rangeClosed(2, number/2).noneMatch(i->number%i==0);
		System.out.println(li);
		
	}

}
