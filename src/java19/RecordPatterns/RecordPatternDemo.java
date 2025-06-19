package java19.RecordPatterns;

public class RecordPatternDemo {
    record Point(int x, int y) {}

    public static void main(String[] args) {
        Point p = new Point(10, 20);

        if (p instanceof Point(int x, int y)) {
            System.out.println("X: " + x + ", Y: " + y);
        }

        String desc = switch (p) {
            case Point(int a, int b) when a == b -> "Diagonal";
            case Point(int a, int b) -> "Non-diagonal";
        };
        System.out.println(desc);
    }
}
