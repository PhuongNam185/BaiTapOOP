package chapter6bai6_4;

public class TestMovable {
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

        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        System.out.println("Initial Circle: " + circle); // Expected: MovableCircle[center=MovablePoint[x=0, y=0, xSpeed=1, ySpeed=1], radius=5]

        circle.moveUp();
        System.out.println("After moveUp: " + circle); // Expected: MovableCircle[center=MovablePoint[x=0, y=-1, xSpeed=1, ySpeed=1], radius=5]

        circle.moveDown();
        System.out.println("After moveDown: " + circle); // Expected: MovableCircle[center=MovablePoint[x=0, y=0, xSpeed=1, ySpeed=1], radius=5]

        circle.moveLeft();
        System.out.println("After moveLeft: " + circle); // Expected: MovableCircle[center=MovablePoint[x=-1, y=0, xSpeed=1, ySpeed=1], radius=5]

        circle.moveRight();
        System.out.println("After moveRight: " + circle); // Expected: MovableCircle[center=MovablePoint[x=0, y=0, xSpeed=1, ySpeed=1], radius=5]
    }
}
