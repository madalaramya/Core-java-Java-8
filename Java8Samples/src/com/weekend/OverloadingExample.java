package com.weekend;

public class OverloadingExample {
	int a=10;
	int b=10;
	int c=10;
	int d=10;
	public static void main(String[] args) {
		OverloadingExample ob = new OverloadingExample();
		ob.add(10, 10, 10);
		System.out.println(ob.add(10, 10, 10));
	}
	
	    public double add(int a, int b,int c,int d) {
	        return a + b;
	    }
	    
	    public double add(double a, double b) {
	        return a + b;
	    }
	    
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	}


