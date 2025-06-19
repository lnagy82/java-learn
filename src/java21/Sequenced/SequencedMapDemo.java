package java21.Sequenced;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedMapDemo {
    public static void main(String[] args) {
        SequencedMap<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());

        SequencedMap<String, Integer> reversed = map.reversed();
        System.out.println("Reversed: " + reversed);
    }
}
