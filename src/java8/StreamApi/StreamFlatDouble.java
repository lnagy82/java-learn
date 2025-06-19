package java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamFlatDouble {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8, 9)
        );

        numbers.stream()
            .flatMap(list -> list.stream())
            .forEach(System.out::println);
    }
}
