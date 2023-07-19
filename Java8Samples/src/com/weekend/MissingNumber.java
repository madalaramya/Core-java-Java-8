package com.weekend;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		
		String s1=new String("Ramya");
		String s2=new String("Ravali");
		 s1=s1+s2;
		 s2=s1.substring(0,s1.length()-s2.length());
		 s1=s1.substring(s2.length());
		
		System.out.println(s1);
		System.out.println(s2);
		
		//Number swapping without third variable
		int a=20;
		int b=30;
		
		a=a+b;//20+30=50
		b=a-b;//50-30=20
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
}
}
