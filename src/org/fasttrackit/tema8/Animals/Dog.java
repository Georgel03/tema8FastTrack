package org.fasttrackit.tema8.Animals;

public class Dog implements Animal {

    public String talk() {
        System.out.println("Hamm!");
        return "HAM HAM";
    }

    public String eat() {
        System.out.println("Meat");
        return "Dogs eat meat";
    }

    public String walk() {
        System.out.println("On their toes");
        return "Dog walks";
    }
}
