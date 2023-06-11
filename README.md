# Core-java-Java-8
Ramya Practice Program with java8 features

package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MinValue {
	
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(12,34,56,78,45,33,2,35,89);
		List<Integer>li2=li.stream().sorted().collect(Collectors.toList());
		System.out.println(li2.get(0));
		
		//2nd way
		List<Integer> li1=Arrays.asList(12,34,56,78,45,33,2,35,89);
		OptionalInt li3=li.stream().mapToInt(Integer::intValue).min();
		System.out.println(li3);
		
		//3r way
		
		List<Integer> list=Arrays.asList(12,34,56,78,45,33,2,35,89);
		Integer list3=li.stream().sorted().findFirst().orElse(0);
		System.out.println(list3);
		
		//4th way
		
		List<Integer> li4=Arrays.asList(12,34,56,78,45,33,2,35,89);
		Integer   list4=li.stream().reduce(Integer.MIN_VALUE,Integer::min);
		System.out.println(list4);
	}

}
