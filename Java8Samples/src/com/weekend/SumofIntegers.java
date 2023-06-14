package com.weekend;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumofIntegers {
	public static void main(String[] args) {

		List<Integer>li=Arrays.asList(1,2,3,4,8,6);
		int li2=li.stream().mapToInt(Integer::intValue).sum();
		System.out.println(li2);
		
		//2nd way
		int li3=li.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(li3);
		
		//3rd way
		
		int li4=li.stream().reduce(0, Integer::sum);
		System.out.println(li4);
		
		
		
		
	}

}
