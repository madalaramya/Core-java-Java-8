package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringDuplicate {
	public static void main(String[] args) {
		
		List<String>li=Arrays.asList("Benz","Honda","Benz","Honda","audi","verna");
		
		System.out.println(li.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		System.out.println(li.stream().collect(Collectors.joining()));
		
		
		
		String s1 = new String("shreekanth");
		String s2 = new String("shreekanth");


		StringBuffer sb1 = new StringBuffer("shreekanth");
		StringBuffer sb2 = new StringBuffer("shreekanth");
		
		 StringBuffer sb3=sb1;
		System.out.println(s1.equals(s2));//true


		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.equals(sb3));
	}

}
