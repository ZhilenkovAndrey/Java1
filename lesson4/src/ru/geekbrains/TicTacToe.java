package ru.geekbrains;

import java.util.Random;
import java.util.Scanner;

/**
 * Java1. HomeWork4
 *
 * @autor Andrey Zhilenkov
 * @ version 11.09.2021
 */

public class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_EMPTY = '.';
    final char SIGN_0 = '0';
    char[][] field;
    Random random;
    Scanner scanner;
    int winningSequence;
    int heightLength;

    public static void main(String[] args) {

        new TicTacToe().game();
    }

    void initGameParameters() {// ask user field parameters

        do {
            System.out.println(" Введите размер квадратного игрового поля: "); //field size
            heightLength = scanner.nextInt();
            System.out.println(" Введите длинну выйгрышной линии: "); //win line size+
            winningSequence = scanner.nextInt();
        } while (!checkCorrectParameters(winningSequence, heightLength)); //parameters checking
    }

    TicTacToe() { //constructor

        random = new Random();
        scanner = new Scanner(System.in);
    }

    void initField() { //game field initialisation

        field = new char[heightLength][heightLength];
        for (int i = 0; i < heightLength; i++) {
            for (int j = 0; j < heightLength; j++) {
                field[i][j] = SIGN_EMPTY;  //overgrowth with empty cells
            }
        }
        System.out.println();
    }

    void printGameField() {//game field printing

        for (int i = 0; i < heightLength; i++) {
            for (int j = 0; j < heightLength; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    void game() { //game

        initGameParameters();
        initField();
        printGameField();
        while (true) {
            humanTurn();
            if (isCheckWin(SIGN_X)) {
                System.out.println(" Вы выиграли!");
                break;
            }
            if (isTAbleFull()) {
                System.out.println(" Поле заполнено, игра окончена.");
                break;
            }
            ioTurn(SIGN_X, SIGN_0);
            if (isCheckWin(SIGN_0)) {
                System.out.println(" Вы проиграли...");
                break;
            }
            printGameField();
            if (isTAbleFull()) {
                break;
            }
        }
        printGameField();
    }

    boolean checkCorrectTurn(int x, int y) {

        if (x < 0 || x > heightLength - 1 || y < 0 || y > heightLength - 1) {
            return false;
        }
        return field[x][y] == SIGN_EMPTY;
    }

    boolean checkCorrectParameters(int a, int b) {

        if (b < 0 || a < 0 ||
                a > b) {
            return false;
        }
        return true;
    }

    void humanTurn() {

        int x, y;
        do {
            System.out.println(" Введите координаты x и y вашего хода в пределах " +
                    "от 1 до " + heightLength);
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!checkCorrectTurn(x, y));
        field[x][y] = SIGN_X;
    }

    void ioTurn(char human, char io) {

        int x, y;

        for (x = 0; x < heightLength; x++) {
            for (y = 0; y < heightLength; y++) {

                if (checkCorrectTurn(x, y)) { //cheсk and bloсk human win
                    field[x][y] = human;
                    if (isCheckWin(human)) {
                        field[x][y] = io;
                        return;
                    }
                    field[x][y] = SIGN_EMPTY;
                }
            }
        }

        for (x = 0; x < heightLength; x++) {
            for (y = 0; y < heightLength; y++) {
                if (checkCorrectTurn(x, y)) { //checking ai win
                    field[x][y] = io;
                    if (isCheckWin(io)) {
                        field[x][y] = io;
                        return;
                    }
                    field[x][y] = SIGN_EMPTY;
                }
            }
        }

        do {
            x = random.nextInt(heightLength); //ai tun without logics
            y = random.nextInt(heightLength);
        } while (!checkCorrectTurn(x, y));
        field[x][y] = SIGN_0;
    }

    boolean isCheckWin(char check) {

        int sumCheck = 0;
        for (int j = 0; j <= heightLength - winningSequence; j++) {  //checking 1st diagonal
            for (int i = 0; i <= heightLength - winningSequence; i++) {
                if (field[i][j] == check) {
                    for (int k = 0; k < winningSequence; k++) {
                        if (field[i + k][j + k] == check) {
                            sumCheck++;
                        }
                    }
                    if (sumCheck == winningSequence) {
                        return true;
                    }
                    sumCheck = 0;
                }
            }
        }

        sumCheck = 0;
        for (int j = heightLength - 1; j >= winningSequence - 1; j--) {//checking 2nd diagonal
            for (int i = 0; i <= heightLength - winningSequence; i++) {
                if (field[i][j] == check) {
                    for (int k = 0; k < winningSequence; k++) {
                        if (field[i + k][j - k] == check) {
                            sumCheck++;
                        }
                    }
                    if (sumCheck == winningSequence) {
                        return true;
                    }
                    sumCheck = 0;
                }
            }
        }

        sumCheck = 0;
        for (int j = 0; j <= heightLength - 1; j++) {
            for (int i = 0; i <= heightLength - winningSequence; i++) { //checking vertical
                if (field[i][j] == check) {
                    for (int k = 0; k < winningSequence; k++) {
                        if (field[i + k][j] == check) {
                            sumCheck++;
                        }
                    }
                    if (sumCheck == winningSequence) {
                        return true;
                    }
                    sumCheck = 0;
                }
            }
        }

        sumCheck = 0;
        for (int j = 0; j <= heightLength - winningSequence; j++) {// checking horizontal
            for (int i = 0; i < heightLength; i++) {
                if (field[i][j] == check) {
                    for (int k = 0; k < winningSequence; k++) {
                        if (field[i][j + k] == check) {
                            sumCheck++;
                        }
                    }
                    if (sumCheck == winningSequence) {
                        return true;
                    }
                    sumCheck = 0;
                }
            }
        }
        return false;
    }

    boolean isTAbleFull() {

        for (int i = 0; i < heightLength; i++) { //checking fri place on field
            for (int j = 0; j < heightLength; j++) {
                if (field[i][j] != SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}