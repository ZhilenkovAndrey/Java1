package ru.geekbrains;

import java.awt.*;
import java.util.LinkedList;

import static ru.geekbrains.GameSnake.CANVAS_HEIGHT;
import static ru.geekbrains.GameSnake.CANVAS_WIDTH;

public class Snake {

    private LinkedList<Cell> snake;
    private int direction;
//    private Food food;

    public Snake(int x, int y, int length, int direction) {
        snake = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            snake.add(new Cell(x - i, y, GameSnake.CELL_SIZE, GameSnake.SNAKE_COLOR));
        }
        this.direction = direction;
    }

    public void setDirection(int direction) {
        if ((direction >= GameSnake.KEY_LEFT) && (direction <= GameSnake.KEY_DOWN)) {
            if (Math.abs(this.direction - direction) != 2) {
                this.direction = direction;
            }
        }
    }

    public void move() {
        int x = snake.getFirst().getX();
        int y = snake.getFirst().getY();
        switch (direction) {
            GameSnake.KEY_LEFT:x--;
            if (x < 0) {
                x = GameSnake.CANVAS_WIDTH - 1;
            }
            break;
            GameSnake.KEY_RIGHT:x++;
            if (x == CANVAS_WIDTH) {
                x = 0;
            }
            break;
            GameSnake.KEY_UP:y--;
            if (y < 0) {
                y = GameSnake.CANVAS_HEIGHT - 1;
            }
            break;
            GameSnake.KEY_DOWN:y--;
            if (y == GameSnake.CANVAS_HEIGHT) {
                y = 0;
            }
            break;
        }

        public void paint (Graphics g){
            for (Cell cell : snake) {
                cell.paint(g);
            }
        }
    }
