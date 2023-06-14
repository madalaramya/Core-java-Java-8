package com.weekend;


class Animal1 {
	void bark() {
        System.out.println("Animal is eating@@@");
    }
}

class Dog extends Animal1 {
	@Override
	
    void bark() {
		//super.bark();
        System.out.println("Dog is barking11");
    }
}

class Labrador extends Dog {
	//Labrador obj = Labrador.createInstance();
    void color() {
        System.out.println("Labrador is black");
    }
	public static Labrador createInstance() {
		// TODO Auto-generated method stub
		return new Labrador();
	}
}

public class Animal  {
    public static void main(String[] args) {
    	Labrador obj = Labrador.createInstance();
    	Dog dog=new Dog();
    	dog.bark();
    	
        obj.bark();
        obj.color();  // Output: Labrador is black
        obj.bark();   // Output: Dog is barking
    }

	private static Animal createInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
