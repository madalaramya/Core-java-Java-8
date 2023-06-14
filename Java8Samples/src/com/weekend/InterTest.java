package com.weekend;


	
	public interface InterTest {
	    int CONSTANT = 10;  // This is public, static, and final

	    void publicMethod();  // This is public and abstract

	    
	    void m1();
	    
	    default void m4()
	    {
	  	 System.out.println("in m2 in intertest2"); 
	    }

	   
	    public static void testMethod()
	    {
	    	System.out.println("Static method");
	    	privateMethod();
	    	
	    }
	    
	    default void defaultMethod() {
	        System.out.println("Default method ");
	        privateMethod();
	    }
	  
	    // From Java 9 onwards, interfaces can have private methods
	    private static void privateMethod() {
	        System.out.println("Private method");
	    }


		public void m2();
	}

	

