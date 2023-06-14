package com.weekend;




public class StringBuildertsafe {
    private static StringBuilder sharedStringBuilder = new StringBuilder();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new StringBuilderModifier("Thread 1"));
        Thread thread2 = new Thread(new StringBuilderModifier("Thread 2"));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final StringBuilder content: " + sharedStringBuilder.toString());
    }

    static class StringBuilderModifier implements Runnable {
        private String threadName;

        public StringBuilderModifier(String name) {
            threadName = name;
        }

        @Override
        public void run() {
            synchronized (sharedStringBuilder) {
                System.out.println("Thread " + threadName + " acquired lock.");

                sharedStringBuilder.append("Hello ");
                sharedStringBuilder.append("World!");

                System.out.println("Thread " + threadName + " released lock.");
            }
        }
    }
}
