package chapter4bai4_6;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal); // Expected: Animal[name=Generic Animal]

        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal); // Expected: Mammal[Animal[name=Generic Mammal]]

        Cat cat = new Cat("Kitty");
        System.out.println(cat); // Expected: Cat[Mammal[Animal[name=Kitty]]]
        cat.greets(); // Expected: Meow

        Dog dog1 = new Dog("Rover");
        System.out.println(dog1); // Expected: Dog[Mammal[Animal[name=Rover]]]
        dog1.greets(); // Expected: Woof

        Dog dog2 = new Dog("Buddy");
        dog1.greets(dog2); // Expected: Woooof
    }
}

