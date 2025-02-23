package chapter6bai6_3;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Initial Point: " + point); // Expected: MovablePoint[x=0, y=0, xSpeed=2, ySpeed=3]

        point.moveUp();
        System.out.println("After moveUp: " + point); // Expected: MovablePoint[x=0, y=-3, xSpeed=2, ySpeed=3]

        point.moveDown();
        System.out.println("After moveDown: " + point); // Expected: MovablePoint[x=0, y=0, xSpeed=2, ySpeed=3]

        point.moveLeft();
        System.out.println("After moveLeft: " + point); // Expected: MovablePoint[x=-2, y=0, xSpeed=2, ySpeed=3]

        point.moveRight();
        System.out.println("After moveRight: " + point); // Expected: MovablePoint[x=0, y=0, xSpeed=2, ySpeed=3]
    }
}

