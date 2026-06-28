package org.example.OOPTechniques;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(name + " miauna.");
    }
}