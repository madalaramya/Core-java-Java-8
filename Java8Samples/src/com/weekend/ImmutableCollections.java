package com.weekend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableCollections {

	public static void main(String[] args) {
		ArrayList<String> numbers=new ArrayList<>();
		numbers.add("Ramya");
		numbers.add("Ravali");
		numbers.add("Naveen");
		List<String> unmodifiableList=Collections.unmodifiableList(numbers);
		
		System.out.println(numbers);
		numbers.add("Harshi");
		
		
		numbers.add("Harshi2");
		System.out.println(unmodifiableList);
		
		System.out.println(unmodifiableList.add("Karthi"));
				
	}
}
