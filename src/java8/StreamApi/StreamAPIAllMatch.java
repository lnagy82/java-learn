package java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamAPIAllMatch {
        public static void main(String[] args) {
                // Example of using Stream API in Java 8
                List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
                names.stream().anyMatch(name -> name.length() > 3);
        }
}
