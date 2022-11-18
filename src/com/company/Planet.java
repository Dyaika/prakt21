package com.company;

public class Planet implements Nameable{
    String name;

    public Planet() {
        name = "Default planet";
    }

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
