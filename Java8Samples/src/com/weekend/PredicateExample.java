package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
public static void main(String[] args) {
	List<Integer> li=Arrays.asList(2,23,45,78,77,99,56);
	Predicate<Integer> Numbers= (x->x%2==0);
	System.out.println(li.stream().filter(Numbers).collect(Collectors.toList()));
}
}
