package org.example;

class Animal {
    public void makeSound() {
        System.out.println("make sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("wow wow...");
    }

    public void fetch() {
        System.out.println("I am fetching...");
    }

}


public class Polymophism {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
//        dog.fetch(); // Not call
    }
}
