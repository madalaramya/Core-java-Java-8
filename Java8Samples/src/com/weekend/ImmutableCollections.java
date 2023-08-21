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
		numbers.remove("Ramya");
		
		numbers.add("Harshi2");
		System.out.println(unmodifiableList);
		
		I1 Inter=(s1,s2 )->{
			System.out.println("Executing myAbstractMethod"+s1.length()+s2.length());
		};
		
		Inter.print("Test","Test2");		
	}
}
