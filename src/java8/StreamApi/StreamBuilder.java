package java8.StreamApi;

import java.util.stream.Stream;

public class StreamBuilder {
        public static void main(String[] args) {
                Stream.Builder<String> builder = Stream.builder();

                builder.add("Apple");
                builder.add("Banana");
                builder.add("Cherry");

                Stream<String> fruitStream = builder.build();
                fruitStream.forEach(System.out::println);
        }
}
