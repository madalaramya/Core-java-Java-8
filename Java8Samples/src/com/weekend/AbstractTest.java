package com.weekend;

public abstract class AbstractTest  implements InterTest2,InterTest
{
	public  static int a=10;
	public void Test()
	{
		System.out.println("Hello world");
	}
	
	public static void Test4()
	{
		System.out.println("Instatic method");
	}
	
 AbstractTest() {
		// TODO Auto-generated constructor stub
	}
	
	
	  abstract void Test2();

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		InterTest2.super.m2();
	}

	


	

}
