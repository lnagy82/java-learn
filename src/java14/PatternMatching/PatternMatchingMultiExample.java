package java14.PatternMatching;

public class PatternMatchingMultiExample {
    public static void main(String[] args) {
        Object[] items = { "Hello", 42, 3.14, true };

        for (Object item : items) {
            if (item instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (item instanceof Integer i) {
                System.out.println("Integer: " + (i * 2));
            } else if (item instanceof Double d) {
                System.out.println("Double: " + (d + 1.0));
            } else {
                System.out.println("Other type: " + item);
            }
        }
    }
}
