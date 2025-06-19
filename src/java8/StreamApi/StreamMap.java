package java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Béla", "Cecil");

        names.stream()
            .map(name -> name.toUpperCase())
            .forEach(System.out::println);
    }
}
