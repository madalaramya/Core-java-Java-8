package com.weekend;

public class Emp {
	String name;
	public Emp()
	{
		
	}
	public static void main(String[] args) {
	 Emp e1=new Emp();
	 Emp e2=new Emp();
	 String e3="Ramya";
	 String e4="Ramya";
	 
	 if(e1.equals(e2));
	 {
		 System.out.println("Obj equal");
	 }
	 if(e3==e4)
	 {
		 System.out.println("e1==e2 equal");
	 }
		
	}

}
