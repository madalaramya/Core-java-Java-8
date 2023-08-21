package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AvgNumber extends B{
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(2,4,3,5,6,7,1);
		OptionalDouble li1=li.stream().mapToInt(Integer::intValue).average();
		System.out.println(li1);	
		
		List<Integer> list= Arrays.asList(2,4,6,8);
		list.stream().mapToInt(Integer::intValue).average();
		
		
		
		//2nd way
		int number[]= {2,4,6,8,10};
		double d=Arrays.stream(number).average().orElse(0);
		System.out.println(d);
	}
	
	
	
	

}
