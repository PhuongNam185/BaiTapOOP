package chapter1bai1_4;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getSalary() {
        return salary;
    }
    public String getName () {
        return firstName + " " + lastName;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary () {
        return salary*12;
    }
    public int raiseSalary (int i) {
        return(getAnnualSalary()-salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
