package com.weekend;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumofIntegers {
	public static void main(String[] args) {

		List<Integer>li=Arrays.asList(1,2,3,4,8,6,10,12,9,15,21);
		int li2=li.stream().mapToInt(Integer::intValue).sum();
		System.out.println(li2);
		
		//2nd way
		int li3=li.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(li3);
		
		//3rd way
		
		int li4=li.stream().reduce(0, Integer::sum);
		System.out.println(li4);
		
		System.out.println(Collections.max(li));
		System.out.println(IntStream.rangeClosed(1, 21)
                .parallel()
                .sum());
		
		
		
	}

}
