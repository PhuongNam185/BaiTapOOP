package chapter1bai1_9;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    private float delta;
    public Ball (float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    public float getX() {
        return x;

    }
    public float getY() {
        return y;
    }
    public float SetX(float x) {
        this.x = x;
        return x;
    }
    public float SetY(float y) {
        this.y = y;
        return y;
    }
    public int getRadius() {
        return radius;
    }
    public float setRadius(int radius) {
        this.radius = radius;
        return radius;
    }
    public float getXDelta() {
        return xDelta;
    }
    public float getYDelta() {
        return yDelta;
    }
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move (float delta) {
        x += xDelta * delta;
        y += yDelta * delta;
    }
    public void reflectHorizontal () {
        xDelta = -xDelta * delta;
    }
    public void reflectVertical () {
        yDelta = -yDelta * delta;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                "speed{"+
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                '}';
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void move() {
    }
}
