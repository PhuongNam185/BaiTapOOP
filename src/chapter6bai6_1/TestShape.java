package chapter6bai6_1;

public class TestShape {
    public static void main(String[] args) {
        // Test Shape class (this is abstract and cannot be instantiated directly)

        // Test Circle class
        Circle circle = new Circle(5.0, "green", true);
        System.out.println(circle); // Expected: Circle[Shape[color=green, filled=true], radius=5.0]
        System.out.println("Circle Area: " + circle.getArea()); // Expected: Circle Area: 78.53981633974483
        System.out.println("Circle Perimeter: " + circle.getPerimeter()); // Expected: Circle Perimeter: 31.41592653589793

        // Test Rectangle class
        Rectangle rectangle = new Rectangle(4.0, 6.0, "yellow", true);
        System.out.println(rectangle); // Expected: Rectangle[Shape[color=yellow, filled=true], width=4.0, length=6.0]
        System.out.println("Rectangle Area: " + rectangle.getArea()); // Expected: Rectangle Area: 24.0
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter()); // Expected: Rectangle Perimeter: 20.0

        // Test Square class
        Square square = new Square(3.0, "red", false);
        System.out.println(square); // Expected: Square[Rectangle[Shape[color=red, filled=false], width=3.0, length=3.0]]
        System.out.println("Square Area: " + square.getArea()); // Expected: Square Area: 9.0
        System.out.println("Square Perimeter: " + square.getPerimeter()); // Expected: Square Perimeter: 12.0
    }
}

