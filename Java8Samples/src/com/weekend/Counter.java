package com.weekend;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	private final ReentrantLock lock = new ReentrantLock();
	private int count = 0;

	public void increment() {

		lock.lock();

		try {

			int newCount = ++count;

			System.out.println(newCount);

		} finally {
			lock.unlock();
		}

	}
	public static void main(String[] args) {
		
	

	int input1 = 4;
	int input2 = 2;
	int input[] =  {4, 1, 2, 5};
	        int[] topScores = Arrays.stream(input).boxed().sorted(Comparator.reverseOrder()).limit(input2).mapToInt(Integer::intValue).toArray();

	        int sum = Arrays.stream(topScores).sum();
	        System.out.println("sum "+sum);
	}
}
