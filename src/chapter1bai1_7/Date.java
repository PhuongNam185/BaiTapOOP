package chapter1bai1_7;

public class Date {
    private int year;
    private int month;
    private int day;
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public  int getDay () {
        return day;
    }
    public  int getMonth () {
        return month;
    }
    public  int getYear () {
        return year;
    }
    public void setDay (int day) {
        this.day = day;
    }
    public void setMonth (int month) {
        this.month = month;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", year, month, day);

    }

}