package java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamAPIFilter {
        public static void main(String[] args) {
                // Example of using Stream API in Java 8
                List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

                // Using Stream to filter and print names starting with 'A'
                names.stream()
                                .filter(name -> name.startsWith("A"))
                                .forEach(System.out::println);
        }
}
