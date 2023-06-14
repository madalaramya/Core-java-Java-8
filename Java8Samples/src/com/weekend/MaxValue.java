package com.weekend;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MaxValue {
public static void main(String[] args) {
	//one way
	List<Integer> li=Arrays.asList(12,34,56,78,45,33,2,35,89);
	List<Integer>li2=li.stream().sorted().collect(Collectors.toList());
	System.out.println(li2.get(li2.size()-1));
	
	//2nd way
	
	OptionalInt list2=li.stream().mapToInt(Integer::intValue).max();
	System.out.println(list2);
	
	//3rd way
	
	Integer list3=li.stream().reduce(Integer.MIN_VALUE,Integer::max);
	System.out.println(list3);
	
	//4th way
	
	Integer list5=Collections.max(li);
	System.out.println(list5);
}


}
