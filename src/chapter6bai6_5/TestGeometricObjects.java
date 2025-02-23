package chapter6bai6_5;


public class TestGeometricObjects {
    public static void main(String[] args) {
        // Test Circle class
        Circle circle = new Circle(5.0);
        System.out.println(circle); // Expected: Circle[radius=5.0]
        System.out.println("Circle Area: " + circle.getArea()); // Expected: Circle Area: 78.53981633974483
        System.out.println("Circle Perimeter: " + circle.getPerimeter()); // Expected: Circle Perimeter: 31.41592653589793

        // Test ResizableCircle class
        ResizableCircle resizableCircle = new ResizableCircle(10.0);
        System.out.println(resizableCircle); // Expected: ResizableCircle[Circle[radius=10.0]]
        System.out.println("ResizableCircle Area: " + resizableCircle.getArea()); // Expected: ResizableCircle Area: 314.1592653589793
        System.out.println("ResizableCircle Perimeter: " + resizableCircle.getPerimeter()); // Expected: ResizableCircle Perimeter: 62.83185307179586

        resizableCircle.resize(50);
        System.out.println("After resizing: " + resizableCircle); // Expected: ResizableCircle[Circle[radius=5.0]]
        System.out.println("ResizableCircle Area after resizing: " + resizableCircle.getArea()); // Expected: ResizableCircle Area after resizing: 78.53981633974483
        System.out.println("ResizableCircle Perimeter after resizing: " + resizableCircle.getPerimeter()); // Expected: ResizableCircle Perimeter after resizing: 31.41592653589793
    }
}
