package chapter3bai3_1;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3, 4);
        MyComplex c2 = new MyComplex(1, -1);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        System.out.println("c1 is real? " + c1.isReal());
        System.out.println("c1 is imaginary? " + c1.isImaginary());

        System.out.println("Magnitude of c1: " + c1.magnitude());
        System.out.println("Argument of c1: " + c1.argument());

        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("c1 equals (3, 4)? " + c1.equals(3, 4));

        MyComplex c3 = c1.addNew(c2);
        System.out.println("c1 + c2 = " + c3);

        MyComplex c4 = c1.subtractNew(c2);
        System.out.println("c1 - c2 = " + c4);

        MyComplex c5 = c1.multiply(c2);
        System.out.println("c1 * c2 = " + c5);

        MyComplex c6 = c1.divide(c2);
        System.out.println("c1 / c2 = " + c6);

        MyComplex c7 = c1.conjugate();
        System.out.println("Conjugate of c1: " + c7);
    }
}
