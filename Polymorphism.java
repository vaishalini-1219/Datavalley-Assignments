import java.util.*;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat Meows");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}