package com.weekend;

public class ImmutableStrins {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
sb=new StringBuffer("tuto");
		  //Even though reference variable is final
		  //we can perform any changes to corresponding object.
		 // sb.append("studypoint");
		  System.out.println(sb);

		  //Here, we will get compile time error because
		  //we can't reassign reference variable to any new object.
		//  sb = new StringBuffer("Hello Javastudypoint");
		  System.out.println(sb);
	}
}
