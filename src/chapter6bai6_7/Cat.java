package chapter6bai6_7;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }

    public void purr() {
        System.out.println("Purr");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
