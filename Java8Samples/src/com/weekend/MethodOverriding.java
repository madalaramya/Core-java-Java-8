package com.weekend;


	
	class Parent {
	int a=9;
	    public  void staticMethod() {
	        System.out.println("Parent's static method");
	    }
	    
	    public  void staticMethod1() {
	        System.out.println("Parent's static method1");
	    }
	}
    
	class Child extends Parent {
	    public  void staticMethod() {
	        System.out.println("Child's static method");
	    }
	    
	    public  void staticMethod2() {
	        System.out.println("Child's static method2");
	    }
	}
	public class MethodOverriding {
	    public static void main(String[] args) {
	       // Parent.staticMethod();  // Output: Parent's static method
	        //Child.staticMethod();   // Output: Child's static method
	        
	        Parent parent = new Parent();
	        parent.staticMethod();  // Output: Parent's static method
	        
	        Child child = new Child();
	        child.staticMethod();   // Output: Parent's static method
	        
	        child.staticMethod1();
	        child.staticMethod2();
	    }
	}

	

