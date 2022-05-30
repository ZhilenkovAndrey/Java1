package ru.geekbrains;

import java.awt.*;

public class Cell {
    private int size;
    private int x, y;
    private Color color;

    public Cell(int x, int y, int size, Color color) {
        set(x, y);
        this.size = size;
        this.color = color;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x * size, y * size, size, size);
    }
}
