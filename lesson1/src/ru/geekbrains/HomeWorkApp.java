package ru.geekbrains;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printCollor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println(" Orange \n \n" +
                " Banana \n \n" +
                " Apple \n \n");
    }

    static void checkSumSign() {
        int a = 3, b = -4, sum;
        sum = a + b;
        System.out.println(sum >= 0 ? " Сумма полложительная \n" : " Сумма отрицательная \n");

    }

    static void printCollor() {
        int value = 5;
        if (value <= 0)
            System.out.println(" Красный \n");
        if (value > 0 && value <= 100)
            System.out.println(" Желтый \n");
        if (value > 100)
            System.out.println(" Зеленый \n");
    }

    static void compareNumbers() {
        int a = 5, b = 3;
        if (a >= b)
            System.out.println(a >= b ? " a >= b \n" : " a < b \n");

    }

}
