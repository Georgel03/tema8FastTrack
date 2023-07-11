package org.fasttrackit.tema8.Animals;

public class Cat implements Animal {

    public String talk() {
        System.out.println("Miau!");
        return "MIAU-MIAU";
    }

    public String eat() {
        System.out.println("Meat");
        return "Cat eats meat";
    }

    public String walk() {
        System.out.println("On their toes");
        return "Cat-walking";
    }
}
