package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Cat cat = new Cat("Tom", "Fish", "house");
        Dog dog = new Dog("Spike", "Meat", "yard");
        Horse horse = new Horse("Jerry", "Steam", "stall");
        Veterinarian veterinarian = new Veterinarian();

        cat.eat();
        cat.makeNoise();
        cat.sleep();

        dog.eat();
        horse.makeNoise();
        dog.sleep();

        Animal[] animals = { cat, dog, horse };

        for (int i = 0; i < animals.length; i++ ) {
            veterinarian.treatAnimal(animals[i]);
        }
    }
}