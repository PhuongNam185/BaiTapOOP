package chapter3bai3_4;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Current Time: " + time);

        time.nextSecond();
        System.out.println("After nextSecond: " + time);

        time.previousSecond();
        time.previousSecond();
        System.out.println("After two previousSeconds: " + time);

        MyTime time2 = new MyTime(12, 30, 15);
        System.out.println("Another Time: " + time2);

        time2.nextMinute();
        System.out.println("After nextMinute: " + time2);

        time2.nextHour();
        System.out.println("After nextHour: " + time2);
    }
}
