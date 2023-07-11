package org.fasttrackit.tema8.Animals;

import org.fasttrackit.tema8.Animals.*;

public class TestingInterfaceAnimal {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Mouse mice = new Mouse();
        Duck duck = new Duck();

        System.out.println(String.format("Dog sounds %s, walks like %s and %s", dog.talk(), dog.walk(), dog.eat()));
        System.out.println("-------------------------------------------------");
        System.out.println(String.format("Cat sounds %s, walks like %s and %s", cat.talk(), cat.walk(), cat.eat()));
    }
}
