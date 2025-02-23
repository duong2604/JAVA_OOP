package org.example;


abstract class Bird {
    double weight;
    double height;

    abstract void sound();

    public void eat() {
    }
}

class Duck extends Bird {
    String color;

    void sound() {
        System.out.println("Duck sound");
    }

}


interface Mammal {
    void sound();

    default void sleep() {
        System.out.println("Mammal sleep.....");
    }
}

class Cat implements Mammal {
    @Override
    public void sound() {
        System.out.println("Cat sound");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Bird bird = new Duck();
        bird.sound();
    }
}
