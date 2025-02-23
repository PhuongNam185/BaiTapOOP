package chapter4bai4_3;

public class TestPoint2DAndPoint3D {
    public static void main(String[] args) {
        // Test Point2D class
        Point2D point2D = new Point2D(2.0f, 3.0f);
        System.out.println("Initial Point2D: " + point2D); // Expected: (2.0,3.0)

        point2D.setXY(4.0f, 5.0f);
        System.out.println("Updated Point2D: " + point2D); // Expected: (4.0,5.0)
        float[] coords2D = point2D.getXY();
        System.out.println("Point2D X: " + coords2D[0] + ", Y: " + coords2D[1]); // Expected: X: 4.0, Y: 5.0

        // Test Point3D class
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Initial Point3D: " + point3D); // Expected: (1.0,2.0,3.0)

        point3D.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Updated Point3D: " + point3D); // Expected: (4.0,5.0,6.0)
        float[] coords3D = point3D.getXYZ();
        System.out.println("Point3D X: " + coords3D[0] + ", Y: " + coords3D[1] + ", Z: " + coords3D[2]); // Expected: X: 4.0, Y: 5.0, Z: 6.0
    }
}
