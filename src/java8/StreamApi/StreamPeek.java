package java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamPeek {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Béla", "Cecil");

        names.stream()
            .filter(name -> name.length() > 4)
            .peek(name -> System.out.println("Szűrt név: " + name))
            .forEach(System.out::println);
    }
}
