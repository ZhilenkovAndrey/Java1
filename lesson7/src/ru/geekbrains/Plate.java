package ru.geekbrains;

import java.util.Scanner;

public class Plate {
    private int food;
    Scanner scanner = new Scanner(System.in);

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int addFood() {
        System.out.println(" Введите количество еды которое нужно будет добавить в тарелку: ");
        int addFood = scanner.nextInt();
        food += addFood;
        return food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        }
    }

    public void info() {
        System.out.println("Plate " + food);
    }
}
