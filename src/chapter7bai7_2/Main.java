package chapter7bai7_2;

public class Main {
    public static void main(String[] args) {
        PolyLine polyline = new PolyLine();
        polyline.appendPoint(0, 0);
        polyline.appendPoint(3, 4);
        polyline.appendPoint(new Point(6, 8));

        System.out.println("PolyLine: " + polyline);
        System.out.println("Length: " + polyline.getLength());

        // Kiểm thử
        testAppendPoint();
        testGetLength();
    }

    public static void testAppendPoint() {
        PolyLine polyline = new PolyLine();
        polyline.appendPoint(0, 0);
        polyline.appendPoint(3, 4);
        polyline.appendPoint(new Point(6, 8));

        if ("{(0,0)(3,4)(6,8)}".equals(polyline.toString())) {
            System.out.println("testAppendPoint passed.");
        } else {
            System.out.println("testAppendPoint failed.");
        }
    }

    public static void testGetLength() {
        PolyLine polyline = new PolyLine();
        polyline.appendPoint(0, 0);
        polyline.appendPoint(3, 4); // Khoảng cách là 5 đơn vị
        polyline.appendPoint(new Point(6, 8)); // Khoảng cách tiếp theo là 5 đơn vị

        if (Double.compare(10.0, polyline.getLength()) == 0) {
            System.out.println("testGetLength passed.");
        } else {
            System.out.println("testGetLength failed.");
        }
    }
}
