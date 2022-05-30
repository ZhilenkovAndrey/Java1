package ru.geekbrains;

/**
 * Java1. HomeWork6
 *
 * @autor Andrey Zhilenkov
 * @ version 25.09.2021
 */
public class lesson6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Dog dog1 = new Dog("Sharik");

        Animal[] animals = {cat1, dog1};
        for (Animal animal : animals) {
            System.out.println();
            System.out.println(animal);
            animal.run();
            animal.swim();
        }
    }
}
