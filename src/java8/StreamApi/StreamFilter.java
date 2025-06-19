package java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Béla", "Cecil", "Dóra");

        names.stream()
            .filter(name -> name.length() > 4)
            .forEach(System.out::println);
    }
}
