package ru.geekbrains;

public class Cat {
    private String name;
    private int appetite;

    public int getAppetite() {
        return appetite;
    }

    Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public void info(int i) {
        System.out.println("Cat - " + name + " eat " + (i + 1) + " time");
    }

    public void satietyInfo() {
        System.out.println("Cat did not have enough food");
    }
}
