package java14.Records;

public class RecordDemo {
    public static void main(String[] args) {
        // Record példány létrehozása
        Person p = new Person("Alice", 30);

        // Getterek (neve: mezőnév)
        System.out.println("Name: " + p.name());
        System.out.println("Age: " + p.age());

        // toString()
        System.out.println(p);

        // equals(), hashCode()
        Person p2 = new Person("Alice", 30);
        System.out.println("Equal? " + p.equals(p2));
    }
}

// Record definíció
record Person(String name, int age) {}
