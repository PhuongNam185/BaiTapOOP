package chapter3bai3_7;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }

    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow((x - ball.getX()), 2) + Math.pow((y - ball.getY()), 2));
        return distance < 1.0;
    }

    public void kick(Ball ball) {
        ball.setXYZ(x, y, z);
    }

    @Override
    public String toString() {
        return "Player[number=" + number + ", position=(" + x + "," + y + "," + z + ")]";
    }
}
