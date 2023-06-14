package com.weekend;

public class Car {

	
	    String color;
	    int speed;
	    int newColor;

	    void start() {
	        System.out.println("Car started");
	    }
	
	    public static void main(String[] args) {
	        Car myCar = new Car();
	        myCar.color = "Red";
	        myCar.speed = 60;
	        myCar.start();
	    }
	
	
}
