package chapter6bai6_7;

public class TestAnimals {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty", 2);
        System.out.println(cat); // Expected: Cat[Animal[name=Kitty, age=2]]
        cat.greets(); // Expected: Meow
        ((Cat) cat).purr(); // Expected: Purr

        Dog dog1 = new Dog("Rover", 3);
        System.out.println(dog1); // Expected: Dog[Animal[name=Rover, age=3]]
        dog1.greets(); // Expected: Woof
        dog1.play(); // Expected: Playing fetch!

        Dog dog2 = new Dog("Buddy", 4);
        dog1.greets(dog2); // Expected: Wooof

        BigDog bigDog1 = new BigDog("Bruno", 5);
        System.out.println(bigDog1); // Expected: BigDog[Dog[Animal[name=Bruno, age=5]]]
        bigDog1.greets(); // Expected: Woow

        BigDog bigDog2 = new BigDog("Max", 6);
        bigDog1.greets(bigDog2); // Expected: Wooooooow
        bigDog1.greets(dog1); // Expected: Woooow
    }
}
