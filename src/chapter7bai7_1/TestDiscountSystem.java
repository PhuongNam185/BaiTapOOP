package chapter7bai7_1;

import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice");
        customer1.setMember(true);
        customer1.setMemberType("Premium");

        Visit visit1 = new Visit(customer1.getName(), new Date());
        visit1.setServiceExpense(100);
        visit1.setProductExpense(50);

        System.out.println(visit1); // Display visit information
        System.out.println("Total Expense: " + visit1.getTotalExpense()); // Calculate total expense

        Customer customer2 = new Customer("Bob");
        customer2.setMember(true);
        customer2.setMemberType("Gold");

        Visit visit2 = new Visit(customer2.getName(), new Date());
        visit2.setServiceExpense(200);
        visit2.setProductExpense(100);

        System.out.println(visit2); // Display visit information
        System.out.println("Total Expense: " + visit2.getTotalExpense()); // Calculate total expense

        Customer customer3 = new Customer("Charlie");
        customer3.setMember(false);

        Visit visit3 = new Visit(customer3.getName(), new Date());
        visit3.setServiceExpense(150);
        visit3.setProductExpense(75);

        System.out.println(visit3); // Display visit information
        System.out.println("Total Expense: " + visit3.getTotalExpense()); // Calculate total expense
    }
}
