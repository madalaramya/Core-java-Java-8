package com.weekend;

public class ThreadExampl extends Thread {
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
            Thread.yield();
        }
    }


    public static void main(String[] args) {
    	ThreadExampl t1 = new ThreadExampl();
    	
        t1.start();

        ThreadExampl t2 = new ThreadExampl();
        t2.start();
    
}
}