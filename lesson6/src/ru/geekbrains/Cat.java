package ru.geekbrains;

 class Cat extends Animal{

    Cat(String name) {
        super.name = name;
        super.runLength = 200;
    }

     @Override
     public void swim() {
         System.out.printf("%s не умеет плавать.\n", name);
     }
 }
