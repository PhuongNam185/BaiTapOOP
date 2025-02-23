package chapter4bai4_3;

public class TestPointAndMovablePoint {
    public static void main(String[] args) {
        // Test Point class
        Point point = new Point(2.0f, 3.0f) {
            @Override
            public MovablePoint move() {
                return null;
            }
        };
        System.out.println("Initial point: " + point); // Expected: (2.0,3.0)

        point.setXY(4.0f, 5.0f);
        System.out.println("Updated point: " + point); // Expected: (4.0,5.0)
        float[] coords = point.getXY();
        System.out.println("X: " + coords[0] + ", Y: " + coords[1]); // Expected: X: 4.0, Y: 5.0

        // Test MovablePoint class
        MovablePoint movablePoint1 = new MovablePoint(0.0f, 0.0f, 1.0f, 1.0f);
        System.out.println("Initial movable point: " + movablePoint1); // Expected: (0.0,0.0),speed=(1.0,1.0)
        movablePoint1.move();
        System.out.println("Moved movable point: " + movablePoint1); // Expected: (1.0,1.0),speed=(1.0,1.0)

        MovablePoint movablePoint2 = new MovablePoint(2.0f, 3.0f, 1.0f, 2.0f);
        System.out.println("Initial movable point 2: " + movablePoint2); // Expected: (2.0,3.0),speed=(1.0,2.0)
        movablePoint2.move();
        System.out.println("Moved movable point 2: " + movablePoint2); // Expected: (3.0,5.0),speed=(1.0,2.0)

        movablePoint2.setSpeed(0.5f, 0.5f);
        System.out.println("Updated speed: " + movablePoint2); // Expected: (3.0,5.0),speed=(0.5,0.5)
        movablePoint2.move();
        System.out.println("Moved with updated speed: " + movablePoint2); // Expected: (3.5,5.5),speed=(0.5,0.5)
    }
}
