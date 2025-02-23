package chapter8bai8_1;

public class MyIntStack {
    private int[] contents;
    private int tos; // Top of the stack

    // constructors
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public void push(int element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        contents[++tos] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return contents[tos--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }
}
