package com.vmware.math.model;

public class Input {
    private int x;
    private int y;

    public Input() {
    }

    public Input(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Input{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
