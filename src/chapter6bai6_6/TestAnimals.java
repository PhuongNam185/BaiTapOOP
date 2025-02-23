package chapter6bai6_6;

public class TestAnimals {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty");
        cat.greets(); // Expected: Meow

        Dog dog1 = new Dog("Rover");
        dog1.greets(); // Expected: Woof

        Dog dog2 = new Dog("Buddy");
        dog1.greets(dog2); // Expected: Wooof

        BigDog bigDog1 = new BigDog("Bruno");
        bigDog1.greets(); // Expected: Woow

        BigDog bigDog2 = new BigDog("Max");
        bigDog1.greets(bigDog2); // Expected: Wooooooow
        bigDog1.greets(dog1); // Expected: Woooow
    }
}

