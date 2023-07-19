package com.weekend;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {

	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Hello");
		set.add("Java");
		set.add("Java");
		set.add("AA");
		set.add(null);
		
		
		set.stream().forEach(System.out::println);
		
		
		
	}
	
}
