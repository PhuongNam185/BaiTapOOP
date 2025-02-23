package chapter8bai8_1;

public class Main {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack after pushing 1, 2, 3: " + stack.peek()); // Should print 3

        try {
            stack.push(4); // Should throw exception
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // Should print "Stack is full"
        }

        System.out.println("Pop: " + stack.pop()); // Should print 3
        System.out.println("Pop: " + stack.pop()); // Should print 2
        System.out.println("Pop: " + stack.pop()); // Should print 1

        try {
            stack.pop(); // Should throw exception
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // Should print "Stack is empty"
        }

        // Kiểm thử bổ sung
        testPush();
        testPop();
    }

    public static void testPush() {
        MyIntStack stack = new MyIntStack(2);
        stack.push(1);
        stack.push(2);

        if (stack.peek() == 2) {
            System.out.println("testPush passed.");
        } else {
            System.out.println("testPush failed.");
        }

        try {
            stack.push(3); // Should throw exception
        } catch (IllegalStateException e) {
            System.out.println("testPush exception: " + e.getMessage());
        }
    }

    public static void testPop() {
        MyIntStack stack = new MyIntStack(2);
        stack.push(1);
        stack.push(2);
        stack.pop();

        if (stack.peek() == 1) {
            System.out.println("testPop passed.");
        } else {
            System.out.println("testPop failed.");
        }

        stack.pop();

        try {
            stack.pop(); // Should throw exception
        } catch (IllegalStateException e) {
            System.out.println("testPop exception: " + e.getMessage());
        }
    }
}
