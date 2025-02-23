package chapter2bai2_6;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    // Default constructor
    public MyPoint() {}

    // Parameterized constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Method to get both x and y
    public int[] getXY() {
        return new int[]{x, y};
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Method to calculate distance to another point with given coordinates
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    // Method to calculate distance to another MyPoint object
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    // Method to calculate distance to the origin
    public double distance() {
        return distance(0, 0);
    }
}
