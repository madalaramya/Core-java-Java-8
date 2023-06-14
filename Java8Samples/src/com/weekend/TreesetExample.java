package com.weekend;



	
	
	
	
	
	import java.util.*;

	public class TreesetExample {
	    public static void main(String[] args) {
	        Set<String> set = new LinkedHashSet();
	        set.add("Three");
	        set.add("One");
	        set.add("Two");
	        set.add(null);
	        set.add("One"); // this will be ignored because "One" is already in the set

	        System.out.println(set); // Output: [One, Two, Three]
	    }
	}


