package chapter3bai3_2;

public class TestMyPolynomial {
    public static void main(String[] args) {
        // Tạo đối tượng MyPolynomial
        MyPolynomial p1 = new MyPolynomial(1.0, 0.0, 3.0); // 3.0x^2 + 0.0x + 1.0
        MyPolynomial p2 = new MyPolynomial(2.0, -4.0, 1.0); // 1.0x^2 - 4.0x + 2.0

        // Hiển thị các đa thức
        System.out.println("Polynomial p1: " + p1);
        System.out.println("Polynomial p2: " + p2);

        // Tính tổng của hai đa thức
        MyPolynomial sum = p1.add(p2);
        System.out.println("Sum: " + sum);

        // Tính tích của hai đa thức
        MyPolynomial product = p1.multiply(p2);
        System.out.println("Product: " + product);

        // Đánh giá giá trị của đa thức p1 tại x = 2.0
        double evalResult = p1.evaluate(2.0);
        System.out.println("p1 evaluated at x=2.0: " + evalResult);
    }
}
