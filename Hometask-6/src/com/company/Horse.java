package com.company;

public class Horse implements Animal {

    private String name = "Jerry";  //это ведь поле?
    String food;
    String location;

    public Horse(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse издает звук laugh");
    }


    @Override
    public void eat() {
        System.out.println("Horse eats");
    }

    public void sleep() {
        System.out.println("Horse sleeps");
    }

}
