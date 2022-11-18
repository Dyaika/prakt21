package com.company;

public class Main {

    public static void main(String[] args) {
        Nameable smthng = new Animal();
        System.out.println(smthng.getName());

        smthng = new Car();
        System.out.println(smthng.getName());

        smthng = new Planet();
        System.out.println(smthng.getName());
    }
}
