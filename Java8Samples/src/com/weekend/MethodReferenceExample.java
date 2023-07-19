package com.weekend;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Example 1: Using method reference with forEach
        names.forEach(System.out::println);

       
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Consumer<Integer> evenNumberConsumer = n -> {
            System.out.println(n);
            // Perform other actions on even numbers
        };

        numbers.stream()
               .filter(isEven)
               .forEach(evenNumberConsumer);
        
        
    }
}
