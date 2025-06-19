package java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamDistinct {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Béla", "Anna", "Cecil", "Béla");

        names.stream()
            .distinct()
            .forEach(System.out::println);
    }
}
