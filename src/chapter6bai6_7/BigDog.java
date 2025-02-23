package chapter6bai6_7;


public class BigDog extends Dog {
    public BigDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog another) {
        if (another instanceof BigDog) {
            System.out.println("Wooooooow");
        } else {
            System.out.println("Woooow");
        }
    }

    @Override
    public String toString() {
        return "BigDog[" + super.toString() + "]";
    }
}
