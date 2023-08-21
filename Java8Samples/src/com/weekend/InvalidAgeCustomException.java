package com.weekend;

public class InvalidAgeCustomException {
	
	 public static void validate(int age) throws InvalidAgeException {
		// TODO Auto-generated method stub
		 if(age<18) 
		 {
			 throw new InvalidAgeException("You are not eligible to vote");
		 }
		 else
		 {
			 System.out.println("Welcome to vote");
		 }
		
	}
	
	public static void main(String[] args) {
		try {
		validate(13);
		
	}
		catch (InvalidAgeException ie) {
			System.out.println("Erroe in catch block");
		System.out.println(ie);
		}
System.out.println("Rest of the code");
	

}
}
