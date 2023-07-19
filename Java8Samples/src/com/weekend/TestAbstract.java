package com.weekend;

import java.util.Arrays;

public class TestAbstract {
	
	public static boolean isSame(String s1, String s2)
	{
		if(s1.length()==s2.length())
		{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Both Strings are equal");
			return true;
		}
		else
		{
			System.out.println("Both Strings are not equal");
			return false;
		}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s1="ABCD";
		String s2="BDAC";
		
		isSame( s1,s2);
		
	}



	

}
