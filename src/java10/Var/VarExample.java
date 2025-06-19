package java10.Var;

import java.util.ArrayList;

public class VarExample {
    public static void main(String[] args) {
        // Egyszerű típusok
        var message = "Hello Java 10";
        var number = 100;

        // Összetett típus
        var list = new ArrayList<String>();
        list.add("one");
        list.add("two");

        // For-each ciklus
        for (var item : list) {
            System.out.println(item);
        }

        // Try-with-resources
        try (var reader = new java.io.BufferedReader(new java.io.StringReader("hi"))) {
            System.out.println(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
