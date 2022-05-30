/**
 * Java1. HomeWork3
 *
 * @autor Andrey Zhilenkov
 * @ version 13.09.2021
 */
package ru.geekbrains;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class lesson3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path;

        array1();//method that flips the elements of an array
        System.out.println();
        System.out.println(" Нажмите Enter");
        path = scanner.nextLine();

        array2();//method filling the array from 1 to 100
        System.out.println();
        System.out.println(" Нажмите Enter");
        path = scanner.nextLine();

        array3();//method for drawing diagonals
        System.out.println();
        System.out.println(" Нажмите Enter");
        path = scanner.nextLine();

        array4();//method that multiplies numbers by 2
        System.out.println();
        System.out.println(" Нажмите Enter");
        path = scanner.nextLine();

        System.out.println(Arrays.toString(array5()));//method returning an array
        System.out.println();
        System.out.println(" Нажмите Enter");
        path = scanner.nextLine();

        System.out.println(Arrays.toString(array6()));// min and max elements of massiv
        System.out.println();
        System.out.println(" Нажмите Enter");
        path = scanner.nextLine();

        int arr7Length = (int) getScannerPositive(" Введите длинну массива:");//ask the user the length of the array
        System.out.println((array7(arr7Length)));//metod returning boolean
        System.out.println();
        System.out.println(" Нажмите Enter");
        path = scanner.nextLine();

        int arr8Length = (int) getScannerPositive(" Введите длинну массива: ");// metod shifting massive
        array8(arr8Length);
        System.out.println();
        System.out.println(" Нажмите Enter");
        path = scanner.nextLine();
    }

    public static double getScannerPositive(String message) {// class limiting input value
        Scanner scanner = new Scanner(System.in);
        double arrLength;
        do {
            System.out.println(message);
            arrLength = scanner.nextDouble();
        } while (arrLength < 0 && arrLength % 1 != 0);
        return arrLength;
    }

    public static double getScannerNegative(String message) {// class limiting input value
        Scanner scanner = new Scanner(System.in);
        double arrLength;
        do {
            System.out.println(message);
            arrLength = scanner.nextDouble();
        } while (arrLength % 1 != 0);
        return arrLength;
    }

    static void array1() {
        System.out.println();
        int arrLength = (int) getScannerPositive("Введите длинну одномерного массива: ");//read length of the array

        int[] arri = new int[arrLength];//define the array
        int[] arrj = new int[arrLength];//define the antiarray
        Random random = new Random();
        for (int i = 0; i <= arri.length - 1; i++) {
            arri[i] = random.nextInt(2);//fill the array
            if (arri[i] == 0)
                arrj[i] = 1;//difine the elements of antimassiv
            else
                arrj[i] = 0;
            System.out.print("  " + arri[i] + "  ");//print the array
            System.out.print("  " + arrj[i] + "\n");//print the antiarray
        }
    }

    static void array2() {
        int[] arr2 = new int[100];//define the array
        for (int i = 0; i <= 99; i++) {
            arr2[i] = i + 1;//difine the elements of massiv
            System.out.print(arr2[i] + " ");//print the array element
        }
        System.out.println();
    }

    static void array4() {//variant for demonstration of 4 tasks
        int arr4LengthHeight = (int) getScannerPositive("Введите длинну и ширину квадратного массива: ");//read the length and height of the array

        int[][] arr4 = new int[arr4LengthHeight][arr4LengthHeight];//define the array
        for (int i = 0; i <= arr4LengthHeight - 1; i++) {
            for (int j = 0; j <= arr4LengthHeight - 1; j++) {
                if (i == j || i == arr4LengthHeight - 1 - j)
                    arr4[i][j] = 1;//difine the elements of massiv's diagonal
                else arr4[i][j] = 0;//other elements of massiv
                System.out.print(arr4[i][j] + " ");////print the array element
            }
            System.out.println(" ");
        }
    }

    static void array44() {//short way of 4 tasks whithout demonstration
        int arr44LengthHeight = (int) getScannerPositive("Введите длинну и ширину квадратного массива: ");//ask the user the length and height of the array

        int[][] arr44 = new int[arr44LengthHeight][arr44LengthHeight];//define the array
        for (int i = 0; i <= arr44LengthHeight - 1; i++) {
            arr44[i][i] = 1;//difine the elements of massiv's 1st diagonal
            arr44[i][arr44LengthHeight - 1 - i] = 1;//difine the elements of massiv's 2nd diagonal
        }
    }

    static void array3() {

        int[] arr31 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//define the 1st array
        int[] arr32 = new int[arr31.length];////define the 2nd array
        for (int i = 0; i <= arr31.length - 1; i++) {
            if (arr31[i] < 6)
                arr32[i] = arr31[i] * 2;//change array elements
            else
                arr32[i] = arr31[i];

            System.out.print(" " + arr31[i] + " ");//print the array element
            System.out.print(" " + arr32[i] + " \n");//print the array element
        }
    }

    static int[] array5() {

        int len = (int) getScannerPositive(" Введите длинну массива: ");//ask the user the length of the array
        int[] initialValue = new int[len];//define the array

        System.out.println(" Введите элементы массива");
        for (int i = 0; i <= len - 1; i++)
            initialValue[i] = (int) getScannerNegative(" Введите элемент массива " + (i + 1) + ":");//difine the elements of massiv
        return initialValue;
    }

    static int[] array6() {
        int arr6Length = (int) getScannerPositive(" Введите длинну массива:");//ask the user the length of the array
        int[] arr6 = new int[arr6Length];//define the array
        int[] arr61 = new int[arr6Length];//define the array
        int max, min;

        System.out.println(" Введите элементы массива");//ask user array's elements
        for (int i = 0; i <= arr6Length - 1; i++) {
            arr61[i] = arr6[i] = (int) getScannerNegative(" Введите элемент массива " + (i + 1) + ":");//difine the elements of massiv
        }

        Arrays.sort(arr61);//sort elements frommin to max
        max = arr61[arr6Length - 1];
        min = arr61[0];
        System.out.println(" \n Максимальный элемент = " + max + "\n" +
                " Минимальный элемент = " + min + "\n");
        return arr6;
    }

    static boolean array7(int arr7Length) {
        int[] arr7 = new int[arr7Length];//define the array
        System.out.println(" Введите элементы массива");// ask user for massiv's elements

        for (int i = 0; i <= arr7Length - 1; i++) {
            arr7[i] = (int) getScannerNegative(" Введите элемент массива " + (i + 1) + ":");//difine the elements of massiv
        }
        int sumR = 0;
        int sumL = 0;
        int i = 0;

        for (i = 0; i <= arr7Length - 1; i++) {
            for (int j = i; j<arr7Length - 1; j++) {
                sumR = arr7[i] + sumR;
                sumL = arr7[arr7Length - j - 1] + sumL;//defin the summ of array's parts
            }
        }
        return (sumR == sumL);
    }

    static void array8(int arr8Length) {

        int[] arr8 = new int[arr8Length];//define the array
        System.out.println(" Введите элементы массива:");
        for (int i = 0; i < arr8Length; i++) {
            arr8[i] = (int) getScannerNegative(" Введите элемент массива " + (i + 1) + ":");//difine the elements of massiv
        }
        System.out.println(Arrays.toString(arr8));

        int n = (int) getScannerNegative(" Введите дельту смещения: ");// difine delta
        System.out.println();
        if (n < 0) {
          n = n + arr8Length;//define negativ delta
        } else {
            n = n;//define positiv delta
        }
        for (int i = 0; i < arr8Length - n; i++) {//cycle shift by 1 element fo n times
            int a = arr8[0];
            for (int j = 0; j < arr8Length - 1; j++) {//defin shift by 1 element
                arr8[j] = arr8[j + 1];
            }
            arr8[arr8Length - 1] = a;//definition the last element
        }
        System.out.println(Arrays.toString(arr8));
    }
}

