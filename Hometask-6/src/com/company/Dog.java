package com.company;

public class Dog implements Animal {

    private String name = "Spike";
    String food;
    String location;


    public Dog(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }


    @Override
    public void makeNoise() {
        System.out.println("Dog издает звук bark");
    }


    @Override
    public void eat() {
        System.out.println("Dog eats");
    }


    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}
