
package ru.geekbrains;

abstract class Animal implements InterfaceAnimalRun, InterfaceAnimalSwim {

    @Override
    public void run() {
        System.out.printf("%s пробегает: %dm\n", name, runLength);
    }

    protected String name;
    protected int runLength;
    protected int swimLength;

    @Override
    public String toString() {
        return name;
    }
}
