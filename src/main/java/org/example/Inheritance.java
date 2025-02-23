package org.example;

class Parent {
    String lastName = "Duong";

    Parent(String lastName) {
        this.lastName = lastName;
    }

    void show() {
        System.out.println("This is a parent class");
    }

}

class Child extends Parent {
    private String firstName;
    private int age;


    Child(String firstName, String lastName) {
        super(lastName);
        this.firstName = firstName;
    }

    public String getFullName() {
        return this.firstName + super.lastName;
    }

    void show() {
        System.out.println("This is a child class");
    }
}


public class Inheritance {

    public static void main(String[] args) {
        Child child = new Child("Duong", "Danny");
        child.show();
        System.out.println(child.getFullName());
    }
}
