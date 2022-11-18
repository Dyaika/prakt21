package com.company;

public class Car implements Nameable{
    String name;

    public Car() {
        name = "Default car";
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
