package java8.StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMax {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Béla", "Cecil", "Dóra");

        // Legnagyobb név (ábécé szerint)
        Optional<String> maxName = names.stream()
                .max(Comparator.naturalOrder());
        maxName.ifPresent(name -> System.out.println("Max: " + name));

        // Legrövidebb név (hossz szerint)
        names.stream()
                .min(Comparator.comparingInt(String::length))
                .ifPresent(name -> System.out.println("Min: " + name));
    }
}
