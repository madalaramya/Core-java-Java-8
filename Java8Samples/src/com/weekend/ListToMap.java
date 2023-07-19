package com.weekend;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap implements I1{
	
	public static void main(String[] args) {
		List<String> li=Arrays.asList("A","B","C","C","D");
	//	Map<String, List<String>> filterList=li.stream().collect(Collectors.groupingBy(Function.identity()));
	//	System.out.println(filterList);
		
		BiFunction<String,String, Integer> fn= (a,b)->a.length()+b.length();
	//	fn.apply("Ramya madala");
		System.out.println(fn.apply("Ramya madala","Naveen"));
		
	}

	@Override
	public void print(String s) {
		// TODO Auto-generated method stub
		
	}

}
