package chapter3bai3_5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    private static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1 || day > DAYS_IN_MONTHS[month - 1]) {
            return false;
        }
        if (month == 2 && isLeapYear(year) && day <= 29) {
            return true;
        }
        return day <= DAYS_IN_MONTHS[month - 1];
    }

    public int getDayOfWeek(int year, int month, int day) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid date.");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (isValidDate(year, month, day)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year.");
        }
    }

    public void setMonth(int month) {
        if (isValidDate(year, month, day)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month.");
        }
    }

    public void setDay(int day) {
        if (isValidDate(year, month, day)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day.");
        }
    }

    public String toString() {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return weekdays[getDayOfWeek(year, month, day) - 1] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    // Example method for nextDay
    public MyDate nextDay() {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        return new MyDate(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH) + 1,
                calendar.get(Calendar.DAY_OF_MONTH)
        );
    }

    public boolean previousDay( ) { return false; }

    public boolean previousYear() {
        return false;
    }
}
