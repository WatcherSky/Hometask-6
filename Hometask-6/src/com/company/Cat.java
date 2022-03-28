package com.company;

public class Cat implements Animal {

         String name = "Tom";
         String food;
         String location;

        public Cat(String name, String food, String location) {
            this.name = name;
            this.food = food;
            this.location = location;
        }

        @Override
        public void makeNoise() {
        System.out.println("Cat издает звук meow");
        }


    @Override
         public void eat() {
        System.out.println("Cat eats");
    }


    @Override
        public void sleep() {
            System.out.println("Cat sleeps");
        }
}
