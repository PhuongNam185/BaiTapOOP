package chapter5bai5_1;


public class TestCircleAndCylinder {
    public static void main(String[] args) {
        // Test Circle class
        Circle circle = new Circle(2.0, "blue");
        System.out.println(circle); // Expected: Circle[radius=2.0, color=blue]
        System.out.println("Area: " + circle.getArea()); // Expected: Area: 12.566370614359172

        // Test Cylinder class
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1); // Expected: Cylinder[base=Circle[radius=1.0, color=red], height=1.0]
        System.out.println("Volume: " + cylinder1.getVolume()); // Expected: Volume: 3.141592653589793

        Cylinder cylinder2 = new Cylinder(2.0, 5.0, "green");
        System.out.println(cylinder2); // Expected: Cylinder[base=Circle[radius=2.0, color=green], height=5.0]
        System.out.println("Volume: " + cylinder2.getVolume()); // Expected: Volume: 62.83185307179586
    }
}
