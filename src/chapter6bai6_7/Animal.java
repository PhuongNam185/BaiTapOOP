package chapter6bai6_7;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void greets();

    @Override
    public String toString() {
        return "Animal[name=" + name + ", age=" + age + "]";
    }

    public void greeting() {

    }
}
