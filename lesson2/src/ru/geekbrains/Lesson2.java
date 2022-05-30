/**
 * Java1. HomeWork2
 *
 * @autor Andrey Zhilenkov
 * @ version 10.09.2021
 */
package ru.geekbrains;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lesson2 {

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//создаем обьект считывающий данные с клавиатуры//

        boolean isInteger = false;
        int number1 = 0;
        do {
            System.out.println("Веедите первое целое число: ");//запрос на ввод с клавиатуры//
            try {
                number1 = Integer.parseInt(reader.readLine());//записываем данные с клавиатуры в переменную int//
                isInteger = true;
            } catch (NumberFormatException e) {/// ловим не соответствующий ввод
                System.out.println(" Это не целое число");
            }
        } while (!isInteger);

        isInteger = false;
        int number2 = 0;
        do {
            System.out.println("Веедите второе целое число: ");//запрос на ввод с клавиатуры//
            try {
                number2 = Integer.parseInt(reader.readLine());//записываем данные с клавиатуры в переменную int//
                isInteger = true;
            } catch (NumberFormatException e) {// ловим не соответствующий ввод
                System.out.println(" Это не целое число");
            }
        } while (!isInteger);

        System.out.println(numberAnaliser(number1, number2) + " \n");

        isInteger = false;
        int number3 = 0;
        do {
            System.out.println("Веедите целое число: ");//запрос на ввод с клавиатуры//
            try {
                number3 = Integer.parseInt(reader.readLine());//записываем данные с клавиатуры в переменную int//
                isInteger = true;
            } catch (NumberFormatException e) {// ловим не соответствующий ввод
                System.out.println(" Это не целое число");
            }
        } while (!isInteger);

        signNumber(number3);//вызов метода//

        isInteger = false;
        int number4 = 0;
        do {
            System.out.println("Веедите количество строк: ");//запрос на ввод с клавиатуры
            try {
                number4 = Integer.parseInt(reader.readLine());//записываем данные с клавиатуры в переменную int
                if (number4 > 0)
                    isInteger = true;
            } catch (NumberFormatException e) {// ловим не соответствующий ввод
                System.out.println(" Это не отражает количество строк ");
            }
        } while (!isInteger);
        System.out.println(" Введите строку");//Запрашиваем строку
        String line = reader.readLine();//Считываем строку

        printLineNTimes(number4, line);

        //  isInteger = false;
        int year = 0;
        do {
            System.out.println("Веедите год ");//запрос на ввод с клавиатуры//
            try {
                year = Integer.parseInt(reader.readLine());//записываем данные с клавиатуры в переменную int//
                //  if (year < 0 && year > 2021){
                //     throw new Exception();}
                //   isInteger = true;
            }//catch (NumberFormatException e) {// ловим несоответствующий ввод
            //  System.out.println(" Это не год \n");
        } catch(YearException e){// ловим несоответствующий ввод
            System.out.println(" Это не год \n");
        }
    } while(!year);


        System.out.println(leapYear(year));
}

    static boolean numberAnaliser(int a, int b) {
        return (10 <= a + b && a + b <= 20);
    }

    static void signNumber(int a) {//метод принимающий число и  печатающий положительное оно или отрицательное//
        System.out.println(a >= 0 ? "Число положительное \n" : "Число отрицательное \n");
    }

    static boolean signAnaliser(int a) {//метод возващающий true если число отрицательное и false если полоительное//
        return (a <= 0);
    }

    static void printLineNTimes(int n, String lines) {//метод печатающий заданную строку заданное количество раз//
        for (int i = 1; i <= n; i++)
            System.out.println(" " + lines);

    }

    static boolean leapYear(int year) {// метод высчитывающий весокосный год//
        if (year % 100 != 0)
            return (year % 4 == 0);
        else
            return (year % 400 == 0);

    }
}

