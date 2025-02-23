package chapter6bai6_6;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
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
}
