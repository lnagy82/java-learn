package java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamAPIMapToInt {
        public static void main(String[] args) {
                // Example of using Stream API in Java 8
                List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

                // Using Stream to filter and print names starting with 'A'
                int sum = names.stream()
                                .mapToInt(name -> name.length())
                                .peek(System.out::println) // Kiírja az egyes nevek hosszát
                                .sum();
                                System.out.println("Sum: " + sum);
        }
}
