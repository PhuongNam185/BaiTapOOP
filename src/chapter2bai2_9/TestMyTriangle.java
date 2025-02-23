package chapter2bai2_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(new MyPoint(0, 0), new MyPoint(3, 0), new MyPoint(0, 4));
        System.out.println(t1.toString());
        System.out.println("Perimeter: " + t1.getPerimeter());
        t1.printType();

        MyTriangle t2 = new MyTriangle(0, 0, 1, 1, 2, 0);
        System.out.println(t2.toString());
        System.out.println("Perimeter: " + t2.getPerimeter());
        t2.printType();
    }
}
