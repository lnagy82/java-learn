package java8.StreamApi;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        Stream.iterate(1, n -> (n +1) * 2)
            .limit(10)
            .forEach(System.out::println);
    }
}
