package com.vmware.math.model;

public class Input {
    private String x;
    private String y;

    public Input() {
    }

    public Input(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
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
