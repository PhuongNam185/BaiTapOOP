package chapter3bai3_6;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball) {
        float ballMinX = ball.getX() - ball.getRadius();
        float ballMaxX = ball.getX() + ball.getRadius();
        float ballMinY = ball.getY() - ball.getRadius();
        float ballMaxY = ball.getY() + ball.getRadius();

        return ballMinX <= x2 && ballMaxX >= x1 &&
                ballMinY <= y2 && ballMaxY >= y1;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}

