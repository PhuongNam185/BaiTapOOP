package chapter6bai6_2;

public class TestGeometricObject {
    public static void main(String[] args) {
        // Test Circle class
        Circle circle = new Circle(5.0);
        System.out.println(circle); // Expected: Circle[radius=5.0]
        System.out.println("Circle Area: " + circle.getArea()); // Expected: Circle Area: 78.53981633974483
        System.out.println("Circle Perimeter: " + circle.getPerimeter()); // Expected: Circle Perimeter: 31.41592653589793

        // Test Rectangle class
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println(rectangle); // Expected: Rectangle[width=4.0, length=6.0]
        System.out.println("Rectangle Area: " + rectangle.getArea()); // Expected: Rectangle Area: 24.0
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter()); // Expected: Rectangle Perimeter: 20.0
    }
}
