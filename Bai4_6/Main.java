package Bai4_6;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Animal ===");
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal);

        System.out.println("\n=== Testing Mammal ===");
        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal);

        System.out.println("\n=== Testing Cat ===");
        Cat cat = new Cat("Whiskers");
        System.out.println(cat);
        cat.greets();

        System.out.println("\n=== Testing Dog ===");
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");
        System.out.println(dog1);
        dog1.greets();
        dog1.greets(dog2);

        System.out.println("\n=== Testing Polymorphism ===");
        Animal animalCat = new Cat("Kitty");
        Animal animalDog = new Dog("Rocky");
        System.out.println(animalCat);
        System.out.println(animalDog);
        System.out.println("\n=== Calling Subclass Methods via Casting ===");
        if (animalCat instanceof Cat) {
            ((Cat) animalCat).greets();
        }
        if (animalDog instanceof Dog) {
            ((Dog) animalDog).greets();
        }
    }
}