package com.weekend;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  class  ExtendsAbstractClas extends AbstractTest {
	
	
	public static void main(String[] args) {
		
		
		
		LocalDateTime locatdate=LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy mmss");
		String formatter1=locatdate.format(formatter);
		System.out.println(formatter1);
		System.err.println(locatdate);
		AbstractTest ebc=new ExtendsAbstractClas();
		ExtendsAbstractClas.Test4();
		ebc.Test();
			System.out.println(AbstractTest.a);
	
	}

	@Override
	void Test2() {
		// TODO Auto-generated method stub
		System.out.println("In normal class");
	}
//can we extend one abstract class with another abstract class

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void publicMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		super.m2();
	}
}
