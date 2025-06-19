package java8.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StreamCollector {
    public static void main(String[] args) {
        
        Collector<String, List<String>, List<String>> myCollector =
            Collector.of(
                ArrayList::new,
                List::add,
                (left, right) -> { left.addAll(right); return left; }
            );

        List<String> result = Stream.of("a", "b", "c").collect(myCollector);
        System.out.println(result);
    }
}
