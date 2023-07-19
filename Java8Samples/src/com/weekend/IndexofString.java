package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IndexofString {

	public static void main(String[] args) {

        List<String> li=Arrays.asList("Naveen","Naveen","Ravali","Harshi","Naveen");
		System.out.println(li);
		String subString="Naveen";
		IntStream.range(0, li.size()).filter(i->li.get(i).equals(subString)).forEach(System.out::println);
		System.out.println(li.lastIndexOf("Ravali"));

	}
}
