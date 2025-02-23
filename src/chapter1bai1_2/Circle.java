package chapter1bai1_2;

public class Circle {
        private double radius = 1.0;
        public double Cricle () {
            return radius;
        }
        public void getRadius () {
            radius = 1.0;
        }
        public void setRadius (double radius) {
            this.radius = radius;
        }
        public double getArea () {
            return Math.PI * radius * radius;
        }
        public double getCircumference () {
            return 2 * Math.PI * radius;
        }
        public String toString () {
            return "Circle [radius=" + radius + "]";
        }

}
