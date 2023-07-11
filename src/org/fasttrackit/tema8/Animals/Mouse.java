package org.fasttrackit.tema8.Animals;

public class Mouse implements Animal{

    public String talk() {
        System.out.println("Chitz Chitz!");
        return "Chitz Chitz";
    }

    public String eat() {
        System.out.println("Anything!");
        return "Mouse eats everything!";
    }

    public String walk() {
        System.out.println("On their toes");
        return "Mouse-walks";
    }
}
