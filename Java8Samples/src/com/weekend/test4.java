package com.weekend;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.weekend.OuterClass.StaticNestedClass;

public class test4 {

	/*
	 * Given an array of strings, find all anagram pairs in the given array.
	 * Example:
	 * 
	 * 
	 * 
	 * 
	 * Input: arr[] = {"cat", "dog", "tac", "god", "act"}; Output: [cat, tac,
	 * act][dog, god]
	 */

	public static void main(String[] args) {
	
		List<String> anagram=Arrays.asList("cat", "dog", "tac", "god", "act");
		findFirstAnagram(anagram);
		
}

	private static void findFirstAnagram(List<String> anagram) {
		Map<String,List<String>> isAnagram=anagram.stream().collect(Collectors.groupingBy(test4::SortString));
		System.out.println(isAnagram);
	}

	
	private  String SortString1(String s)
	{
		char[] str=s.toCharArray();
		Arrays.sort(str);
		
				return new String(str);
		
	}
	private static String SortString(String s)
	{
		char[] str=s.toCharArray();
		Arrays.sort(str);
		
				return new String(str);
		
	}

}
