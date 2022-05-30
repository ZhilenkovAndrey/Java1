package ru.geekbrains;

/**
 * Java1. HomeWork7
 *
 * @autor Andrey Zhilenkov
 * @ version 30.09.2021
 */

public class Lesson7 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 15, true);
        Cat cat2 = new Cat("Murzik", 19,true);
        Cat cat3 = new Cat("Boris", 13, true);
        Cat cat4 = new Cat("Vaska", 20, true);
        Plate plate = new Plate(100);
        plate.addFood();

        plate.info();
        System.out.println();
        Cat[] cats = {cat1, cat2, cat3, cat4};
        for (int i = 0; i <= 1; i++) {
            for (Cat cat : cats) {
                cat.info(i);
                if (plate.getFood() < cat.getAppetite()) {
                    cat.satietyInfo();
                }
                cat.eat(plate);
                plate.info();
                System.out.println();
            }
        }
    }
}

