/**
 * Java1. HomeWork5
 *
 * @autor Andrey Zhilenkov
 * @ version 22.09.2021
 */
package ru.geekbrains;


public class lesson5 {

    public static void main(String[] args) {

        Employee employee = new Employee();

        Employee[] person = new Employee[5];
        person[0] = new Employee("Petrov Petr", "Master", "petr@gmail.com",
                "+79219999999", 3500, 45);
        person[1] = new Employee("Fdorov Fedor", "Engeneer", "fedor@gmail.com",
                "+79218888888", 3300, 38);
        person[2] = new Employee("Zakharov Zakhar", "Assistant", "zahar@gmail.com",
                "+79217777777", 3000, 25);
        person[3] = new Employee("Makarov Makar", "Boss", "makar@gmail.com",
                "+79216666666", 4000, 28);
        person[4] = new Employee("Djabarov Djabar", "Фccountant", "djabar@gmail.com",
                "+79215555555", 3800, 43);

        for (int i = 0; i < 5; i++) {
            if (person[i].getAge() > 40) {
                System.out.println(person[i]);
            }
        }
    }
}
