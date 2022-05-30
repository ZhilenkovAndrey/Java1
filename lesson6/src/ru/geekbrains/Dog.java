package ru.geekbrains;

class Dog extends Animal {

    @Override
    public void swim() {
    }

    Dog(String name) {
        super.name = name;
        super.runLength = 500;
        super.swimLength = 10;
    }
}