package com.weekend;

import java.util.stream.IntStream;

public class SumofEvandOdd {
	public static void main(String[] args) {
		System.out.println(IntStream.rangeClosed(0, 100).filter(x->x%2==0).sum());
		System.out.println(IntStream.rangeClosed(0, 100).filter(x->x%2==1).sum());
	}

}
