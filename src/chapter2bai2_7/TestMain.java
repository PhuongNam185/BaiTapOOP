package chapter2bai2_7;

        public class TestMain {
            public static void main(String[] args) {
                // Tạo các đối tượng MyPoint
                MyPoint p1 = new MyPoint(1, 2);
                MyPoint p2 = new MyPoint(4, 6);

                // Tạo đối tượng MyLine sử dụng MyPoint
                MyLine line1 = new MyLine(p1, p2);

                // Tạo đối tượng MyLine sử dụng tọa độ
                MyLine line2 = new MyLine(3, 3, 7, 8);

                // Kiểm tra các phương thức của MyPoint
                System.out.println("Point p1: " + p1); // (1,2)
                System.out.println("Point p2: " + p2); // (4,6)
                System.out.println("p1.getX(): " + p1.getX()); // 1
                System.out.println("p1.getY(): " + p1.getY()); // 2

                // Kiểm tra các phương thức của MyLine
                System.out.println("Line1: " + line1); // MyLine[begin=(1,2),end=(4,6)]
                System.out.println("Line1 length: " + line1.getLength()); // 5.0
                System.out.println("Line1 gradient: " + Math.toDegrees(line1.getGradient())); // 53.13 degrees (arctan value in degrees)

                System.out.println("Line2: " + line2); // MyLine[begin=(3,3),end=(7,8)]
                System.out.println("Line2 length: " + line2.getLength()); // 6.4031242374328485
                System.out.println("Line2 gradient: " + Math.toDegrees(line2.getGradient())); // 51.34 degrees (arctan value in degrees)
            }
        }

