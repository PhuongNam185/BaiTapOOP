package chapter6bai6_7;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Wooof");
    }

    public void play() {
        System.out.println("Playing fetch!");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
