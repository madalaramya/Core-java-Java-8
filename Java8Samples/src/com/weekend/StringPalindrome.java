package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class StringPalindrome {
	@Test
	public void StringTestPalindrome()
	{

		List<String> palindrome=Arrays.asList("CAT","RAR","SHAT","RADAR");
		List<String> ispal=palindrome.stream().filter(StringPalindrome::isPalindromeCheck).collect(Collectors.toList());
		List<String> palindrome2=Arrays.asList("RARA","RADAR");
		Assertions.assertNotEquals(palindrome2,ispal);
	}
	List<String> palindrome=Arrays.asList("CAT","RAR","SHAT","RADAR");
	List<String> ispal=palindrome.stream().filter(StringPalindrome::isPalindromeCheck).collect(Collectors.toList());
	public static boolean isPalindrome(String s)
	{
		StringBuffer str=new StringBuffer(s);
		String reverse=str.reverse().toString();
		if(s.equals(reverse))
		{
			System.out.println("Palindrome");
			return true;
		}
		return false;
	}
public static void main(String[] args) {
	String s="RadaR";
	String reverse = "";
	for(int i=s.length()-1;i>=0;i--)
	{
		reverse=reverse+s.charAt(i);
	}
    
	System.out.println(reverse);
	System.out.println(isPalindrome("Nin"));
	
	//3rd way
	List<String> palindrome=Arrays.asList("CAT","RAR","SHAT","RADAR");
	List<String> ispal=palindrome.stream().filter(StringPalindrome::isPalindromeCheck).collect(Collectors.toList());
	System.out.println(ispal);
	
}
public static boolean isPalindromeCheck(String s)
{
	StringBuffer sb=new StringBuffer(s);
	String Reverse=sb.reverse().toString();
	return s.equals(Reverse);
	
}
}
