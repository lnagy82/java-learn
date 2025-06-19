package java8.Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> maybeName = findNameById(1);

        // Ha van érték, kiírjuk
        maybeName.ifPresent(name -> System.out.println("Név: " + name));

        // Ha nincs érték, alapértelmezettet adunk vissza
        String nameOrDefault = maybeName.orElse("Ismeretlen");
        System.out.println("Eredmény: " + nameOrDefault);
    }

    // Példa metódus, ami Optional-t ad vissza
    static Optional<String> findNameById(int id) {
        if (id == 1) {
            return Optional.of("Anna");
        } else {
            return Optional.empty();
        }
    }
}
