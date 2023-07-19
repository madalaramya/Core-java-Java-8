package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DistinctNumbers {
	
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(5,3,2,3,1,5,4);
		
	Map<Integer,Long> repeatedNumberGrouping=li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(repeatedNumberGrouping);
	List<Integer>nonRepeatedNumbers=li.stream().filter(n->repeatedNumberGrouping.get(n)==1).collect(Collectors.toList());
	List<Integer>afterSort=nonRepeatedNumbers.stream().sorted().collect(Collectors.toList());
	System.out.println(afterSort);
	System.out.println(afterSort.get(afterSort.size()-2));
	//another way of filtering second heighst value
	int secondHeighstNumber=nonRepeatedNumbers.stream().sorted().skip(nonRepeatedNumbers.size()-2).findFirst().orElse(Integer.MAX_VALUE);
	System.out.println(secondHeighstNumber);
		 
		
		
	}

}

