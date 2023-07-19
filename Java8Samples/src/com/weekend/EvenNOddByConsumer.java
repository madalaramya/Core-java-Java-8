package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EvenNOddByConsumer {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(12,23,52,6,8,10,84);
		
		 Consumer<Integer> printEvenNumbers =n->System.out.println("Even Numbers"+n);
		 Consumer<Integer> printOddNumbers=n->System.out.println("Odd Numbers"+n);
		 numbers.stream().filter(n->n%2==0).forEach(printEvenNumbers);
		 numbers.stream().filter(n->n%2!=0).forEach(printOddNumbers);
		 
	}

}
