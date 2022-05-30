/**
* Java1. HomeWork5
*
* @autor Andrey Zhilenkov
* @ version 22.09.2021
*/
package ru.geekbrains;

class Employee {

    private String fullname;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    Employee(String fullname, String position, String email, String phoneNumber, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "Full Name: " + fullname + "\n" + "Position: " + position + "\n" +
                "Email: " + email + "\n" + "PhoneNumber: " + phoneNumber + "\n" +
                "Salary: " + salary + "\n" + "Age: " + age + "\n";
    }

    public int getAge() {
        return age;
    }
}

