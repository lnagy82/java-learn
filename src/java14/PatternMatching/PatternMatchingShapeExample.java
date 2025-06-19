package java14.PatternMatching;

abstract class Shape {}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }
}

class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) { this.width = width; this.height = height; }
}

public class PatternMatchingShapeExample {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5.0),
            new Rectangle(4.0, 6.0)
        };

        for (Shape shape : shapes) {
            if (shape instanceof Circle c) {
                System.out.println("Circle area: " + (Math.PI * c.radius * c.radius));
            } else if (shape instanceof Rectangle r) {
                System.out.println("Rectangle area: " + (r.width * r.height));
            } else {
                System.out.println("Unknown shape");
            }
        }
    }
}

