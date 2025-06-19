package java11.VarInLambda;

import java.util.List;

public class LambdaVarExample {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three");

        // Klasszikus lambda
        list.stream().filter(s -> s.length() > 3).forEach(System.out::println);

        // Java 11: var a paraméterben
        list.stream().filter((var s) -> s.length() > 3).forEach(System.out::println);

        // Annotáció + var
        list.stream().filter((@Deprecated var s) -> s.length() > 3).forEach(System.out::println);
    }
}