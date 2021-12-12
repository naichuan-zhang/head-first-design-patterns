package com.naichuan.strategy;

import java.util.ArrayList;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class AnimalTest {
    public static void main(String[] args) {
        new AnimalTest().makeSomeAnimals();
    }

    private void makeSomeAnimals() {
        Animal dog = new Dog();
        Animal cat = new Cat();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.forEach(Animal::makeSound);
    }

    public abstract static class Animal {
        abstract void makeSound();
    }

    public class Dog extends Animal {
        @Override
        void makeSound() {
            bark();
        }

        private void bark() {
            System.out.println("Woof");
        }
    }

    public class Cat extends Animal {
        @Override
        void makeSound() {
            meow();
        }

        private void meow() {
            System.out.println("Meow");
        }
    }
}
