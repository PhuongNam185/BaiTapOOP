package chapter4bai4_2;

public class TestPersonStudentStaff {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St");
        System.out.println(person); // Expected: Person[name=John Doe,address=123 Main St]

        Student student = new Student("Jane Smith", "456 College Ave", "Computer Science", 2, 20000.0);
        System.out.println(student); // Expected: Student[Person[name=Jane Smith,address=456 College Ave],program=Computer Science,year=2,fee=20000.0]

        Staff staff = new Staff("Mark Johnson", "789 School Rd", "High School", 50000.0);
        System.out.println(staff); // Expected: Staff[Person[name=Mark Johnson,address=789 School Rd],school=High School,pay=50000.0]
    }
}
