package java14.PatternMatching;

public class PatternMatchingDemo {
    public static void main(String[] args) {
        Object obj = "Hello Java 14!";

        // Régi mód:
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("Old way: " + s.toUpperCase());
        }

        // Új mód:
        if (obj instanceof String s) {
            System.out.println("Pattern matching: " + s.toUpperCase());
        }
    }
}
