package java8.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
            .reduce(0, (sum1, x) -> sum1 + x);

        System.out.println("Összeg: " + sum);
    }
}
