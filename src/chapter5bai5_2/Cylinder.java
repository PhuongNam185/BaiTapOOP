package chapter5bai5_1;

public class Cylinder {
    private Circle base;
    private double height = 1.0;

    public Cylinder() {
        this.base = new Circle();
    }

    public Cylinder(double radius) {
        this.base = new Circle(radius);
    }

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base + ", height=" + height + "]";
    }
}
