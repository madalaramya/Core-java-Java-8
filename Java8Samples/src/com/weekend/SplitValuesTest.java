package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SplitValuesTest {
	
	public static void main(String[] args) {
		String val="123,345,678,891";
		List<Integer> li= Arrays.stream(val.split(",")).map(Integer::parseInt).collect(Collectors.toList());
				System.out.println(li);
	}

}
