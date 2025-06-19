package java19.GuardedPattern;

public class ComplexSwitchPipeline {

    // Sealed hierarchia
    sealed interface Shape permits Circle, Rectangle, Triangle {}

    record Circle(double radius) implements Shape {}

    record Rectangle(double width, double height) implements Shape {}

    record Triangle(double a, double b, double c) implements Shape {}

    // Komplex switch
    static String describe(Shape s) {
        return switch (s) {
            case Circle(double r) when r <= 0 -> "Invalid Circle (radius must be > 0)";
            case Circle(double r) -> "Circle with radius " + r;

            case Rectangle(double w, double h) when w <= 0 || h <= 0 ->
                "Invalid Rectangle (sides must be > 0)";
            case Rectangle(double w, double h) when w == h ->
                "Square with side " + w;
            case Rectangle(double w, double h) ->
                "Rectangle with width " + w + " and height " + h;

            case Triangle(double a, double b, double c)
                when a + b <= c || a + c <= b || b + c <= a ->
                "Invalid Triangle (triangle inequality violated)";
            case Triangle(double a, double b, double c) ->
                "Triangle with sides " + a + ", " + b + ", " + c;

            // Kiegészítő default, ha bővül
            default -> throw new IllegalStateException("Unknown shape: " + s);
        };
    }

    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Circle(0),
            new Rectangle(4, 4),
            new Rectangle(3, 6),
            new Rectangle(-1, 2),
            new Triangle(3, 4, 5),
            new Triangle(1, 2, 10) // Invalid!
        };

        for (Shape s : shapes) {
            System.out.println(describe(s));
        }
    }
}
