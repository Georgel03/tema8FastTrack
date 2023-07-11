package org.fasttrackit.tema8.Animals;

public class Chicken implements Animal {

    public String talk() {
        System.out.println("Cucuriguu!");
        return "Cucurigu";
    }

    public String eat() {
        System.out.println("Vegetables");
        return "Vegetables";
    }

    public String walk() {
        System.out.println("Both flying and walking");
        return "Chicken is both flying and walking";
    }
}
