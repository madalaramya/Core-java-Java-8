package com.weekend;

public class TestInterface implements InterTest,InterTest2{

	@Override
	public void publicMethod() {
		System.out.println("this is public method from class");
		
	}
	
	public  void testMethod()
	{
		System.out.println("Testmethd");
	}
	
	public static void main(String[] args) {

		InterTest.testMethod();
		
		InterTest	 inc = new  TestInterface();
		
		//InterTest2 inc2=new TestInterface();
		inc.defaultMethod();
		
		
		inc.publicMethod();
		
		inc.m1();
	//	inc2.m1();
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		//InterTest.super.m2();
	}
	
	
	

}
