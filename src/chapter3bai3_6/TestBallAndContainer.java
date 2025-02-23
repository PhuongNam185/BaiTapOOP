package chapter3bai3_6;

public class TestBallAndContainer {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 45);
        Container container = new Container(0, 0, 100, 100);

        System.out.println(ball);               // Expected: Ball[(50.0,50.0),speed=(7.0710677,-7.0710677)]
        System.out.println(container);          // Expected: Container[(0,0),(100,100)]

        for (int i = 0; i < 15; i++) {
            ball.move();
            if (!container.collides(ball)) {
                if (ball.getX() - ball.getRadius() < container.getX() ||
                        ball.getX() + ball.getRadius() > container.getX() + container.getWidth()) {
                    ball.reflectHorizontal();
                }
                if (ball.getY() - ball.getRadius() < container.getY() ||
                        ball.getY() + ball.getRadius() > container.getY() + container.getHeight()) {
                    ball.reflectVertical();
                }
            }
            System.out.println(ball);
        }
    }
}
