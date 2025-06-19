package java8.StreamApi;

import java.util.stream.Stream;

public class StreamConcatenation {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("alma", "körte");
        Stream<String> stream2 = Stream.of("barack", "szilva");
        Stream<String> combined = Stream.concat(stream1, stream2);
        combined.forEach(System.out::println);
    }
}
