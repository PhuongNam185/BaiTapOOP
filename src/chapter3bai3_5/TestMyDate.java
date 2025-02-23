package chapter3bai3_5;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);             // Expected: Tuesday 28 Feb 2012
        System.out.println(d1.nextDay());   // Expected: Wednesday 29 Feb 2012
        System.out.println(d1.nextDay());   // Expected: Thursday 1 Mar 2012

        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);                 // Expected: Monday 2 Jan 2012
        System.out.println(d2.previousDay());   // Expected: Sunday 1 Jan 2012
        System.out.println(d2.previousDay());   // Expected: Saturday 31 Dec 2011

        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());  // Expected: Monday 28 Feb 2011

        // Testing invalid dates
        try {
            MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected: Invalid date.
        }

        try {
            MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  // Expected: Invalid date.
        }
    }
}
