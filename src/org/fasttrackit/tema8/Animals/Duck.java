package org.fasttrackit.tema8.Animals;

public class Duck implements Animal{

    public String talk() {
        System.out.println("Mak Mak!");
        return "Mak";
    }

    public String eat() {
        System.out.println("Vegetables");
        return "Vegetables";
    }

    public String walk() {
        System.out.println("Walking and swimming");
        return "Duck is walking and swimming";
    }
}
