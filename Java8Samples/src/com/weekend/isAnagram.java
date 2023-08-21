package com.weekend;

import java.util.Arrays;

public class isAnagram {
	
	public static void main(String[] args) {
		String s1="ABC";
		String s2="CBA";
		isAnagram(s1,s2);
	}

	private static void isAnagram(String s1, String s2) {
		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		if(Arrays.equals(c1,c2))
		{
			System.out.println("Given Strings are anagramm");
		}
		else
		{
			System.out.println("Given Strings are not anagramm");
		}
	}

}
