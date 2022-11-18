package com.company;

public class Animal implements Nameable{
    private String name;

    public Animal() {
        name = "Default animal";
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
