package com.weekend;

public class StringPalindrome {
	
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
}

}
