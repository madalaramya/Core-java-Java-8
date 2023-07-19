package com.weekend;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSuplierExample {
	public static void main(String[] args) {
		Random random=new Random();
		Supplier<Integer> evenNumbersSupplierList=()->{
			int Number=random.nextInt(100);
		return Number%2==0?Number:Number+1;
		};
		Supplier<Integer> oddNumbersSupplierList=()->{int Number=random.nextInt(100);
		return Number%2!=0?Number:Number+1;
		};
		int evenNumber=evenNumbersSupplierList.get();
		int oddNumber=oddNumbersSupplierList.get();
		System.out.println(evenNumber);
		System.out.println(oddNumber);
	}

}
