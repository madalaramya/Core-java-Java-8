package com.weekend;

public class ClassLocking extends Thread{
	
	    public  synchronized void classLevelMethod() {
	        // Code block synchronized on the class itself
	        // Only one thread can execute this method at a time for the entire class
	    	  for (int i = 0; i < 5; i++) {
	        // ...
	    	System.out.println(Thread.currentThread());
	    }
	    }
public static void main(String[] args) {
	ClassLocking col=new ClassLocking();

	// Usage
	Thread thread1 = new Thread(() -> {
		col.classLevelMethod();
	});

	Thread thread2 = new Thread(() -> {
		col.classLevelMethod();
	});

	thread1.start();
	thread2.start();
}

}
