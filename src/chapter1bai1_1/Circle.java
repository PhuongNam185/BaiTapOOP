package chapter1bai1_1;

public class Circle {
    private double radius;
    private String color;
    public Circle () {
        radius = 1.0;
        color = "red";
    }
    public Circle (double r) {
        radius = r;
        color = "red";

    }
    public String getColor () {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius (double r) {
        radius = r;
    }
    public void setColor (String c) {
        color = c;
    }
    public String toString (){
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

}