package chapter2bai2_8;

public class MyCircleTest {

    public static void main(String[] args) {
        testDefaultConstructor();
        testParameterizedConstructor();
        testSettersAndGetters();
        testGetArea();
        testGetCircumference();
        testDistance();
        System.out.println("All tests passed!");
    }

    public static void testDefaultConstructor() {
        MyCircle circle = new MyCircle();
        assert circle.getRadius() == 1 : "Default radius should be 1";
        assert circle.getCenter().equals(new MyPoint(0, 0)) : "Default center should be (0,0)";
    }

    public static void testParameterizedConstructor() {
        MyCircle circle = new MyCircle(2, 3, 5);
        assert circle.getRadius() == 5 : "Radius should be 5";
        assert circle.getCenter().equals(new MyPoint(2, 3)) : "Center should be (2,3)";
    }

    public static void testSettersAndGetters() {
        MyCircle circle = new MyCircle();
        circle.setRadius(10);
        circle.setCenter(new MyPoint(5, 5));
        assert circle.getRadius() == 10 : "Radius should be 10";
        assert circle.getCenter().equals(new MyPoint(5, 5)) : "Center should be (5,5)";
    }

    public static void testGetArea() {
        MyCircle circle = new MyCircle(2, 3, 2);
        assert Math.abs(circle.getArea() - 4 * Math.PI) < 0.001 : "Area should be 4 * PI";
    }

    public static void testGetCircumference() {
        MyCircle circle = new MyCircle(2, 3, 2);
        assert Math.abs(circle.getCircumference() - 4 * Math.PI) < 0.001 : "Circumference should be 4 * PI";
    }

    public static void testDistance() {
        MyCircle circle1 = new MyCircle(2, 3, 2);
        MyCircle circle2 = new MyCircle(5, 7, 2);
        assert Math.abs(circle1.distance(circle2) - 5) < 0.001 : "Distance should be 5";
    }
}
