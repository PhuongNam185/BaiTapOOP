package chapter6bai6_8;

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

        MovableRectangle rectangle = new MovableRectangle(0, 0, 2, 3, 1, 1);
        System.out.println("Initial Rectangle: " + rectangle); // Expected: MovableRectangle[topLeft=MovablePoint[x=0, y=0, xSpeed=1, ySpeed=1], bottomRight=MovablePoint[x=2, y=3, xSpeed=1, ySpeed=1]]

        rectangle.moveUp();
        System.out.println("After moveUp: " + rectangle); // Expected: MovableRectangle[topLeft=MovablePoint[x=0, y=-1, xSpeed=1, ySpeed=1], bottomRight=MovablePoint[x=2, y=2, xSpeed=1, ySpeed=1]]

        rectangle.moveDown();
        System.out.println("After moveDown: " + rectangle); // Expected: MovableRectangle[topLeft=MovablePoint[x=0, y=0, xSpeed=1, ySpeed=1], bottomRight=MovablePoint[x=2, y=3, xSpeed=1, ySpeed=1]]

        rectangle.moveLeft();
        System.out.println("After moveLeft: " + rectangle); // Expected: MovableRectangle[topLeft=MovablePoint[x=-1, y=0, xSpeed=1, ySpeed=1], bottomRight=MovablePoint[x=1, y=3, xSpeed=1, ySpeed=1]]

        rectangle.moveRight();
        System.out.println("After moveRight: " + rectangle); // Expected: MovableRectangle[topLeft=MovablePoint[x=0, y=0, xSpeed=1, ySpeed=1], bottomRight=MovablePoint[x=2, y=3, xSpeed=1, ySpeed=1]]
    }
}
