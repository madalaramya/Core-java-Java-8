package com.weekend;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
       HashMap<String, Integer> concurrentHashMap = new HashMap<>();

        // Add key-value pairs
        concurrentHashMap.put("John", 25);
        concurrentHashMap.put("Alice", 30);
        concurrentHashMap.put("Bob", 35);

        // Perform concurrent operations
        Runnable runnable1 = () -> {
            concurrentHashMap.put("Alice", concurrentHashMap.get("Alice") + 1);
            concurrentHashMap.put("John", concurrentHashMap.getOrDefault("John", 0) + 1);
        };

        Runnable runnable2 = () -> {
            concurrentHashMap.putIfAbsent("Tom", 40);
            concurrentHashMap.remove("Bob");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the contents of the ConcurrentHashMap
        concurrentHashMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
